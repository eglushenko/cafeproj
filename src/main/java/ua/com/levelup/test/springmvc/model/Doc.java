package ua.com.levelup.test.springmvc.model;

import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name="scan")
public class Doc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    //TODO не стоит имя столбца делать капслоком, если это не общий стиль проекта
    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "DOC", columnDefinition = "BLOB", nullable = false)
    private byte[] doc;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public byte[] getDoc() {
        return doc;
    }

    public void setDoc(byte[] doc) {
        this.doc = doc;
    }
}
