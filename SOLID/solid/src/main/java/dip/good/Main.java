package dip.good;

public class Main {
    public static void main(String[] args) {
        UserService service = new UserService(new UserJDBCDAOImpl());
        service.dao.findOne(1L);
    }
}
