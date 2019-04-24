package ua.com.levelup.cafeproj.model;

import ua.com.levelup.cafeproj.enums.AlergenAcronim;

import javax.persistence.*;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "alergen")
public class Alergen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Ingredient> ingredients = new ArrayList<>();

    @Enumerated(EnumType.STRING)
    private AlergenAcronim alergenAcronim;

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

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public AlergenAcronim getAlergenAcronim() {
        return alergenAcronim;
    }

    public void setAlergenAcronim(AlergenAcronim alergenAcronim) {
        this.alergenAcronim = alergenAcronim;
    }
}
