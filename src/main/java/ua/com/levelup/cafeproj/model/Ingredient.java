package ua.com.levelup.cafeproj.model;

import ua.com.levelup.cafeproj.enums.Units;

import javax.persistence.*;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "ingredient")
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private double costPerUnit;

    @Enumerated(EnumType.STRING)
    private Units unit;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name ="ingredients_id")
    private List<DishIngredient> dishIngredientList = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "ingredient_alergen",
            joinColumns = @JoinColumn(name = "ingredient_id"),
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

    public Units getUnit() {
        return unit;
    }

    public void setUnit(Units unit) {
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

    public List<DishIngredient> getDishIngredientList() {
        return dishIngredientList;
    }

    public void setDishIngredientList(List<DishIngredient> dishIngredientList) {
        this.dishIngredientList = dishIngredientList;
    }
}
