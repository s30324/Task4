public class User {
public String name;
public String lname;
public String eMail;
public String password;
private boolean isGuestAccount;
public User(String name, String lname, String eMail, String password) {
this.name = name;
this.lname = lname;
this.eMail = eMail;
this.password = password;
this.isGuestAccount = false;
}
public User(String eMail) {
this.eMail = eMail;
this.isGuestAccount = true;
}

public void guestToUser(String name, String lname, String password){
if(isGuestAccount){
this.name = name;
this.lname = lname;
this.password = password;
this.isGuestAccount = false;
}
}
}
