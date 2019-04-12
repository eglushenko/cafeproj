package ua.com.levelup.cafeproj.model;

import javax.persistence.*;

@Entity
@Table(name = "global_settings")
public class GlobalSettings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nameOfParameter")
    private String nameOfParameter;

    @Column(name = "parameterValue")
    private String parameterValue;

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

    public String getParameterValue() {
        return parameterValue;
    }

    public void setParameterValue(String parameterValue) {
        this.parameterValue = parameterValue;
    }
}
