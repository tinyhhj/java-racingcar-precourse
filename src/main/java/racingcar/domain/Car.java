package racingcar.domain;

public class Car {
	private String name;
	private Status status = Status.STOP;

	public Car(String name) {
		this.name = name;
	}

	public boolean isRunning() {
		return status.equals(Status.RUNNING);
	}

	public enum Status {
		STOP,RUNNING
	}

	void run() {
		this.status = Status.RUNNING;
	}
}
