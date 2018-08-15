/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fa.edu.vo;

import java.sql.Date;

/**
 *
 * @author Hong Hiep IT
 */
public class AuthorVO {
    private int authorID;
    private String fullName;
    private Date birthday;

    public AuthorVO(int authorID, String fullName, Date birthday) {
        this.authorID = authorID;
        this.fullName = fullName;
        this.birthday = birthday;
    }

    public AuthorVO() {
    }

    public int getAuthorID() {
        return authorID;
    }

    public void setAuthorID(int authorID) {
        this.authorID = authorID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    
}
