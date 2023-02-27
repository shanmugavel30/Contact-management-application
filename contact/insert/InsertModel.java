package contact.insert;

import contact.repository.ContactRepository;

public class InsertModel implements ControllerToModel{
	private ModelToController insertcontroller;
	
	public InsertModel(InsertController insertcontroller) {
		this.insertcontroller=insertcontroller;
	}

	public void insertContact(String name, long phoneNo, String address, String fav) {
		ContactRepository.getInstance().insertContact(name,phoneNo,address,fav);
		insertcontroller.insertSuccess();
	}
}
