package contact.search;

import contact.pojo.Contacts;

public interface ControllerToView {

	void searchFailed();

	void searchSuccess(Contacts searchcontact);

}
