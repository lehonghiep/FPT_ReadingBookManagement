/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fa.edu.repository;

import fa.edu.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hong Hiep IT
 */
public class BookCaseRepositoryImp implements BookCaseRepository {

    @Override
    public boolean addBookToBookCase(int bookcase_id, int book_id) {
        String insert = "INSERT INTO Contain(BookCace_ID, Book_ID)\n"
                + "VALUES(?,?);";
        try (Connection c = DBConnection.getConnection();
                PreparedStatement ps = c.prepareStatement(insert)) {
            ps.setInt(1, bookcase_id);
            ps.setInt(2, book_id);
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(BookCaseRepositoryImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean checkExistInBookCase(int bookcase_id, int book_id) {
        String select = "SELECT Book_ID FROM Contain\n"
                + "WHERE BookCace_ID=? AND Book_ID=?;";

        try (Connection c = DBConnection.getConnection();
                PreparedStatement ps = c.prepareStatement(select)) {
            ps.setInt(1, bookcase_id);
            ps.setInt(2, book_id);
            return ps.executeQuery().next();
        } catch (SQLException ex) {
            Logger.getLogger(BookCaseRepositoryImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean deleteFromBookCase(int bookcase_id, int book_id) {
        String delete = "DELETE FROM Contain\n"
                + "WHERE BookCace_ID=? AND Book_ID=?;";
        try(Connection c=DBConnection.getConnection();
                PreparedStatement ps=c.prepareStatement(delete)){
            ps.setInt(1, bookcase_id);
            ps.setInt(2, book_id);
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(BookCaseRepositoryImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
