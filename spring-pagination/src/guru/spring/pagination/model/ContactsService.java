package guru.spring.pagination.model;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author Srisarguru
 *
 */
public class ContactsService {

	private Contact newContact(String id, String name, String phoneno){
		Contact  contact = new Contact (id,name,phoneno);
		return contact;
	}
	
	public List<Contact> buildContactList(){
		List<Contact> contactList = new ArrayList();
		contactList.add(newContact("1","Jamie", "955-555-6666"));
		contactList.add(newContact("2","Steve", "777-854-6666"));
		contactList.add(newContact("3","Marshal", "859-555-6666"));
		contactList.add(newContact("4","Greg", "966-555-6666"));
		contactList.add(newContact("5","Josh", "777-555-8747"));
		contactList.add(newContact("6","Kate", "874-754-6666"));
		return contactList;
		
	}
}
