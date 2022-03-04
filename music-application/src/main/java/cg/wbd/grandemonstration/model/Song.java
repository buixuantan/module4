package cg.wbd.grandemonstration.model;

import javax.persistence.*;

@Entity
@Table(name="songs")
public class Song implements Cloneable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String artist;
    private String kind;
    private String path;

    public Song(String name, String artist, String kind, String path) {
        this.name = name;
        this.artist = artist;
        this.kind = kind;
        this.path = path;
    }

    public Song() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", artist='" + artist + '\'' +
                ", kind='" + kind + '\'' +
                ", path='" + path + '\'' +
                '}';
    }
}
