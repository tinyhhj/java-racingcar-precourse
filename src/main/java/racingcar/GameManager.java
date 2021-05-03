package racingcar;

import racingcar.domain.RacingGame;
import racingcar.util.Parser;
import racingcar.view.RacingCarViewer;

public class GameManager {
	public static void main(String[] args) {
		RacingCarViewer viewer = new RacingCarViewer();
		Parser parser = new Parser();
		RacingGame game = new RacingGame(viewer, parser);
		game.start();
	}
}
