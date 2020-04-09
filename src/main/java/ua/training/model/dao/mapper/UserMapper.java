package ua.training.model.dao.mapper;

import ua.training.model.entity.User;
import ua.training.model.entity.enums.ROLE;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

public class UserMapper implements ObjectMapper<User> {

    @Override
    public User extractFromResultSet(ResultSet rs) throws SQLException {
        User user = new User();
        user.setUserId(rs.getInt("idusers"));
        user.setUserFirstName(rs.getString("first_name"));
        user.setUserLastName(rs.getString("last_name"));
        user.setUserLogin(rs.getString("login"));
        user.setUserPassword(rs.getString("password"));
        //user.setUserRole(User.ROLE.valueOf(rs.getString("role")));
        String role = rs.getString("role");
        user.setUserRole(ROLE.valueOf(role == null ? "UNKNOWN" : role));

        return user;
    }

    @Override
    public User makeUnique(Map<Integer, User> cache, User user) {
        cache.putIfAbsent(user.getUserId(), user);
        return cache.get(user.getUserId());
    }
}
