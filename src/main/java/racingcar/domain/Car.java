package racingcar.domain;

public class Car {
	private static final int MIN_VALUE_TO_GO_FORWARD = 4;
	private String name;
	private Status status;
	private int distance;
	private Dice dice;

	public Car(CarInfo info) {
		this(info,new RandomDice());
	}
	public Car(CarInfo info, Dice dice) {
		this.name = info.getName();
		this.status = info.getStatus();
		this.dice  = dice;
	}

	public boolean isRunning() {
		return status.equals(Status.RUNNING);
	}

	public enum Status {
		STOP,RUNNING
	}

	public void run() {
		if (dice.roll() >= MIN_VALUE_TO_GO_FORWARD) {
			this.distance++;
			this.status = Status.RUNNING;
			return;
		}

		this.status = Status.STOP;
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(String.format("%s:",name));
		for ( int i = 0; i < distance; i++) {
			buffer.append("-");
		}
		return buffer.toString();
	}

	public int getDistance() {
		return distance;
	}
}
