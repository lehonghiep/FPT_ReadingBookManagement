package fa.edu.repository;

import fa.edu.model.Contact;
import fa.edu.model.Profiles;
import fa.edu.model.Users;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import fa.edu.util.DBConnection;
import fa.edu.pojo.*;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserRepositoryImp implements UserRepository {

    @Override
    public POJO_User getProfile(int userID) {
        String sql = "SELECT First_Name, Last_Name, Gender, Birth_date, Image_Data, Email, Phone, Authority, ID, Username, Passwords\r\n"
                + "	FROM Users JOIN Profiles ON Users.Profile_ID = Profiles.Profile_ID \r\n"
                + "			JOIN Contact ON Users.Contact_ID = Contact.Contact_ID \r\n"
                + "			JOIN Role ON Users.Role_ID = Role.Role_ID\r\n"
                + "	WHERE ID = ?";
        POJO_User user = new POJO_User();
        try {
            Connection connection = DBConnection.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, userID);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                String firstname = rs.getString("First_Name");
                String lastname = rs.getString("Last_Name");
                int gender = rs.getInt("Gender");
                String birthdate = rs.getString("Birth_Date");
                String email = rs.getString("Email");
                String phone = rs.getString("Phone");
                int userid = rs.getInt("UserID");
                String username = rs.getString("Username");
                String password = rs.getString("Passwords");
                user = new POJO_User(firstname, lastname, gender, birthdate, email, phone,
                        userid, username, password);
            }
            return user;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return user;
        }

    }

    @Override
    public Users checkLogin(String username, String password) {
        String sql = "SELECT * FROM Users WHERE Username=(?) AND Passwords=(?);";

        try (Connection connection = DBConnection.getConnection();
                PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            Users user = null;
            if (rs.next()) {
                user = new Users();
                user.setId(rs.getInt("ID"));
                user.setProfileID(rs.getInt("Profile_ID"));
                user.setContactID(rs.getInt("Contact_ID"));
                user.setRoleID(rs.getBoolean("Role_ID"));
                user.setUsername(username);
                user.setPassword(password);
            }
            return user;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean userRegister(String username, String password, Profiles profiles, Contact contact) {

        String insertUser = "INSERT INTO Users(Username, Passwords, Profile_ID, Contact_ID, Role_ID) VALUES(?,?,?,?,?);";

        try (Connection c = DBConnection.getConnection();
                PreparedStatement psUser = 
                        c.prepareStatement(insertUser, Statement.RETURN_GENERATED_KEYS);) {
            c.setAutoCommit(false);

            
            psUser.setString(1, username);
            psUser.setString(2, password);

            int profile_id = createProfile(profiles, c);
            psUser.setInt(3, profile_id);

            int contact_id = createContact(contact, c);
            psUser.setInt(4, contact_id);

            psUser.setBoolean(5, false);

            int affectedRows = psUser.executeUpdate();
            if (affectedRows == 0) {
                throw new SQLException("Creating user failed, no rows affected.");
            }
            try (ResultSet generatedKeys = psUser.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    int id=generatedKeys.getInt(1);
                    createBookCase(id, c);
                } else {
                    throw new SQLException("Creating user failed, no ID obtained.");
                }
            }
            c.commit();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UserRepositoryImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static int createProfile(Profiles profile, Connection c) throws SQLException {
        String insertProfile = "INSERT INTO Profiles(First_Name, Last_Name, Gender, Birth_date) VALUES(?,?,?,?);";
        try (PreparedStatement psProfile = c.prepareStatement(insertProfile, Statement.RETURN_GENERATED_KEYS)) {
            psProfile.setString(1, profile.getFirstName());
            psProfile.setString(2, profile.getLastName());
            psProfile.setBoolean(3, profile.isGender());
            psProfile.setDate(4, profile.getBirthDate());
            int affectedRows = psProfile.executeUpdate();
            if (affectedRows == 0) {
                throw new SQLException("Creating user failed, no rows affected.");
            }
            try (ResultSet generatedKeys = psProfile.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    return generatedKeys.getInt(1);
                } else {
                    throw new SQLException("Creating user failed, no ID obtained.");
                }
            }
        }
    }

    public static int createContact(Contact contact, Connection c) throws SQLException {
        String insertContact = "INSERT INTO Contact(Phone, Email) VALUES(?,?);";
        try (PreparedStatement psContact = c.prepareStatement(insertContact, Statement.RETURN_GENERATED_KEYS)) {
            psContact.setString(1, contact.getPhone());
            psContact.setString(2, contact.getEmail());

            int affectedRows = psContact.executeUpdate();
            if (affectedRows == 0) {
                throw new SQLException("Creating user failed, no rows affected.");
            }
            try (ResultSet generatedKeys = psContact.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    return generatedKeys.getInt(1);
                } else {
                    throw new SQLException("Creating user failed, no ID obtained.");
                }
            }
        }
    }

    public boolean createBookCase(int bookCaseId, Connection c) throws SQLException{
        String insertBookCase="INSERT INTO BookCase(BookCace_ID) VALUES(?)";
        try(PreparedStatement psBookCase=c.prepareStatement(insertBookCase)){
            psBookCase.setInt(1, bookCaseId);
            psBookCase.executeUpdate();
            return true;
        }
    }
 
}
