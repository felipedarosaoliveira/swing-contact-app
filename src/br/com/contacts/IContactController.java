package br.com.contacts;

import java.util.List;

public interface IContactController {

	public boolean save();

	public List<ContactPresenter> loadContacts(String filter);

	public void load(Integer id);

	public boolean delete();

	public void create();

	public void onNameChange(String name);

	public void onEmailChange(String email);

	public void onPhoneChange(String phone);

	public void onTypeChange(ContactType currentType);

	public List<String> getContactTypes();
	
	public void setActionBarListener(ActionBarListener listener);

}
