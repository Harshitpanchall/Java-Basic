package Interface;

public class Businessman extends Person implements Socialwork, Richman{

	@Override
	public void money() {
		System.out.println("unlimited money");
		
	}

	@Override
	public void party() {
		System.out.println("house party");
		
	}

	@Override
	public void airport() {
		System.out.println("private plain");
		
	}

	@Override
	public void works() {
		System.out.println("very high work");
		
	}

	@Override
	public void instagram() {
		System.out.println("mobile insta");
		
	}

	@Override
	public void facebook() {
		System.out.println("mobile facebook");
		
	}
	

}
