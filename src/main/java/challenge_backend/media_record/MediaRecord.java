package challenge_backend.media_record;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import challenge_backend.media_player.MediaPlayer;
import challenge_backend.multimedia.Multimedia;

@Entity
public class MediaRecord {

    private @Id @GeneratedValue Long id;

    @ManyToOne
    @JoinColumn(name = "idPlayer")
    private MediaPlayer mediaPlayer;

    @ManyToOne
    @JoinColumn(name = "idMedia")
    private Multimedia multimedia;

    public MediaRecord() {
    }

    public MediaRecord(MediaPlayer mediaPlayer, Multimedia multimedia) {
        this.mediaPlayer = mediaPlayer;
        this.multimedia = multimedia;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MediaPlayer getMediaPlayer() {
        return mediaPlayer;
    }

    public void setMediaPlayer(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    public Multimedia getMultimedia() {
        return multimedia;
    }

    public void setMultimedia(Multimedia multimedia) {
        this.multimedia = multimedia;
    }

    @Override
    public String toString() {
        return "MediaRecord [id=" + id + ", mediaPlayer=" + mediaPlayer + ", multimedia=" + multimedia + "]";
    }

}
