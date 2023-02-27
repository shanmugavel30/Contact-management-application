package contact.edit;

public interface ControllerToModel {

	void editContactByName(String name, long phoneNo);

	void editContactByNum(long phoneNo, String name);

}
