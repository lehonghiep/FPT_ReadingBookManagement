package fa.edu.model;

public class Contact {
	private int contactID;
	private String phone;
	private String email;
	
	public int getContactID() {
		return contactID;
	}
	public void setContactID(int contactID) {
		this.contactID = contactID;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Contact(int contactID, String phone, String email) {
		super();
		this.contactID = contactID;
		this.phone = phone;
		this.email = email;
	}
	
	public Contact() {
		
	}
}
