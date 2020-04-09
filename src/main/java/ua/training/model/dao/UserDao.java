package ua.training.model.dao;

import ua.training.model.entity.User;

import java.util.List;

public interface UserDao extends GenericDao<User> {
    void create (User entity);
    User findById(int id);
    List<User> findAll();
    void update(User entity, int id);
    void delete(int id);
    void close();
}
