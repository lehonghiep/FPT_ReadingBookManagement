package fa.edu.model;

public class Users {
	private int id;
	private String username;
	private String password;
	private int profileID;
	private int contactID;
	private boolean roleID;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getProfileID() {
		return profileID;
	}
	public void setProfileID(int profileID) {
		this.profileID = profileID;
	}
	public int getContactID() {
		return contactID;
	}
	public void setContactID(int contactID) {
		this.contactID = contactID;
	}
	public boolean getRoleID() {
		return roleID;
	}
	public void setRoleID(boolean roleID) {
		this.roleID = roleID;
	}
	
	public Users(int id, String username, String password, int profileID, int contactID, boolean roleID) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.profileID = profileID;
		this.contactID = contactID;
		this.roleID = roleID;
	}
	
	public Users() {
		
	}
}
