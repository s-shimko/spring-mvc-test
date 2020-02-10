package unit.tests;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import system.dao.UserDao;
import system.model.User;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
public class UserServiceTest {

    @Test
    public void createUserTest() {
        log.info("Test started");
        UserDao userDao = new UserDao();
        User user = new User("name" + new Date().getTime(), "pass");
        userDao.createUser(user);
        User lastUser = userDao.getLastUser();
        System.out.println(lastUser.toString());
        log.info(lastUser.toString());
        assertEquals(user, lastUser);
    }
}