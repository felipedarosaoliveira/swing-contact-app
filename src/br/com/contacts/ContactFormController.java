package br.com.contacts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContactFormController implements IContactController{
	
	private Contact contact = new Contact();
	private ContactRepository repository = new ContactRepository();
	private ActionBarListener actionBarListener;
	
	
	public void setActionBarListener(ActionBarListener listener) {
		this.actionBarListener = listener;
	}
	
	

	@Override
	public boolean save() {
		if(contact.getId() != null) {
			return repository.update(contact);
		}
		return repository.insert(contact);
	}

	@Override
	public List<ContactPresenter> loadContacts(String filter) {
		List<Contact> contacts = repository.findAll();
		if(contacts != null) {
			return contacts.stream().map((contact)-> ContactPresenter.from(contact)).toList();
		}
		return null;
	}

	@Override
	public void load(Integer id) {
		contact = repository.findById(id);
	}

	@Override
	public boolean delete() {
		return contact != null ? repository.delete(contact.getId()) : false;
	}

	@Override
	public void create() {
		contact = new Contact();
		
	}

	@Override
	public void onNameChange(String name) {
		System.out.println("Name is "+name);
		if(contact != null) {
			contact.setName(name);
		}
		
	}

	@Override
	public void onEmailChange(String email) {
		System.out.println("Email is "+email);
		if(contact != null) {
			contact.setEmail(email);
		}
		
	}

	@Override
	public void onPhoneChange(String phone) {
		System.out.println("Phone is "+phone);
		if(contact != null) {
			contact.setPhone(phone);
		}
		
	}
	@Override
	public void onTypeChange(ContactType currentType) {
		System.out.println("ContactType is "+currentType);
		if(contact != null) {
			contact.setType(currentType);
		}
	}
	
	@Override
	public List<String> getContactTypes(){
		List<String> result = new ArrayList<>();
		result.add("");
		result.addAll(Arrays.stream(ContactType.values()).map((i)-> i.name()).toList());
		return result;
	}
	
	

}
