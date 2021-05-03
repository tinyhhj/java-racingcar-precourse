package racingcar.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class RacingPlayer {
	private List<Car> players;

	public RacingPlayer() {
		this.players = new ArrayList<>();
	}

	public RacingPlayer(List<Car> players) {
		this.players = players;
	}

	public List<Car> calculateWinner() {
		int winnerDistance = getWinnerDistance();
		List<Car> winners = new ArrayList<>();
		for (Car player : players) {
			addPlayerIfWinner(winners, player,winnerDistance);
		}
		return winners;
	}

	private void addPlayerIfWinner(List<Car> winners, Car player, int winnerDistance) {
		if (winnerDistance == player.getDistance()) {
			winners.add(player);
		}
	}

	private int getWinnerDistance() {
		int winnerDistance = 0;
		for (Car player: players) {
			winnerDistance = Math.max(winnerDistance, player.getDistance());
		}
		return winnerDistance;
	}
}
