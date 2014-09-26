package gorbatov.java.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Alexandr on 08.09.2014.
 */
@Entity
@Table(name = "sub_theme")
public class SubTheme implements java.io.Serializable {
    @Id
    private int id;
    private String name;
    @Temporal(TemporalType.TIMESTAMP)
    private Date startData;
    @Temporal(TemporalType.TIMESTAMP)
    private Date enaData;
    private boolean isFinished;


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

    public Date getStartData() {
        return startData;
    }

    public void setStartData(Date startData) {
        this.startData = startData;
    }

    public Date getEnaData() {
        return enaData;
    }

    public void setEnaData(Date enaData) {
        this.enaData = enaData;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean isFinished) {
        this.isFinished = isFinished;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SubTheme)) return false;

        SubTheme subTheme = (SubTheme) o;

        return id == subTheme.id;

    }

    @Override
    public int hashCode() {
        return id;
    }
}

