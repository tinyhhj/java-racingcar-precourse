package racingcar.util;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ParserTest {
	@Test
	public void parseInputTest() {
		Parser parser = new Parser();
		String input = "pobi,hello,test";
		String[] names = parser.parse(input);

		assertThat(names)
			.hasSize(3)
			.containsExactly("pobi","hello","test");

		input = "  pobi   , 	hello, test";
		names = parser.parse(input);
		assertThat(names)
			.hasSize(3)
			.containsExactly("pobi","hello","test");
	}
}
