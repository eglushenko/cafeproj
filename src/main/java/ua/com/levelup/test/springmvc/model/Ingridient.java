package ua.com.levelup.test.springmvc.model;

import ua.com.levelup.test.springmvc.enums.UnitsEnum;

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

    private double costPerUnit;

    @Enumerated(EnumType.STRING)
    private UnitsEnum unit;

//TODO прописать каскадность для всех связей типа @ManyToMany
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

    public UnitsEnum getUnit() {
        return unit;
    }

    public void setUnit(UnitsEnum unit) {
        this.unit = unit;
    }

    public double getCostPerUnit() {
        return costPerUnit;
    }

    public void setCostPerUnit(double costPerUnit) {
        this.costPerUnit = costPerUnit;
    }

    public Set<Alergen> getAlergens() {
        return alergens;
    }

    public void setAlergens(Set<Alergen> alergens) {
        this.alergens = alergens;
    }
}
