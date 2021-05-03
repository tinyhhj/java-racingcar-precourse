package racingcar.domain;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RacingPlayerTest {
	List<Car> players;

	@BeforeEach
	public void setup() {
		players = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			CarInfo info = new CarInfo("test" + i);
			players.add(new TestCar(info, 4 - i));
		}
	}

	@Test
	@DisplayName("우승자가 한명일 경우 테스트")
	public void winnerTest() {
		RacingPlayer racingPlayer = new RacingPlayer(players);
		List<Car> winners = racingPlayer.calculateWinner();

		assertThat(winners)
			.hasSize(1)
			.contains(players.get(0));
	}

	@Test
	@DisplayName("우승자가 중복일경우 테스트")
	public void winnerTest2() {
		players.add(new TestCar(new CarInfo("test5"), 4));
		RacingPlayer racingPlayer = new RacingPlayer(players);
		List<Car> winners = racingPlayer.calculateWinner();

		assertThat(winners)
			.hasSize(2)
			.containsExactly(players.get(0), players.get(5));
	}
}
