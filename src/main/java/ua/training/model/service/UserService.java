package ua.training.model.service;

import ua.training.model.dao.DaoFactory;
import ua.training.model.entity.User;

import static ua.training.model.service.RegexContainer.*;

/**
 * Created on 09.04.2020 8:44.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class UserService {

    DaoFactory daoFactory = DaoFactory.getInstance();

    public boolean validateData(User user){
        return false;
    }

    public static boolean validateUserInfoWithRegEx(User user) {
        return user.getUserFirstName().matches(REGEX_NAME_LAT) &&
                user.getUserLastName().matches(REGEX_NAME_LAT) &&
                user.getUserLogin().matches(REGEX_LOGIN) &&
                user.getUserPassword().matches(REGEX_PASSWORD);
    }
}
