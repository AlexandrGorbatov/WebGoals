package gorbatov.java.dao;

import gorbatov.java.model.SubTheme;
import gorbatov.java.model.Theme;

import java.util.List;

/**
 * Created by Alexandr on 08.09.2014.
 */
public interface ThemeDao {
    void createTheme(Theme theme);
    void deleteTheme(int id);
    List getAll();
}
