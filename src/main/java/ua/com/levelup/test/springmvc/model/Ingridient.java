package ua.com.levelup.test.springmvc.model;

import javax.persistence.*;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "ingridient")
public class Ingridient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    /**
     * TODO
     * Целесообразно уточнить от цего отталкивается цена
     * costPerKgL
     */
    private double cost;


    private String unit;//enum
    @ManyToMany
    @JoinTable(name = "ingridient_alergen",
            joinColumns = @JoinColumn(name = "ingridient_id"),
            inverseJoinColumns = @JoinColumn(name = "alergen_id"))
    private Set<Alergen> alergens;

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

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Set<Alergen> getAlergens() {
        return alergens;
    }

    public void setAlergens(Set<Alergen> alergens) {
        this.alergens = alergens;
    }
}
