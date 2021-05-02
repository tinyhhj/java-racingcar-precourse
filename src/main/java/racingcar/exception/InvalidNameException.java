package racingcar.exception;

public class InvalidNameException extends RuntimeException {
	public InvalidNameException(String message) {
		super(message);
	}

	public InvalidNameException(Throwable cause) {
		super(cause);
	}
}
