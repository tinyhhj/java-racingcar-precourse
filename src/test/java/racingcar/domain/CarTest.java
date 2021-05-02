package racingcar.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import racingcar.exception.InvalidNameException;

public class CarTest {
	CarInfo info;
	@BeforeEach
	public void setup() {
		info = new CarInfo("test");
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
		String name = "testcar";
		String path = "--";
		Car car = new Car(info);
		car.run();
		car.run();
		assertThat(car.toString()).isEqualTo(String.format("%s:%s",name,path));

		path = "-----";
		car = new Car(info);
		car.run();
		car.run();
		car.run();
		car.run();
		car.run();
		assertThat(car.toString()).isEqualTo(String.format("%s:%s",name,path));
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

}
