package ua.com.levelup.cafeproj.model;


import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class BookigOfTables {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    /**
     * TODO
     * Связь с id в таблице столов
     */
    private long tables_id;

    private boolean reserved = true;

    private LocalDateTime timeStartReserved;



}
