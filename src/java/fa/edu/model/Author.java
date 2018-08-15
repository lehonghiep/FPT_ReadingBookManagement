package fa.edu.model;

public class Author {

    private int authorID;
    private int profileID;
    private int contactID;
    private String brief;

    public int getAuthorID() {
        return authorID;
    }

    public void setAuthorID(int authorID) {
        this.authorID = authorID;
    }

    public int getProfileID() {
        return profileID;
    }

    public void setProfileID(int profileID) {
        this.profileID = profileID;
    }

    public int getContactID() {
        return contactID;
    }

    public void setContactID(int contactID) {
        this.contactID = contactID;
    }

    public Author(int authorID, int profileID, int contactID) {
        super();
        this.authorID = authorID;
        this.profileID = profileID;
        this.contactID = contactID;
    }

    public Author() {

    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

}
