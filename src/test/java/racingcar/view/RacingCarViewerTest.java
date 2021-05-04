package racingcar.view;

import static org.assertj.core.api.Assertions.*;

import java.io.PrintWriter;
import java.util.Scanner;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RacingCarViewerTest {
	@Test
	@DisplayName("사용자 input 테스트")
	public void viewTest() {
		String names = "hello,test,benz,super";
		String count = "6";
		Scanner inputScanner = new Scanner(String.format("%s\n%s\n",names,count));
		RacingCarViewer viewer = new RacingCarViewer(new PrintWriter(System.out,true), inputScanner);

		String carNames = viewer.askCarName();
		assertThat(carNames).isEqualTo(names);

		String turnCount = viewer.askRacingTurnCount();
		assertThat(turnCount).isEqualTo(count);
	}
}
