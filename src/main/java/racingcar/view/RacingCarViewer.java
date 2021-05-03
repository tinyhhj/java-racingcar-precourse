package racingcar.view;

import java.io.PrintWriter;
import java.util.Scanner;

import racingcar.util.MessageContainer;

public class RacingCarViewer {
	PrintWriter writer = new PrintWriter(System.out, true);
	Scanner scanner = new Scanner(System.in);

	public RacingCarViewer() {
	}

	public RacingCarViewer(PrintWriter writer, Scanner scanner) {
		this.writer = writer;
		this.scanner = scanner;
	}

	public String askCarName() {
		writer.println(MessageContainer.ASK_CARNAME_INPUT_MESSAGE);
		return scanner.nextLine();
	}

	public String askRacingTurnCount() {
		writer.println(MessageContainer.ASK_RACING_TURN_COUNT);
		return scanner.nextLine();
	}

	public void showGameResult(String[] winners) {
		writer.println(String.format(MessageContainer.GAME_RESULT_MESSAGE, String.join(",", winners)));
	}

	public void println(String message) {
		writer.println(message);
	}
}
