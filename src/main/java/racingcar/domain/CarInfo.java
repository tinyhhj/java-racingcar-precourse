package racingcar.domain;

import racingcar.exception.InvalidNameException;

public class CarInfo {
	public static final int MAX_NAME_LENGTH = 5;

	private String name;
	private Car.Status status;

	public CarInfo(String name) {
		this(name, Car.Status.STOP);
	}

	public CarInfo(String name, Car.Status status) {
		this.name = name;
		this.status = status;
		validate();
	}

	public String getName() {
		return name;
	}

	public Car.Status getStatus() {
		return status;
	}

	private boolean isValidName() {
		return name.trim().length() <= MAX_NAME_LENGTH;
	}

	private void validate() {
		if (!isValidName()) {
			throw new InvalidNameException(String.format("Invalid Name: %s", name));
		}
	}
}
