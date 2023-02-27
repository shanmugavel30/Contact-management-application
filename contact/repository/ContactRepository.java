package contact.repository;

import java.util.HashMap;
import java.util.Map;


import contact.pojo.Contacts;

public class ContactRepository {
	private static ContactRepository contactInstance;
	public Map<Integer,Contacts>contactDetails=new HashMap<>();
	private Contacts contactref;
	public boolean flag = true;
	
	private ContactRepository() {
		
	}
	
	public static ContactRepository getInstance() {
		if(contactInstance==null) {
			contactInstance=new ContactRepository();
			contactInstance.setContacts();
		}
		return contactInstance;
	}
	
	public void setContacts() {
		contactref = new Contacts("Selvam",8870837890L,"Pudhumanai 5th Street,Tenkasi","yes");
		contactDetails.put(1,contactref);
		contactref = new Contacts("Vijay",7989258909L,"Thamarabarani Street,Ambai","yes");
		contactDetails.put(2, contactref);
		contactref = new Contacts("Guru",8568905349L,"Pillaiyar kovil Street,Srivilli puttur","no");
		contactDetails.put(3, contactref);
		contactref = new Contacts("Dani",635468909L,"ThalavaiAmman Street,PalayamKottai","yes");
		contactDetails.put(4, contactref);
		contactref = new Contacts("Deva",8925438909L,"VeeraVanjiNathan Street,Tirunelveli","no");
		contactDetails.put(5, contactref);
		contactref = new Contacts("Bala",8940640656L,"Kamarajar Street,Viruthunagar","yes");
		contactDetails.put(6, contactref);
		contactref = new Contacts("Siva",9889258909L,"Periyar Street,VaikalPlam","yes");
		contactDetails.put(7, contactref);
		contactref = new Contacts("Thavamani",6389296909L,"Agashthiyar Street,Kadayam","no");
		contactDetails.put(8, contactref);
		contactref = new Contacts("Sathish",6989768909L,"Anaikarai Street,Melakaram","yes");
		contactDetails.put(9, contactref);
		contactref = new Contacts("Abhishek",9345258909L,"Thamarabarani Street,Ambai","no");
		contactDetails.put(10, contactref);
				
	}

	public Contacts searchContact(String name) {
		Contacts searchcontacts;
		for (Map.Entry<Integer, Contacts> entry : contactDetails.entrySet()) {

			if ( entry.getValue().getName().equalsIgnoreCase(name)) {

			    searchcontacts=entry.getValue();
				return searchcontacts;
			}
		}
		return  null;
	}

	public Contacts searchContactByNum(long phoneNo) {
		Contacts searchcontacts;
		for (Map.Entry<Integer, Contacts> entry : contactDetails.entrySet()) {

			if ( entry.getValue().getPhoneNo()==phoneNo) {

			    searchcontacts=entry.getValue();
				return searchcontacts;
			}
		}
		return  null;
	}

	public void insertContact(String name, long phoneNo, String address, String fav) {
		contactref = new Contacts(name,phoneNo,address,fav);
		contactDetails.put(contactDetails.size()+1, contactref);
	}

	public void editContactByName(String name, long phoneNo) {
		
		for (Map.Entry<Integer, Contacts> entry : contactDetails.entrySet()) {

			if ( entry.getValue().getName().equalsIgnoreCase(name)) {
				entry.getValue().setPhoneNo(phoneNo);
				flag=false;
			}
		}
	}

	public void editContactByNum(long phoneNo, String name) {
		for (Map.Entry<Integer, Contacts> entry : contactDetails.entrySet()) {

			if ( entry.getValue().getPhoneNo()==phoneNo) {
				entry.getValue().setName(name);
				flag=false;
			}
		}
		
	}

	public void DeleteContact(String name) {
		int key=0;
		for (Map.Entry<Integer, Contacts> entry : contactDetails.entrySet()) {

			if ( entry.getValue().getName().equalsIgnoreCase(name)) {
				key=entry.getKey();
				flag=false;
			}
		}
		if(contactDetails.containsKey(key)) {
			if(key!=0) {
				contactDetails.remove(key);
			}
			
		}
	}

	public void deleteAllContact() {
		contactDetails.clear();
	}
	
	
}
