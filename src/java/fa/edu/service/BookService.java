/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fa.edu.service;

import fa.edu.model.Book;
import fa.edu.model.Category;
import fa.edu.model.Contact;
import fa.edu.model.Profiles;
import fa.edu.model.Publisher;
import fa.edu.repository.BookRepository;
import fa.edu.repository.BookRepositoryImp;
import fa.edu.vo.AuthorVO;
import fa.edu.vo.BookVO;
import java.io.InputStream;
import java.util.List;

/**
 *
 * @author Hong Hiep IT
 */
public class BookService {

    public static BookRepository repository = new BookRepositoryImp();

    public static List<Book> getListAllListBook() {
        return repository.getAllListBook();
    }

    public static Book getBookById(String bookID) {
        int id = Integer.valueOf(bookID);
        return repository.getBookById(id);
    }

    public static BookVO getBookVOById(String bookID) {
        int id = Integer.valueOf(bookID);
        return repository.getBookVOById(id);
    }

    public static byte[] getImageBook(String bookId) {
        int id = Integer.valueOf(bookId);
        return repository.getImageBook(id);
    }

    public static List<Book> getListBookInBookCase(int id) {
        return repository.getListBookInBookCase(id);
    }

    public static List<BookVO> getAllListBookVO() {
        return repository.getAllListBookVO();
    }
    public static List<AuthorVO> getAllListAuthorVO(){
        return repository.getAllListAuthorVO();
    }
    
    public static List<Category> getAllListCategory(){
        return repository.getAllListCategory();
    }
    
    public static List<Publisher> getAllPublisher(){
        return repository.getAllPublisher();
    }

    public static boolean addNewBook(String title, String brief, String content, int publisherId, int authorId, int categoryId, InputStream inputStream) {
        Book book=new Book();
        book.setTitle(title);
        book.setBrief(brief);
        book.setContent(content);
        book.setAuthorID(authorId);
        book.setCategoryID(categoryId);
        book.setPublisherID(publisherId);
        book.setImageBook(inputStream);
        
        return repository.addNewBook(book);
    }

    public static boolean deleteBook(int bookId) {
        return repository.deleteBook(bookId);
    }

    public static boolean createAuthor(Profiles profiles, Contact contact, String brief) {
        return repository.createAuthor(profiles, contact, brief); //To change body of generated methods, choose Tools | Templates.
    }

    public static boolean createPublisher(Contact contact, String publisherName) {
        return repository.createPublisher(contact, publisherName);
    }

    public static boolean createCategory(Category category) {
        return repository.createCategory(category);
    }
}
