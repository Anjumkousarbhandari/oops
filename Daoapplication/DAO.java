
public class DAO {
	
	Details [] details = new Details[20];
	private Details[] name;
	public static void main(String[]args) {
		
	}
	public  String saveByname="Ateeq";
	public String saveBypassword="1234";
	public String saveByemail="Asshu452@gmail.com";
	
	void register (Details details, int index) {
		Details[] Details = name;
		Details [index++]=details;
		
	}
	void login(String email, String password){
		for(int i=0; i<details.length; i++) {
			if (details[i].getEmail.equals(email) && details[i].getPassword.equals(password)) {
				System.out.println("login success");
				return;
			}
		}
	System.out.println("login fail");
	}
}

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			