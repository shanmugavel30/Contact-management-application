package contact.insert;

public class InsertController implements ModelToController,ViewToController {
	private  ControllerToView insertview;
	private ControllerToModel insertmodel;
	
	public InsertController(InsertView insertview) {
		this.insertview=insertview;
		this.insertmodel=new InsertModel(this);
	}

	public void insertContact(String name, long phoneNo, String address, String fav) {
		insertmodel.insertContact(name,phoneNo,address,fav);
	}

	public void insertSuccess() {
		insertview.insertSuccess();
	}
	
}
