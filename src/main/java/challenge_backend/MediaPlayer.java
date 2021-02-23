package challenge_backend;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MediaPlayer {

    private @Id @GeneratedValue Long id;
    private String name;
    private String brand;

   

    public MediaPlayer() {
    }

    public MediaPlayer(String name, String brand) {
        this.name = name;
        this.brand = brand;
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "MediaPlayer [brand=" + brand + ", id=" + id + ", name=" + name + "]";
    }

}
