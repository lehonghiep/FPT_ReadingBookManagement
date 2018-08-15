package fa.edu.model;

import java.sql.Date;

public class Profiles {
	private int profileID;
	private String firstName;
	private String lastName;
	private boolean gender;
	private Date birthDate;
	private byte[] imageData;
	
	public int getProfileID() {
		return profileID;
	}
	public void setProfileID(int profileID) {
		this.profileID = profileID;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public byte[] getImageData() {
		return imageData;
	}
	public void setImageData(byte[] imageData) {
		this.imageData = imageData;
	}
	
	public Profiles(int profileID, String firstName, String lastName, boolean gender, Date birthDate, byte[] imageData) {
		super();
		this.profileID = profileID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.birthDate = birthDate;
		this.imageData = imageData;
	}
	
	public Profiles() {
		
	}
}
