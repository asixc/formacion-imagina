package srp.good;

public class UserLogin {

    public User login(String userName, String password) {
    	
        //User user = db.findUserByUserNameAndPassword(userName, password);
    	User user = new User();
        if (user == null) {
            // do something
        }

        return user;
    }
}