package ua.com.levelup.cafeproj.model;


import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class BookigOfTables {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    /**
     *
     * Связь с id в таблице столов
     */
    @OneToOne(mappedBy = "tables")
    private Tables tables;

    private boolean reserved = true;

    private LocalDateTime timeStartReserved;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Tables getTables() {
        return tables;
    }

    public void setTables(Tables tables) {
        this.tables = tables;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    public LocalDateTime getTimeStartReserved() {
        return timeStartReserved;
    }

    public void setTimeStartReserved(LocalDateTime timeStartReserved) {
        this.timeStartReserved = timeStartReserved;
    }
}
