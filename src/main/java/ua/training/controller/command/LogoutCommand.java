package ua.training.controller.command;

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
public class LogoutCommand implements Command {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        String context = (String) request.getServletContext().getAttribute("login");
        CommandUtility.logUserOut(request, context);
        CommandUtility.setUserRole(request, ROLE.UNKNOWN, "UNKNOWN");
        return "redirect:/main";
    }
}
