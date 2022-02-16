package dip.good;

public class UserJDBCDAOImpl implements UserJDBCDAO{


    @Override
    public void findOne(Long id) {
        System.out.println(String.format("Finding user id: %s", id));
    }
}
