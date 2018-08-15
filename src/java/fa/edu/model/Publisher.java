package fa.edu.model;

public class Publisher {
	private int publisherID;
	private int contactID;
	private String publisherName;
	
	public int getPublisherID() {
		return publisherID;
	}
	public void setPublisherID(int publisherID) {
		this.publisherID = publisherID;
	}
	
	public int getContactID() {
		return contactID;
	}
	public void setContactID(int contactID) {
		this.contactID = contactID;
	}
	
	public String getPublisherName() {
		return publisherName;
	}
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	
	public Publisher(int publisherID, int contactID, String publisherName) {
		super();
		this.publisherID = publisherID;
		this.contactID = contactID;
		this.publisherName = publisherName;
	}
	
	public Publisher() {
		
	}
}
