package ua.training.model.dao;

import ua.training.model.entity.User;

import java.util.List;

/**
 * Created on 09.04.2020 8:44.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public interface UserDao extends GenericDao<User> {

    void create (User entity);
    User findById(int id);
    List<User> findAll();
    void update(User entity, int id);
    void delete(int id);
    void close();
}
