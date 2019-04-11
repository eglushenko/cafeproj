package ua.com.levelup.cafeproj.model;

import javax.persistence.*;

@Entity
@Table(name = "global_settings")
public class GlobalSettings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nameOfParameter;

    private String parameter;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNameOfParameter() {
        return nameOfParameter;
    }

    public void setNameOfParameter(String nameOfParameter) {
        this.nameOfParameter = nameOfParameter;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }
}
