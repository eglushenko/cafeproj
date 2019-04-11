package ua.com.levelup.test.springmvc.model;
// TODO переименнуйте общий пакет как в мастере, чтоб потом не было проблем со слитием
import javax.persistence.*;

@Entity
@Table(name = "global_settings")
public class GlobalSettings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    //TODO слабосмысловые названия: что такое name и value?
    private String name;
    private double value;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
