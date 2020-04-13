package ua.training.model.dao.impl;

import ua.training.model.dao.UserDao;
import ua.training.model.dao.mapper.UserMapper;
import ua.training.model.entity.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

/**
 * Created on 09.04.2020 8:44.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class JDBCUserDao implements UserDao {

    private Connection connection;
    private ResourceBundle resource = ResourceBundle.getBundle("database");

    JDBCUserDao(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void create(User user) {
        try (PreparedStatement ps = connection.prepareStatement(
                resource.getString("db.create"))
        ) {
            setPrepareStatementsParameters(user, ps);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void setPrepareStatementsParameters(User user, PreparedStatement ps) throws SQLException {
        ps.setString(1, String.valueOf(user.getUserRole()));
        ps.setString(2, user.getUserFirstName());
        ps.setString(3, user.getUserLastName());
        ps.setString(4, user.getUserLogin());
        ps.setString(5, user.getUserPassword());
    }

    @Override
    public User findById(int id) {
        try (PreparedStatement ps = connection.prepareStatement(
                resource.getString("db.findById"))
        ) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            UserMapper userMapper = new UserMapper();
            if (rs.next()) {
                return userMapper.extractFromResultSet(rs);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public List<User> findAll() {
        List<User> users = new ArrayList<>();

        final String query = resource.getString("db.findAll");
        try (Statement st = connection.createStatement()) {
            ResultSet rs = st.executeQuery(query);

            UserMapper userMapper = new UserMapper();

            while (rs.next()) {
                User user = userMapper
                        .extractFromResultSet(rs);
                users.add(user);
            }
            return users;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void update(User user, int id) {
        try (PreparedStatement ps = connection.prepareStatement(
                resource.getString("db.update"))
        ) {
            setPrepareStatementsParameters(user, ps);
            ps.setInt(5, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(int id) {
        try (PreparedStatement ps = connection.prepareStatement(
                resource.getString("db.delete"))
        ) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void close() {
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean validateUserByLoginAndPassword(String login, String password) {
        User user = getUserByLogin(login);
        if (user != null) {
            return user.getUserPassword().equals(password);
        } else {
            return false;
        }
    }

    public User getUserByLogin(String login) {
        try (PreparedStatement ps = connection.prepareStatement(
                resource.getString("db.getUserByLogin"))
        ) {
            ps.setString(1, login);
            ResultSet rs = ps.executeQuery();
            UserMapper userMapper = new UserMapper();
            if (rs.next()) {
                return userMapper.extractFromResultSet(rs);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
