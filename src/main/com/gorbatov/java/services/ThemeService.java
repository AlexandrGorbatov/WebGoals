package gorbatov.java.services;

import gorbatov.java.model.Theme;

import java.util.List;

/**
 * Created by Alexandr on 08.09.2014.
 */
public interface ThemeService {

    void createTheme(Theme theme);
    void deleteTheme(int id);
    List getAll();
}
