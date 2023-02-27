package contact.edit;

public class EditController implements ModelToController,ViewToController{
	private ControllerToView editview;
	private ControllerToModel editmodel;
	public EditController(EditView editview) {
		this.editview= editview;
		editmodel=new EditModel(this);
	}

	public void editContactByName(String name, long phoneNo) {
		editmodel.editContactByName(name,phoneNo);
	}

	public void editContactByNameFailed() {
		editview.editContactByNameFailed();
	}

	public void editContactByNameSuccess() {
		editview.editContactByNameSuccess();
	}

	public void editContactByNum(long phoneNo, String name) {
		editmodel.editContactByNum( phoneNo, name);
	}

	public void editContactByNumFailed() {
		editview.editContactByNumFailed();
	}

	public void editContactByNumSuccess() {
		editview.editContactByNumSuccess();
	}
}
