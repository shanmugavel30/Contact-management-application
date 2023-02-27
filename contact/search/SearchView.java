package contact.search;

import java.util.Scanner;

import contact.login.LoginView;
import contact.pojo.Contacts;

public class SearchView implements ControllerToView {
	private ViewToController searchcontroller;
	private Scanner scan =new Scanner(System.in);
	
	public SearchView() {
		searchcontroller = new SearchController(this);
	}
	
	public void searchContact() {
		System.out.println("\n1.Name\n2.PhoneNo\n3.Exit");
		System.out.println();
		System.out.println("Enter the option:");
		int option=scan.nextInt();
		if(option==1) {
			scan.nextLine();
			System.out.println("Enter  the Name of contact:");
			String name=scan.nextLine();
			searchcontroller.searchcontact(name);
		}
		else if(option==2) {
			scan.nextLine();
			while(true) {
			     System.out.println("Enter  the PhoneNumber of contact:");
			     long phoneNo=scan.nextLong();
			     if(String.valueOf(phoneNo).length()==10) {
			        searchcontroller.searchContactByNum(phoneNo);
			        break;
			     }
			}
		}
		else {
			System.out.println("*** You are exitted from the search page ***");
			LoginView ref =new LoginView();
			ref.options();
		}
		
	}

	public void searchFailed() {
		System.out.println("No contacts available according to this name...!");
		System.out.println("Please search by another name...-->");
		searchContact();
	}

	public void searchSuccess(Contacts searchcontact) {
		System.out.printf("\nName      :%-20s",searchcontact.getName());
		System.out.printf("\nPhone No  :%-20s",searchcontact.getPhoneNo());
		System.out.printf("\nAddress   :%-30s",searchcontact.getAddress());
		System.out.printf("\nFavourite :%-10s",searchcontact.getFavState());
		System.out.println();
		System.out.println("Returning to home page...!");
		System.out.println();
		
		LoginView ref =new LoginView();
		ref.options();
	}
	
	
}
