package racingcar.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class RacingPlayerTest {

	@Test
	public void winnerTest() {
		List<Car> players = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			CarInfo info = new CarInfo("test"+i);
			players.add(new TestCar(info,4-i));
		}
		RacingPlayer racingPlayer = new RacingPlayer(players);
		List<Car> winners = racingPlayer.calculateWinner();

	}
}
