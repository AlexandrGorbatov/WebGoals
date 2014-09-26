package gorbatov.java.dao.impl;

import gorbatov.java.dao.ThemeDao;
import gorbatov.java.model.Theme;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Alexandr on 08.09.2014.
 */
@Repository
public class ThemeDaoImpl implements ThemeDao {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return this.sessionFactory.getCurrentSession();
    }


    @Override
    public void createTheme(Theme theme) {
        if (theme != null) {
            Session currentSession = getCurrentSession();
            currentSession.saveOrUpdate(theme);
        }
    }

    @Override
    public void deleteTheme(int id) {
        Theme product = (Theme) getCurrentSession().load(Theme.class, id);
        getCurrentSession().delete(product);
    }

    @Override
    public List getAll() {
        Query query = getCurrentSession().createQuery("from Theme");
        return query.list();
    }
}
