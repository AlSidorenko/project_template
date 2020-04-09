package ua.training.controller.command;

import ua.training.model.dao.DaoFactory;
import ua.training.model.dao.impl.JDBCUserDao;
import ua.training.model.entity.User;
import ua.training.model.entity.enums.ROLE;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created on 08.04.2020 22:49.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class RegistrationCommand implements Command {

    private DaoFactory factory = DaoFactory.getInstance();
    private JDBCUserDao userDao = factory.createJDBCUserDao();

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        String firstName = request.getParameter("first_name");
        String lastName = request.getParameter("last_name");
        String login = request.getParameter("login");
        String password = request.getParameter("password");

        if (firstName == null || firstName.equals("") || lastName == null || lastName.equals("") || login == null
                || login.equals("") || password == null || password.equals("")) {
            //System.out.println("Not");
            //String lang = (String) request.getSession().getAttribute("lang");
            return "/registration.jsp";
        }
        System.out.println(firstName + " " + lastName + " " + login + " " + password);

        User user = new User();

        //user.setUserRoleFromDB(ROLE.USER.getRole());
        user.setUserRole(ROLE.USER);
        user.setUserFirstName(firstName);
        user.setUserLastName(lastName);
        user.setUserLogin(login);
        user.setUserPassword(password);

        /*if (UserService.validateUserInfoWithRegEx(user) && !(CommandUtility.checkUserIsLogged(request, login))) {
            userDao.create(user);
            CommandUtility.setUserRole(request, ROLE.USER, user.getUserLogin());
            CommandUtility.addUserToLoggedUsersByLogin(request, user.getUserLogin());
            //String lang = (String) request.getSession().getAttribute("lang");
            //return "/WEB-INF/user/user.jsp";
            return "redirect:/user";
        } else {
            //String lang = (String) request.getSession().getAttribute("lang");
            return "/registration.jsp";
        }*/

        userDao.create(user);
        CommandUtility.setUserRole(request, ROLE.USER, user.getUserLogin());
        CommandUtility.addUserToLoggedUsersByLogin(request, user.getUserLogin());
        //String lang = (String) request.getSession().getAttribute("lang");
        return "redirect:/user";
    }
}
