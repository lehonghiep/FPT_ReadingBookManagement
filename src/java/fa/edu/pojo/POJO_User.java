package fa.edu.pojo;

public class POJO_User extends POJO_Person{
	private int userid;
	private String username;
	private String password;
	
	public POJO_User() {super();}
	public POJO_User(String firstname, String lastname, int gender, String birthdate, String email, String phone,
			int userid, String username, String password) {
		super(firstname, lastname, gender, birthdate, email, phone);
		this.userid = userid;
		this.username = username;
		this.password = password;
	}
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
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
	
	
	
	
	
}
