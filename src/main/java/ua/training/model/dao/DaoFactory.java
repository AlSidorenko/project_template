package ua.training.model.dao;

import ua.training.model.dao.impl.JDBCDaoFactory;
import ua.training.model.dao.impl.JDBCUserDao;

/**
 * Created on 09.04.2020 17:26.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public abstract class DaoFactory {

    private static DaoFactory daoFactory;
    public abstract JDBCUserDao createJDBCUserDao();

    public static DaoFactory getInstance() {
        if (daoFactory == null) {
            synchronized (DaoFactory.class) {
                if (daoFactory == null) {
                    DaoFactory temp = new JDBCDaoFactory();
                    daoFactory = temp;
                }
            }
        }
        return daoFactory;
    }
}
