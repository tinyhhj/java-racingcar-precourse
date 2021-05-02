package racingcar.domain;

public class Car {
	private String name;
	private Status status;
	private int distance;

	public Car(CarInfo info) {
		this.name = info.getName();
		this.status = info.getStatus();
	}

	public boolean isRunning() {
		return status.equals(Status.RUNNING);
	}

	public enum Status {
		STOP,RUNNING
	}

	void run() {
		this.distance++;
		this.status = Status.RUNNING;
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
}
