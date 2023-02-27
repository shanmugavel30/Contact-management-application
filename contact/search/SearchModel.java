package contact.search;

import contact.pojo.Contacts;
import contact.repository.ContactRepository;

public class SearchModel implements ControllerToModel{
	private ModelToController searchcontroller;
	
	public SearchModel(SearchController searchcontroller) {
		this.searchcontroller=searchcontroller;
	}

	public void searchContact(String name) {
		Contacts searchcontact;
		searchcontact=ContactRepository.getInstance().searchContact(name);
		if(searchcontact==null) {
			searchcontroller.searchFailed();
		}
		else {
			searchcontroller.searchSuccess(searchcontact);
		}
		
	}

	public void searchContactByNum(long phoneNo) {
		Contacts searchcontact;
		searchcontact=ContactRepository.getInstance().searchContactByNum(phoneNo);
		if(searchcontact==null) {
			searchcontroller.searchFailed();
		}
		else {
			searchcontroller.searchSuccess(searchcontact);
		}
	}
	
}
