package racingcar.view;

import java.io.PrintWriter;
import java.util.Scanner;

public class RacingCarViewer {
	PrintWriter writer = new PrintWriter(System.out);
	Scanner scanner = new Scanner(System.in);

	public RacingCarViewer(PrintWriter writer, Scanner scanner) {
		this.writer = writer;
		this.scanner = scanner;
	}

	public PrintWriter getWriter() {
		return writer;
	}

	public Scanner getScanner() {
		return scanner;
	}
}
