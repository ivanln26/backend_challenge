package challenge_backend;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Multimedia {

    private @Id @GeneratedValue Long id;
    private String name;
    private String artist;
    private Double duration;

    public Multimedia() {
    }

    public Multimedia(String name, String artist, Double duration) {
        this.name = name;
        this.artist = artist;
        this.duration = duration;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Multimedia [artist=" + artist + ", duration=" + duration + ", id=" + id + ", name=" + name + "]";
    }

}
