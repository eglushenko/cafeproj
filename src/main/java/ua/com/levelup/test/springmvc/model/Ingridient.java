package ua.com.levelup.test.springmvc.model;

import javax.persistence.*;

@Entity
@Table(name = "ingridient")
public class Ingridient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String unit;
    private double cost;
}
