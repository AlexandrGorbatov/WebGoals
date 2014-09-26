package gorbatov.java.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Alexandr on 08.09.2014.
 */
@Entity
@Table(name = "theme")
public class Theme implements java.io.Serializable {

    @Id
    private int id;
    private String name;
    private String description;
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "them_id")
    private List<SubTheme> subThemes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<SubTheme> getSubThemes() {
        return subThemes;
    }

    public void setSubThemes(List<SubTheme> subThemes) {
        this.subThemes = subThemes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Theme)) return false;

        Theme theme = (Theme) o;

        return id == theme.id;

    }

    @Override
    public int hashCode() {
        return id;
    }
}
