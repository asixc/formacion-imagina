package dip.good;

public class UserService {

    UserJDBCDAO dao;

    UserService (UserJDBCDAO dao) {
        this.dao = dao;
    }

    void findOne(Long id) {
    	dao.findOne(id);
    	// dao.findOne(Long id);
    	
    }
}
