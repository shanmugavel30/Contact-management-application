package contact.edit;

public interface ViewToController {

	void editContactByName(String name, long phoneNo);

	void editContactByNum(long phoneNo, String name);

}
