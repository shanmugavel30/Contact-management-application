package contact.delete;

import contact.repository.ContactRepository;

public class DeleteModel implements ControllerToModel{
	private ModelToController delcontroller;
	
	public DeleteModel(DeleteController delcontroller) {
		this.delcontroller =  delcontroller;
	}

	public void deleteContact(String name) {
		ContactRepository.getInstance().DeleteContact(name);
		if(ContactRepository.getInstance().flag) {
			delcontroller.deleteContactFailed();
		}
		else {
			delcontroller.deleteContactSuccess();
		}
	}

	public void deleteAllContact() {
		ContactRepository.getInstance().deleteAllContact();
		delcontroller.deleteAllContactSuccess();
	}
}
