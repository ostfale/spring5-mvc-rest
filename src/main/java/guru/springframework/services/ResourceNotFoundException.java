package guru.springframework.services;

/**
 * Implementation of Exception Handling
 * Created : 06.04.2018
 *
 * @author : usauerbrei
 */
public class ResourceNotFoundException extends RuntimeException {

	public ResourceNotFoundException() {
	}

	public ResourceNotFoundException(String message) {
		super(message);
	}

	protected ResourceNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public ResourceNotFoundException(Throwable cause) {
		super(cause);
	}

	public ResourceNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
