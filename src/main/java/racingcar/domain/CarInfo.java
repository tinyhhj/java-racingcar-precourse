package racingcar.domain;

public class CarInfo {
	private String name;
	private Car.Status status;

	public CarInfo(String name) {
		this(name,Car.Status.STOP);
	}
	public CarInfo(String name, Car.Status status) {
		this.name = name;
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public Car.Status getStatus() {
		return status;
	}
}
