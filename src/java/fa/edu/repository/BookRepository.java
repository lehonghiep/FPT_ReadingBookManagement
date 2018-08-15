/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fa.edu.repository;

import fa.edu.model.Book;
import fa.edu.model.Category;
import fa.edu.model.Contact;
import fa.edu.model.Profiles;
import fa.edu.model.Publisher;
import fa.edu.vo.AuthorVO;
import fa.edu.vo.BookVO;
import java.util.List;

/**
 *
 * @author Hong Hiep IT
 */
public interface BookRepository {
    List<Book> getAllListBook();

    Book getBookById(int bookID);
    
    BookVO getBookVOById(int bookID);
    
    byte[] getImageBook(int bookId);
    
    List<BookVO> getAllListBookVO();
    
    List<Book> getListBookInBookCase(int id);
    
    List<AuthorVO> getAllListAuthorVO();
    
    List<Category> getAllListCategory();
    
    List<Publisher> getAllPublisher();
    
    boolean addNewBook(Book book);
    
    boolean deleteBook(int bookId);

    public boolean createAuthor(Profiles profiles, Contact contact, String brief);

    public boolean createPublisher(Contact contact, String publisherName);

    public boolean createCategory(Category category);
}
