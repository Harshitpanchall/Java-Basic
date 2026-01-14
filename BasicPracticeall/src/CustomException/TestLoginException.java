package CustomException;

public class TestLoginException {
	public static void main(String[] args) throws Exception {
		
		String name = "Harshit";
		if(name == "harshit") {
			System.out.println("user not found");
			
		}else {
			try{
				throw new LoginException();	
			}catch(LoginException e) {
				System.out.println(e);
				
			}finally {
				System.out.println("hello");
			}
		}
	}
	

}
