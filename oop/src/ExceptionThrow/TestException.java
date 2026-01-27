package ExceptionThrow;

public class TestException {
	public static void main(String[] args) {
		
		String login = "admin";
		
		if(login == "admins") {
			System.out.println("user found");
			
		}else {
			
		}
		try {
			throw new LoginException();
		}catch(LoginException e) {
			System.out.println(e.getMessage());
			
		}finally {
			System.out.println("user is finally");
		}
		
	}

}
