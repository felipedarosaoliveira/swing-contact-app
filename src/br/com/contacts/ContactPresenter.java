package br.com.contacts;

public class ContactPresenter {
	
	private Integer id;
	private String name;
	private String email;
	private String phone;
	private String type;
	
	public ContactPresenter() {}
	private ContactPresenter(Contact contact) {
		if(contact != null) {
			this.id = contact.getId();
			this.name = contact.getName();
			this.email = contact.getEmail();
			this.phone = contact.getPhone();
			this.type = contact.getType() != null ?contact.getType().name():null;
			
		}
	}
	
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	@Override
	public String toString() {
		return "ContactPresenter [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", type="
				+ type + ", getId()=" + getId() + ", getName()=" + getName() + ", getEmail()=" + getEmail()
				+ ", getPhone()=" + getPhone() + ", getType()=" + getType() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	public static ContactPresenter from(Contact contact) {
		return new ContactPresenter(contact);
	}

}
