package racingcar.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import racingcar.exception.InvalidNameException;

public class CarTest {
	String name = "test";
	CarInfo info;
	@BeforeEach
	public void setup() {
		info = new CarInfo(name);
	}
	@Test
	public void carStatusStopTest() {
		Car car = new Car(info);
		assertThat(car.isRunning()).isFalse();
	}

	@Test
	public void carStatusRunningTest() {
		Car car = new Car(info);
		car.run();
		assertThat(car.isRunning()).isTrue();
	}

	@Test
	public void carStatusViewTest() {
		String path = "-*";
		Car car = new Car(info);
		car.run();
		car.run();
		assertThat(car.toString()).matches(String.format("%s:%s",name,path));

		car = new Car(info);
		car.run();
		car.run();
		car.run();
		car.run();
		car.run();
		assertThat(car.toString()).matches(String.format("%s:%s",name,path));
	}

	@Test
	public void carNameTest() {
		String validName = "valid";
		String invalidName = "invalid";
		CarInfo validInfo = new CarInfo(validName);
		assertThatThrownBy(()->{
			CarInfo invalidInfo = new CarInfo(invalidName);
		}).isInstanceOf(InvalidNameException.class)
			.hasMessage(String.format("Invalid Name: %s",invalidName));
	}


	@Test
	public void carRandomRunTest() {
		Car car = new Car(info);
		car.run();
		car.run();
		car.run();
		car.run();
		car.run();

		assertThat(car.getDistance()).isLessThan(6);
	}
}
