package ua.com.levelup.test.springmvc.model;

import javax.persistence.*;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "alergen")
public class Alergen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @ManyToMany(mappedBy = "alergens")
    private List<Ingridient> ingridients = new ArrayList<>();
    private String alergenAcronim;

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

    public List<Ingridient> getIngridients() {
        return ingridients;
    }

    public void setIngridients(List<Ingridient> ingridients) {
        this.ingridients = ingridients;
    }
}
