package br.com.contacts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ContactRepository {
	
	private static List<Contact> contacts = new ArrayList<>();
	private static Integer nextId = 1;

	public List<Contact> findAll(){
		return Collections.unmodifiableList(contacts);
	}
	
	public Contact findById(Integer id) {
		if(id != null) {
			return contacts.stream().filter( contact -> id.equals(contact.getId())).findFirst().orElse(null);			
		}
		return null;
	}
	
	public boolean insert(Contact contact) {
		if(contact != null) {
			contact.setId(nextId++);
		}
		return contacts.add(contact);
	}
	
	public boolean update(Contact contact) {
		boolean result = true;
		contacts = contacts.stream().map((current) -> current.getId().equals(contact.getId()) ? contact: current).toList();
		return result;
	}
	
	public boolean delete(Integer id) {
		if(id == null ) {
			return false;
		}
		Contact contact = findById(id);
		return contacts.remove(contact);
	}
	

}
