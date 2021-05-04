package racingcar.util;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ParserTest {
	Parser parser;
	@BeforeEach
	public void setup() {
		parser = new Parser();
	}
	@Test
	@DisplayName("플레이어 이름 파싱 테스트")
	public void parseInputTest() {
		String input = "pobi,hello,test";
		String[] names = parser.parse(input);

		assertThat(names)
			.hasSize(3)
			.containsExactly("pobi","hello","test");


	}
	@Test
	@DisplayName("플레이어 이름 빈칸포함 파싱 테스트")
	public void parseInputWithSpaceTest() {
		String input = "  pobi   , 	hello, test";
		String[] names = parser.parse(input);
		assertThat(names)
			.hasSize(3)
			.containsExactly("pobi","hello","test");
	}

}
