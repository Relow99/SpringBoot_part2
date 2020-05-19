package Model;

public class User {
    private long UserId;
    private String UserName;
    private String UserSurname;

//CONSTRUCTOR
    public User(long id, String name, String surname) {
    }
//    Getter
    public long getUserId() {
        return UserId;
    }
//   Setter
    public void setUserId(long userId) {

        this.UserId = UserId;
    }

    public String getUserName() {
        return UserName;
    }
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }
    public String getUserSurname() {
        return UserSurname;
    }
    public void setUserSurname(String UserSurname) {
        this.UserSurname = UserSurname;
    }

}
