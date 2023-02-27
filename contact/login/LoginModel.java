package contact.login;

public class LoginModel implements ControllerToModel{
	private ModelToController logincontroller;
	
	public LoginModel(LoginController logincontroller) {
		this.logincontroller= logincontroller;
	}

	public void checkUser(String name, String password) {
		if(name.equalsIgnoreCase("shanmugavel") && password.equalsIgnoreCase("selvam@20")) {
			logincontroller.loginSuccessful();
		}
		else {
			logincontroller.loginFailed();
		}
	}

}
