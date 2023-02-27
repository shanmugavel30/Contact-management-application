package contact.insert;

import java.util.Scanner;

import contact.login.LoginView;

public class InsertView implements ControllerToView{
	private ViewToController insertcontroller;
	private Scanner scan =new Scanner(System.in);
	
	public InsertView() {
		insertcontroller=new InsertController(this);
	}

	public void insertContacts() {
		System.out.println("#---Here you can add the contacts---#");
		System.out.println();
		long phoneNo;
		System.out.println("Enter the name: ");
		String name=scan.next();
		while(true) {
		     System.out.println("Enter  the PhoneNumber of contact:");
		     phoneNo=scan.nextLong();
		     if(String.valueOf(phoneNo).length()==10) {
		        break;
		     }
		}
		System.out.println("Enter the address:");
		String address=scan.next();
		System.out.println("Enter the favourite state:");
		scan.nextLine();
		String fav=scan.nextLine();
		insertcontroller.insertContact(name,phoneNo,address,fav);
	}

	public void insertSuccess() {
		System.out.println("Contact  inserted successfully---!");
		LoginView ref =new LoginView();
		ref.options();
	}
	
	
}
