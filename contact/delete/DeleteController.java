package contact.delete;

public class DeleteController implements ModelToController,ViewToController{
	private ControllerToView delview;
	private ControllerToModel delmodel;
	
	public DeleteController(DeleteView delview) {
		this.delview=delview;
		delmodel = new DeleteModel(this);
	}

	public void deleteContact(String name) {
		delmodel.deleteContact(name);
	}

	public void deleteContactFailed() {
		delview.deleteContactFailed();
	}

	public void deleteContactSuccess() {
		delview.deleteContactSuccess();
	}

	public void deleteAllContact() {
		delmodel.deleteAllContact();
	}

	public void deleteAllContactSuccess() {
		delview.deleteAllContactSuccess();
	}
}
