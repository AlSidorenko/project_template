package ua.training.model.service;

/**
 * Created on 09.04.2020 8:44.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public interface RegexContainer {
    // Cyrillic name
    String REGEX_NAME_UKR = "^[А-ЯІЇЄ][а-яіїє']{1,20}$";
    // Latin name
    String REGEX_NAME_LAT = "^[A-Z][a-z]{1,20}$";
    // Login
    String REGEX_LOGIN = "^[A-Za-z0-9_-]{8,20}$";
    //Password
    String REGEX_PASSWORD = "^[A-Za-z0-9_-]{8,20}$";
    // E-mail
    String REGEX_EMAIL = "^[A-Za-z0-9+_.-]+@(.+)$";
}
