package contact.login;

public class LoginController implements ModelToController,ViewToController{
	private ControllerToView loginview;
	private ControllerToModel loginmodel;
	
	public LoginController(LoginView loginview) {
		this.loginview=loginview;
		loginmodel= new LoginModel(this);
	}

	public void checkUser(String name, String password) {
		loginmodel.checkUser(name,password);
	}

	public void loginSuccessful() {
		loginview.loginSuccessful();
	}

	public void loginFailed() {
		loginview.loginFailed();
	}

}
