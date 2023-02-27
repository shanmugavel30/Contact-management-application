package contact.search;

import contact.pojo.Contacts;

public interface ModelToController {

	void searchFailed();

	void searchSuccess(Contacts searchcontact);

}
