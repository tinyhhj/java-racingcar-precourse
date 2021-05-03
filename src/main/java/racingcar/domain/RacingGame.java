package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

import racingcar.exception.InvalidTurnCountException;
import racingcar.exception.RacingCarException;
import racingcar.util.MessageContainer;
import racingcar.util.Parser;
import racingcar.view.RacingCarViewer;

public class RacingGame extends Game {
	RacingCarViewer viewer;
	GameStatus status;
	Parser parser;
	RacingPlayer players;
	int turnCount;

	public RacingGame(RacingCarViewer viewer, Parser parser) {
		this.viewer = viewer;
		this.parser = parser;
	}

	@Override
	protected void result() {
		List<Car> winners = players.calculateWinner();
		String[] winnerNames = new String[winners.size()];
		int idx = 0;
		for (Car winner : winners) {
			winnerNames[idx++] = winner.getName();
		}
		this.viewer.showGameResult(winnerNames);
	}

	@Override
	protected void run() {
		this.viewer.println(MessageContainer.GAME_RESULT_HEADER);
		for (int i = 0; i < turnCount; i++) {
			next();
			this.viewer.println(MessageContainer.NEW_LINE);
		}
	}

	private void next() {
		for (Car player : players.getPlayers()) {
			player.run();
			this.viewer.println(player.toString());
		}
	}

	@Override
	protected void init() {
		changeStatus(GameStatus.INIT);
		do {
			initializeGame();
		} while (status.equals(GameStatus.INIT));
	}

	private void changeStatus(GameStatus status) {
		this.status = status;
	}

	private void initializeGame() {
		try {
			addPlayers(this.viewer.askCarName());
			setTurnCount(this.viewer.askRacingTurnCount());
			changeStatus(GameStatus.RUN);
		} catch (RacingCarException e) {
			this.viewer.println(e.getMessage());
		}
	}

	private void setTurnCount(String turnCount) {
		try {
			this.turnCount = Integer.parseInt(turnCount);
		} catch (Exception e) {
			throw new InvalidTurnCountException(String.format("Invalid TurnCount: %s", turnCount));
		}
	}

	private void addPlayers(String input) {
		String[] playerNames = parser.parse(input);
		List<Car> players = new ArrayList<>();
		for (String playerName : playerNames) {
			players.add(new Car(new CarInfo(playerName)));
		}
		this.players = new RacingPlayer(players);
	}

	enum GameStatus {
		INIT, RUN, FINISH
	}
}
