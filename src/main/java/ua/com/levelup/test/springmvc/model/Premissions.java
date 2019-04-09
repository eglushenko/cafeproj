package ua.com.levelup.test.springmvc.model;

import ua.com.levelup.test.springmvc.enums.PremissionsEnum;

import javax.persistence.*;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "peremissions")
public class Premissions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Enumerated(EnumType.STRING)
    private PremissionsEnum name;
    @Column(name = "enabled")
    private boolean enabled;
    @ManyToMany
    @JoinTable(name = "premissions_role",
            joinColumns = @JoinColumn (name = "role_id"),
            inverseJoinColumns = @JoinColumn (name = "premissions_id"))

    private List<Role> roles;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public PremissionsEnum getName() {
        return name;
    }

    public void setName(PremissionsEnum name) {
        this.name = name;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
