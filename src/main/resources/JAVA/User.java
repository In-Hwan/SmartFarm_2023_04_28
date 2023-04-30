
import javax.xml.crypto.Data;

public class User {
    private String UserID;
    private String UserName;
    private String UserPassword;
    private String email;
    private Data Created_at;

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserPassword() {
        return UserPassword;
    }

    public void setUserPassword(String userPassword) {
        UserPassword = userPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Data getCreated_at() {
        return Created_at;
    }

    public void setCreated_at(Data created_at) {
        Created_at = created_at;
    }

}