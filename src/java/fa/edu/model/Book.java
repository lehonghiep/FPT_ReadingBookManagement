package fa.edu.model;

import java.io.InputStream;

public class Book {
	private int bookID;
	private String title;
	private String brief;
	private String content;
	private int publisherID;
	private int authorID;
	private int categoryID;
	private InputStream imageBook;
	public int getBookID() {
		return bookID;
	}
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public int getPublisherID() {
		return publisherID;
	}
	public void setPublisherID(int publisherID) {
		this.publisherID = publisherID;
	}
	
	public int getAuthorID() {
		return authorID;
	}
	public void setAuthorID(int authorID) {
		this.authorID = authorID;
	}
	
	public int getCategoryID() {
		return categoryID;
	}
	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}
	
	public Book(int bookID, String title, String brief, String content, int publisherID, int authorID, int categoryID) {
		super();
		this.bookID = bookID;
		this.title = title;
		this.brief = brief;
		this.content = content;
		this.publisherID = publisherID;
		this.authorID = authorID;
		this.categoryID = categoryID;
	}
	
	public Book() {
		
	}

    public InputStream getImageBook() {
        return imageBook;
    }

    public void setImageBook(InputStream imageBook) {
        this.imageBook = imageBook;
    }
        
}
