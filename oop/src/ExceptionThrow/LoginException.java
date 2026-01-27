package ExceptionThrow;

public class LoginException extends RuntimeException {
	public LoginException() {
		super("user not found");
		
	}

}
