package fa.edu.model;

import java.util.Date;

public class Contain {
	private int bookCaseID;
	private int bookID;
	private Date createDate;
	
	public int getBookCaseID() {
		return bookCaseID;
	}
	public void setBookCaseID(int bookCaseID) {
		this.bookCaseID = bookCaseID;
	}
	
	public int getBookID() {
		return bookID;
	}
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	public Contain(int bookCaseID, int bookID, Date createDate) {
		super();
		this.bookCaseID = bookCaseID;
		this.bookID = bookID;
		this.createDate = createDate;
	}
	
	public Contain() {
		
	}
}
