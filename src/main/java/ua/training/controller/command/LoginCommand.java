package ua.training.controller.command;

import ua.training.model.dao.DaoFactory;
import ua.training.model.dao.impl.JDBCUserDao;
import ua.training.model.entity.enums.ROLE;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created on 08.04.2020 22:09.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class LoginCommand implements Command {

    private DaoFactory factory = DaoFactory.getInstance();
    private JDBCUserDao userDao = factory.createJDBCUserDao();

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        String login = request.getParameter("login");
        String pass = request.getParameter("pass");

        if (login == null || login.equals("") || pass == null || pass.equals("")) {
            //String lang = (String) request.getSession().getAttribute("lang");
            return "/login.jsp";
        }
        System.out.println(login + " " + pass);

        if (CommandUtility.checkUserIsLogged(request, login)) {
            //String lang = (String) request.getSession().getAttribute("lang");
            return "/WEB-INF/error.jsp";
        }

        if (userDao.validateUserByLoginAndPassword(login, pass) &&
                userDao.getUserByLogin(login).getUserRole().equals(ROLE.ADMIN)) {
            CommandUtility.setUserRole(request, ROLE.ADMIN, login);
            CommandUtility.addUserToLoggedUsersByLogin(request, login);
            return "redirect:/admin";
        } else if (userDao.validateUserByLoginAndPassword(login, pass) &&
                userDao.getUserByLogin(login).getUserRole().equals(ROLE.USER)) {
            CommandUtility.setUserRole(request, ROLE.USER, login);
            CommandUtility.addUserToLoggedUsersByLogin(request, login);
            return "redirect:/user";
        } else {
            CommandUtility.setUserRole(request, ROLE.UNKNOWN, login);
            //String lang = (String) request.getSession().getAttribute("lang");
            return "/login.jsp";
        }
    }
}
