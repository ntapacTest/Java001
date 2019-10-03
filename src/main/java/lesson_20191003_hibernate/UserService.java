package lesson_20191003_hibernate;

import java.util.List;

public class UserService {
    UserDao userDao=new UserDao();

    public User findById(int id) {
        return userDao.findById(id);
    }

    public void save(User user) {
        userDao.save(user);
    }

    public void update(User user) {
        userDao.update(user);
    }

    public void delete(User user) {
        userDao.delete(user);
    }

    public List<User> findAll() {
        return userDao.findAll();
    }

}
