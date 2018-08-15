/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fa.edu.service;

import fa.edu.model.Contact;
import fa.edu.model.Profiles;
import fa.edu.model.Users;
import fa.edu.repository.UserRepository;
import fa.edu.repository.UserRepositoryImp;


/**
 *
 * @author Hong Hiep IT
 */
public class UserService {

    private static UserRepository repository;
    
    static{
        repository = new UserRepositoryImp();
    }

    public static Users checkLogin(String username, String password) {
        return repository.checkLogin(username, password);
    }

    public static boolean userRegister(String username, String password, Profiles profile, Contact contact){
        return repository.userRegister(username, password, profile, contact);
    }
    
    
}
