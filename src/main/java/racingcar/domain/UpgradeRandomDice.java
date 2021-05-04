package racingcar.domain;

import java.util.Random;

public class UpgradeRandomDice implements Dice {
	private static final int UPGRADE_MAX_VALUE= 15;

	@Override
	public int roll() {
		Random random = new Random();
		return random.nextInt(UPGRADE_MAX_VALUE);
	}
}
