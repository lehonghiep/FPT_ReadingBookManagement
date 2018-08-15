package fa.edu.model;

public class Role {
	private boolean roleID;
	private String authority;
	
	public boolean isRoleID() {
		return roleID;
	}
	public void setRoleID(boolean roleID) {
		this.roleID = roleID;
	}
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	
	public Role(boolean roleID, String authority) {
		super();
		this.roleID = roleID;
		this.authority = authority;
	}
	
	public Role() {
		
	}
}
