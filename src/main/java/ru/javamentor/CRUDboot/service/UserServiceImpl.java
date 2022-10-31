package ru.javamentor.CRUDboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.javamentor.CRUDboot.Dao.UserDao;
import ru.javamentor.CRUDboot.model.User;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService{


    @Autowired
    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public List<User> getAllUsers() {
        return userDao.getUsers();
    }

    @Override
    public User getUserById(long id) {
        return userDao.getUserById(id);
    }

    @Override
    public User delete(long id) {
        User user = null;
        try {
            user = userDao.deleteUser(id);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public void create(User user) {
        userDao.createUser(user);
    }

    @Override
    public void update(int id, User user) {
        userDao.updateUser(user);
    }


}
