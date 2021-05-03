package racingcar.domain;

public abstract class Game {
	private String name;

	public void start() {
		init();
		run();
		result();
	}

	protected abstract void result();

	protected abstract void run();

	protected abstract void init();
}
