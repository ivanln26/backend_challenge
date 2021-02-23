package challenge_backend.media_player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import challenge_backend.media_record.MediaRecordRepository;

@RestController
public class MediaPlayerController {

    @Autowired
    private MediaRecordRepository repository;

    @GetMapping("/players/{idPlayer}/multimedia/{idMedia}")
    public int index(@PathVariable Long idPlayer, @PathVariable Long idMedia) {
        return this.repository.findByMediaPlayerIdAndMultimediaId(idPlayer, idMedia).size();
    }

}
