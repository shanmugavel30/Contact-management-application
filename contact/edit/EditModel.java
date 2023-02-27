package contact.edit;

import contact.repository.ContactRepository;

public class EditModel implements ControllerToModel{
	private ModelToController editcontroller;
	
	public EditModel(EditController editcontroller) {
		this.editcontroller= editcontroller;
	}

	public void editContactByName(String name, long phoneNo) {
		ContactRepository.getInstance().editContactByName(name,phoneNo);
		if(ContactRepository.getInstance().flag) {
			editcontroller.editContactByNameFailed();
		}
		else {
			editcontroller.editContactByNameSuccess();
		}
	}

	public void editContactByNum(long phoneNo, String name) {
		ContactRepository.getInstance().editContactByNum( phoneNo,name);
		if(ContactRepository.getInstance().flag) {
			editcontroller.editContactByNumFailed();
		}
		else {
			editcontroller.editContactByNumSuccess();
		}
	}
}
