package ru.javamentor.CRUDboot.service;

import ru.javamentor.CRUDboot.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(long id);
    User delete(long id);
    void create(User user);
    void update(int id, User user);
}
