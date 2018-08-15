package fa.edu.model;

public class BookCase {
	private int bookCaseID;
	private String bookCaseName;
	
	public int getBookCaseID() {
		return bookCaseID;
	}
	public void setBookCaseID(int bookCaseID) {
		this.bookCaseID = bookCaseID;
	}
	
	public String getBookCaseName() {
		return bookCaseName;
	}
	public void setBookCaseName(String bookCaseName) {
		this.bookCaseName = bookCaseName;
	}
	
	public BookCase(int bookCaseID, String bookCaseName) {
		super();
		this.bookCaseID = bookCaseID;
		this.bookCaseName = bookCaseName;
	}
	
	public BookCase() {
		
	}
}
