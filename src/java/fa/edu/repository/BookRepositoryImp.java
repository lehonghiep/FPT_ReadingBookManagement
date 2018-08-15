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
import fa.edu.util.DBConnection;
import fa.edu.vo.AuthorVO;
import fa.edu.vo.BookVO;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hong Hiep IT
 */
public class BookRepositoryImp implements BookRepository {
    
    @Override
    public List<Book> getAllListBook() {
        List<Book> list = new ArrayList<>();
        String select = "SELECT * FROM BOOK";
        try (Connection c = DBConnection.getConnection(); PreparedStatement ps = c.prepareStatement(select)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Book book = new Book(rs.getInt("Book_ID"),
                        rs.getString("Title"),
                        rs.getString("Brief"),
                        rs.getString("Content"),
                        rs.getInt("Publisher_ID"),
                        rs.getInt("Author_ID"),
                        rs.getInt("Category_ID"));
                
                list.add(book);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BookRepositoryImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    @Override
    public Book getBookById(int bookID) {
        String select = "SELECT * FROM Book WHERE Book_ID=?;";
        try (Connection c = DBConnection.getConnection(); PreparedStatement ps = c.prepareStatement(select)) {
            ps.setInt(1, bookID);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                Book book = new Book();
                book.setBookID(rs.getInt("Book_ID"));
                book.setTitle(rs.getString("Title"));
                book.setBrief(rs.getString("Brief"));
                book.setContent(rs.getString("Content"));
                book.setPublisherID(rs.getInt("Publisher_ID"));
                book.setAuthorID(rs.getInt("Author_ID"));
                book.setCategoryID(rs.getInt("Category_ID"));
                
                return book;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(BookRepositoryImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    @Override
    public BookVO getBookVOById(int bookID) {
        String select = "SELECT * FROM V_BookVO WHERE Book_ID=?";
        try (Connection c = DBConnection.getConnection();
                PreparedStatement ps = c.prepareStatement(select)) {
            ps.setInt(1, bookID);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                BookVO bookVO = new BookVO();
                bookVO.setBookID(bookID);
                bookVO.setTitle(rs.getString("Title"));
                bookVO.setBrief(rs.getString("Brief"));
                bookVO.setContent(rs.getString("Content"));
                bookVO.setPublisherName(rs.getString("Publisher_Name"));
                bookVO.setAuthorName(rs.getString("FullName"));
                bookVO.setCategoryName(rs.getString("Category_Name"));
                
                return bookVO;
            }
        } catch (SQLException ex) {
            Logger.getLogger(BookRepositoryImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public byte[] getImageBook(int bookId) {
        String select = "SELECT Book_Image FROM BOOK WHERE Book_ID=?;";
        try (Connection c = DBConnection.getConnection();
                PreparedStatement p = c.prepareStatement(select)) {
            p.setInt(1, bookId);
            ResultSet rs = p.executeQuery();
            if (rs.next()) {
                return rs.getBytes("Book_Image");
            }
        } catch (SQLException ex) {
            Logger.getLogger(BookRepositoryImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public boolean updateImageBook(InputStream inputStream, int bookId) {
        String update = "UPDATE Book SET Book_Image = ? WHERE Book_ID=?;";
        try (Connection c = DBConnection.getConnection(); PreparedStatement ps = c.prepareStatement(update)) {
            ps.setBinaryStream(1, inputStream);
            ps.setInt(2, bookId);
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(BookRepositoryImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        
        InputStream inputStream = new FileInputStream(new File("download_1.jpg"));
        
        String update = "UPDATE Book SET Book_Image = ? WHERE Book_ID=?;";
        try (Connection c = DBConnection.getConnection(); PreparedStatement ps = c.prepareStatement(update)) {
            ps.setBinaryStream(1, inputStream);
            ps.setInt(2, 18);
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(BookRepositoryImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    @Override
    public List<Book> getListBookInBookCase(int id) {
        List<Book> list = new ArrayList<>();
        String select = "SELECT Book.* FROM Contain JOIN BookCase ON BookCase.BookCace_ID=Contain.BookCace_ID\n"
                + "JOIN Book ON Contain.Book_ID=Book.Book_ID\n"
                + "WHERE BookCase.BookCace_ID=?";
        
        try (Connection c = DBConnection.getConnection();
                PreparedStatement ps = c.prepareStatement(select)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Book book = new Book(rs.getInt("Book_ID"),
                        rs.getString("Title"),
                        rs.getString("Brief"),
                        rs.getString("Content"),
                        rs.getInt("Publisher_ID"),
                        rs.getInt("Author_ID"),
                        rs.getInt("Category_ID"));
                list.add(book);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BookRepositoryImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    @Override
    public List<BookVO> getAllListBookVO() {
        List<BookVO> list = new ArrayList<>();
        String select = "SELECT * FROM V_BookVO;";
        try (Connection c = DBConnection.getConnection();
                PreparedStatement ps = c.prepareStatement(select)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                BookVO bookVO = new BookVO();
                bookVO.setBookID(rs.getInt("Book_ID"));
                bookVO.setTitle(rs.getString("Title"));
                bookVO.setBrief(rs.getString("Brief"));
                bookVO.setContent(rs.getString("Content"));
                bookVO.setPublisherName(rs.getString("Publisher_Name"));
                bookVO.setAuthorName(rs.getString("FullName"));
                bookVO.setCategoryName(rs.getString("Category_Name"));
                
                list.add(bookVO);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BookRepositoryImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    @Override
    public List<AuthorVO> getAllListAuthorVO() {
        List<AuthorVO> list = new ArrayList<>();
        String select = "SELECT * FROM V_AuthorVO;";
        try (Connection c = DBConnection.getConnection();
                PreparedStatement ps = c.prepareStatement(select)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                AuthorVO authorVO = new AuthorVO();
                authorVO.setAuthorID(rs.getInt("Author_ID"));
                authorVO.setFullName(rs.getString("FullName"));
                authorVO.setBirthday(rs.getDate("Birth_date"));
                
                list.add(authorVO);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(BookRepositoryImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    @Override
    public List<Category> getAllListCategory() {
        List<Category> list = new ArrayList<>();
        String select = "SELECT * FROM Category;";
        try (Connection c = DBConnection.getConnection();
                PreparedStatement ps = c.prepareStatement(select)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Category category = new Category();
                category.setCategoryID(rs.getInt("Category_ID"));
                category.setCategoryName(rs.getString("Category_Name"));
                
                list.add(category);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BookRepositoryImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    @Override
    public List<Publisher> getAllPublisher() {
        List<Publisher> list = new ArrayList<>();
        String select = "SELECT * FROM Publisher;";
        try (Connection c = DBConnection.getConnection();
                PreparedStatement ps = c.prepareStatement(select)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Publisher publisher = new Publisher();
                publisher.setPublisherID(rs.getInt("Publisher_ID"));
                publisher.setPublisherName(rs.getString("Publisher_Name"));
                publisher.setContactID(rs.getInt("Contact_ID"));
                
                list.add(publisher);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BookRepositoryImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    @Override
    public boolean addNewBook(Book book) {
        String insert = "INSERT INTO Book(Title, Brief, Content, Publisher_ID, Author_ID, Category_ID, Book_Image)\n"
                + "VALUES (?,?,?,?,?,?,?);";
        try (Connection c = DBConnection.getConnection();
                PreparedStatement ps = c.prepareStatement(insert)) {
            ps.setString(1, book.getTitle());
            ps.setString(2, book.getBrief());
            ps.setString(3, book.getContent());
            ps.setInt(4, book.getPublisherID());
            ps.setInt(5, book.getAuthorID());
            ps.setInt(6, book.getCategoryID());
            InputStream in = book.getImageBook();
            
            ps.setBinaryStream(7, in);
            
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(BookRepositoryImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    @Override
    public boolean deleteBook(int bookId) {
        String deleteContain = "DELETE FROM Contain WHERE Book_ID=?;";
        String deleteBook = "DELETE FROM Book WHERE Book_ID=?;";
        
        try (Connection c = DBConnection.getConnection();
                PreparedStatement psContain = c.prepareStatement(deleteContain);
                PreparedStatement psBook = c.prepareStatement(deleteBook)) {
            
            c.setAutoCommit(false);
            psContain.setInt(1, bookId);
            psBook.setInt(1, bookId);
            
            psContain.executeUpdate();
            psBook.executeUpdate();
            c.commit();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(BookRepositoryImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    @Override
    public boolean createAuthor(Profiles profiles, Contact contact, String brief) {
        String insert = "INSERT INTO Author\n"
                + "(Profile_ID, Contact_ID, brief) VALUES(?,?,?);";
        try (Connection c = DBConnection.getConnection(); PreparedStatement ps = c.prepareStatement(insert)) {
            c.setAutoCommit(false);
            
            int profile_id = UserRepositoryImp.createProfile(profiles, c);
            int contact_id = UserRepositoryImp.createContact(contact, c);
            
            ps.setInt(1, profile_id);
            ps.setInt(2, contact_id);
            ps.setString(3, brief);
            ps.executeUpdate();
            c.commit();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(BookRepositoryImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    @Override
    public boolean createPublisher(Contact contact, String publisherName) {
        String insert = "INSERT INTO Publisher\n"
                + "(Publisher_Name, Contact_ID) VALUES(?,?);";
        
        try (Connection c = DBConnection.getConnection();
                PreparedStatement ps = c.prepareStatement(insert)) {
            c.setAutoCommit(false);
            int contact_id = UserRepositoryImp.createContact(contact, c);
            
            ps.setString(1, publisherName);
            ps.setInt(2, contact_id);
            
            ps.executeUpdate();
            c.commit();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(BookRepositoryImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    @Override
    public boolean createCategory(Category category) {
        String insert = "INSERT INTO Category\n"
                + "(Category_Name) VALUES(?);";
        try (Connection c = DBConnection.getConnection(); PreparedStatement ps = c.prepareStatement(insert)) {
            ps.setString(1, category.getCategoryName());
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(BookRepositoryImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
}
