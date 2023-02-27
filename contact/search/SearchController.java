package contact.search;

import contact.pojo.Contacts;

public class SearchController implements ModelToController,ViewToController{
	private ControllerToView searchview;
	private ControllerToModel searchmodel;
	
	public SearchController(SearchView searchview) {
		this.searchview = searchview;
		this.searchmodel = new SearchModel(this);
	}

	public void searchcontact(String name) {
		searchmodel.searchContact(name);
	}

	public void searchFailed() {
		searchview.searchFailed();
	}

	public void searchSuccess(Contacts searchcontact) {
		searchview.searchSuccess(searchcontact);
	}

	public void searchContactByNum(long phoneNo) {
		searchmodel.searchContactByNum(phoneNo);
	}
}
