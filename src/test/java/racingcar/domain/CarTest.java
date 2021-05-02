package racingcar.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CarTest {
	@Test
	public void carStatusStopTest() {
		Car car = new Car("testcar");
		assertThat(car.isRunning()).isFalse();
	}

	@Test
	public void carStatusRunningTest() {
		Car car = new Car("testcar");
		car.run();
		assertThat(car.isRunning()).isTrue();
	}

	@Test
	public void carStatusViewTest() {
		String name = "testcar";
		String path = "--";
		Car car = new Car(name);
		car.run();
		car.run();
		assertThat(car.toString()).isEqualTo(String.format("%s:%s",name,path));

		path = "-----";
		car = new Car(name);
		car.run();
		car.run();
		car.run();
		car.run();
		car.run();
		assertThat(car.toString()).isEqualTo(String.format("%s:%s",name,path));
	}
}
