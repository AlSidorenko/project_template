package ua.training.model.entity.enums;

/**
 * Created on 08.04.2020 19:36.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public enum ROLE {

    ADMIN("ADMIN"),
    USER("USER"),
    UNKNOWN("UNKNOWN");

    private String role;

    ROLE(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}
