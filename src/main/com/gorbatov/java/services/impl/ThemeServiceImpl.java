package gorbatov.java.services.impl;

import gorbatov.java.dao.ThemeDao;
import gorbatov.java.model.Theme;
import gorbatov.java.services.ThemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Alexandr on 08.09.2014.
 */
@Service
public class ThemeServiceImpl implements ThemeService {

    @Autowired
    private ThemeDao themeDao;

    @Override
    public void createTheme(Theme theme) {
        themeDao.createTheme(theme);
    }

    @Override
    public void deleteTheme(int id) {
        themeDao.deleteTheme(id);
    }

    @Override
    public List getAll() {
        return themeDao.getAll();
    }
}
