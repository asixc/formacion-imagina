package srp.bad;

public class UserLogin {

    User login(String userName, String password) {
    	
        //User user = db.findUserByUserNameAndPassword(userName, password);
    	User user = new User();
        if (user == null) {
            // do something
        }
        // login process..
        this.sendEmail(user, "Successfull login");
        
        return user;
    }
    
    void sendEmail(User user, String msg) {
        // sending email to user
    	String email = user.getEmail();
    	// ....
    }
}
