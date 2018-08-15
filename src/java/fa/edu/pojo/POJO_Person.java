package fa.edu.pojo;

public class POJO_Person {
	private String firstname;
	private String lastname;
	private int gender; //1 = male, 0 = female
	private String birthdate;
	private String email;
	private String Phone;
	//Image goes here
	public POJO_Person() {}
	public POJO_Person(String firstname, String lastname, int gender, String birthdate, String email, String phone) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
		this.birthdate = birthdate;
		this.email = email;
		this.Phone = phone;
	}
	
	//getter setter
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	
	
	
}
