package contact.login;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import contact.delete.DeleteView;
import contact.edit.EditView;
import contact.insert.InsertView;
import contact.search.SearchView;

public class LoginView implements ControllerToView{
	private ViewToController logincontroller;
	private Scanner scan=new Scanner(System.in);
	
	public LoginView() {
		logincontroller=new LoginController(this);
	}
	public static void main(String[] args) {

		LoginView reference= new LoginView();
		reference.login();
		
	}
	private void login() {
		System.out.println("!...Welcome to contact management website...!");
		System.out.println("\n1.Login\n2.Exit");
		System.out.println("Enter the option: ");
		int choice= scan.nextInt();
		if(choice==1) {
			System.out.println("Enter your name:");
			String name=scan.next();
			System.out.println("Enter your password:");
			String password=scan.next();
			logincontroller.checkUser(name,password);
		}
		else {
			System.out.println("You are exitted from the website");
		}
	}
	public void loginSuccessful() {
		System.out.println("You are logged in successfully...!");
		options();
	}
	
	public void loginFailed() {
		System.out.println("You are failed to login...!");
		login();
	}
	public void options() {
		System.out.println("\n1.Search contact\n2.Insert contact \n3.Remove contact \n4.Edit contact\n5.Exit");
		System.out.println("Please enter your option:");
		int option=scan.nextInt();
		if(option==1) {
			SearchView linktosearch =new SearchView();
			linktosearch.searchContact();
		}
		else if(option==2) {
			InsertView linktoinsert = new InsertView();
			linktoinsert.insertContacts();		
		}
		else if(option==3) {
			DeleteView linktodel = new DeleteView();
			linktodel.deleteContact();
		}
		else if(option ==4) {
			EditView linktoedit = new EditView();
			linktoedit.editContact();
		}
		else {
			System.out.println("You are exitted from the website...!");
			System.out.println("Thank you--->Come again<----");
		}
	}
}
