package ua.com.levelup.cafeproj.model;

import javax.persistence.*;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "permissions")
public class Permissions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Enumerated(EnumType.STRING)
    private ua.com.levelup.cafeproj.enums.Permissions name;

    @Column
    private boolean enabled;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "permissions_role",
            joinColumns = @JoinColumn (name = "permissions_id"),
            inverseJoinColumns = @JoinColumn (name = "role_id"))
    private List<Role> roles;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ua.com.levelup.cafeproj.enums.Permissions getName() {
        return name;
    }

    public void setName(ua.com.levelup.cafeproj.enums.Permissions name) {
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
