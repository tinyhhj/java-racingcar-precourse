package racingcar.util;

public class Parser {
	private static final String SPACE = "\\s*";
	private static String DELIMITER = SPACE + "," + SPACE;

	public String[] parse(String input) {
		return input.trim().split(DELIMITER);
	}
}
