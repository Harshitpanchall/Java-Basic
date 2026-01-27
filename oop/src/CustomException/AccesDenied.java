package CustomException;

public class AccesDenied extends RuntimeException{
	public AccesDenied(String msg) { /// create constuctor in custom exception
		super(msg);
	}

}
