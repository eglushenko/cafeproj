package ua.com.levelup.test.springmvc.model;

import javax.persistence.*;

@Entity
@Table(name = "peremissions")
public class Premissions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private boolean createUser;
    private boolean createMeal;
    private boolean createPersonal;
    private boolean createIngridient;
    private boolean deleteUser;
    private boolean deleteMeal;
    private boolean deletePersonal;
    private boolean deleteIngridient;





}
