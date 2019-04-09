package ua.com.levelup.test.springmvc.model;

import ua.com.levelup.test.springmvc.enums.RoleEnum;

import javax.persistence.*;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Enumerated(EnumType.STRING)
    private RoleEnum name;
    /**
     * TODO
     * Одно и то же разрешение могут иметь разные роли... many to many
     */
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private List<Premissions> premissions = new ArrayList<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public RoleEnum getName() {
        return name;
    }

    public void setName(RoleEnum name) {
        this.name = name;
    }

    public List<Premissions> getPremissions() {
        return premissions;
    }

    public void setPremissions(List<Premissions> premissions) {
        this.premissions = premissions;
    }
}
