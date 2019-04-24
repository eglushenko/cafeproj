package ua.com.levelup.cafeproj.model;

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
    private ua.com.levelup.cafeproj.enums.Role name;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_role",
            joinColumns = @JoinColumn (name = "role_id"),
            inverseJoinColumns = @JoinColumn (name = "user_id"))
    private List<User> users;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "permissions_role",
                joinColumns = @JoinColumn (name = "role_id"),
            inverseJoinColumns = @JoinColumn (name = "permissions_id"))
    private List<Permissions> permissions = new ArrayList<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ua.com.levelup.cafeproj.enums.Role getName() {
        return name;
    }

    public void setName(ua.com.levelup.cafeproj.enums.Role name) {
        this.name = name;
    }

    public List<Permissions> getPremissions() {
        return permissions;
    }

    public void setPremissions(List<Permissions> premissions) {
        this.permissions = premissions;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
