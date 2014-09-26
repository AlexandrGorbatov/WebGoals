package gorbatov.java.dao.impl;

import gorbatov.java.dao.SubThemeDao;
import gorbatov.java.model.SubTheme;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Alexandr on 10.09.2014.
 */
public class SubThemeDaoImpl implements SubThemeDao {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return this.sessionFactory.getCurrentSession();
    }

    @Override
    public void createTheme(SubTheme subTheme) {
        if (subTheme != null) {
            Session currentSession = getCurrentSession();
            currentSession.saveOrUpdate(subTheme);
        }
    }

    @Override
    public void deleteTheme(int id) {
        Session currentSession = getCurrentSession();
        currentSession.delete(id);
    }

    @Override
    public List getAll() {
        Query query = getCurrentSession().createQuery("from SubTheme");
        return query.list();
    }
}
