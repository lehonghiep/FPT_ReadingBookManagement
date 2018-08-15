package fa.edu.repository;
import fa.edu.model.Contact;
import fa.edu.model.Profiles;
import fa.edu.model.Users;
import fa.edu.pojo.*;

public interface UserRepository {
	POJO_User getProfile(int userID);
        Users checkLogin(String username, String password);
        boolean userRegister(String username, String password, Profiles profiles, Contact contact);
}