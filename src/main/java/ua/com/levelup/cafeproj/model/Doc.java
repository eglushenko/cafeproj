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
    @JoinColumn(name = "doc_id")
    private Doc docId;

    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "doc",length = 256,columnDefinition = "BLOB", nullable = false )
    private byte[] doc;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Doc getDocId() {
        return docId;
    }

    public void setDocId(Doc docId) {
        this.docId = docId;
    }

    public byte[] getDoc() {
        return doc;
    }

    public void setDoc(byte[] doc) {
        this.doc = doc;
    }
}
