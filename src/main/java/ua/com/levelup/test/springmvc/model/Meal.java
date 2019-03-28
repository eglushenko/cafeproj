package ua.com.levelup.test.springmvc.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "meal")
public class Meal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Ingridient> ingridients = new ArrayList<Ingridient>();
    private double ingrigientWeight;
    private double procentOfTax;
    private double cost;// Имеет ли смысл хранить сумму сгенерированую единожды из ингридиентов и наценки и пересчет по запросу
    private double preparationTime;

}
