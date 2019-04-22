package ua.com.levelup.cafeproj.model;

import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name="scan")
public class Doc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "personal_id")
    private Personal personal;

    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "doc")
    private byte[] doc;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public byte[] getDoc() {
        return doc;
    }

    public void setDoc(byte[] doc) {
        this.doc = doc;
    }
}
