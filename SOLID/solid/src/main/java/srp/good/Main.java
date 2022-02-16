package srp.good;

public class Main {

    // In a real case, a bean would be used to avoid multiple instances.
    static UserLogin userLogin = new UserLogin();
    static MailService mailService = new MailService();

    public static void main(String[] args) {
        User user = userLogin.login("usuario", "password");
        mailService.sendEmail(user,"Successfull login");
    }

}
