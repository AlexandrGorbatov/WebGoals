package gorbatov.java.dao;

import gorbatov.java.model.SubTheme;

import java.util.List;

/**
 * Created by Alexandr on 10.09.2014.
 */
public interface SubThemeDao {
    void createTheme(SubTheme theme);

    void deleteTheme(int id);

    List getAll();
}
