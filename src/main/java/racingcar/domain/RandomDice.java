package racingcar.domain;

import java.util.Random;

public class RandomDice implements Dice{

	@Override
	public int roll() {
		Random generator = new Random();
		return generator.nextInt(MAX_VALUE);
	}
}
