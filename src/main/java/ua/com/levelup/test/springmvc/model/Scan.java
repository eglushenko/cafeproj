package ua.com.levelup.test.springmvc.model;

import javax.persistence.*;

@Entity
@Table(name="scan")
public class Scan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    /**
     * TODO
     * Еще нужна анотация @Lob
     * Поле лучше не называть одноименно с сущностью. Лучше назвать его body или doc
     */
    private byte[] scan;

    public Scan(byte[] scan) {
        this.scan = scan;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public byte[] getScan() {
        return scan;
    }

    public void setScan(byte[] scan) {
        this.scan = scan;
    }
}
