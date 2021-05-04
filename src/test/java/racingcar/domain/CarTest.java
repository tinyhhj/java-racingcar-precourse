package racingcar.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
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
	@DisplayName("플레이어 Stop 상태 테스트")
	public void carStatusStopTest() {
		Car car = new Car(info);
		assertThat(car.isRunning()).isFalse();
	}

	@Test
	@DisplayName("플레이어 Running 상태 테스트")
	public void carStatusRunningTest() {
		CarInfo info = new CarInfo(name,Car.Status.RUNNING);
		Car car = new Car(info);
		car.run();
		assertThat(car.isRunning()).isTrue();
	}

	@Test
	@DisplayName("플레이어 현재상태 출력 테스트")
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
	@DisplayName("플레이어 이름 검증 테스트")
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
	@DisplayName("플레이어 Run메소드 테스트")
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
