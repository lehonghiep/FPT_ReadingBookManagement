package fa.edu.pojo;

public class POJO_Author extends POJO_Person {
	private int authorid;

	public POJO_Author(String firstname, String lastname, int gender, String birthdate, String email, String phone,
			int authorid) {
		super(firstname, lastname, gender, birthdate, email, phone);
		this.authorid = authorid;
	}

	public int getAuthorid() {
		return authorid;
	}

	public void setAuthorid(int authorid) {
		this.authorid = authorid;
	}
	
	
	
}
