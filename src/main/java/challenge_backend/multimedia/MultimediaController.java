package challenge_backend.multimedia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import challenge_backend.media_record.MediaRecordRepository;

@RestController
public class MultimediaController {

    @Autowired
    private MediaRecordRepository mrRepository;

    @GetMapping("/multimedia/{id}/times")
    public int index(@PathVariable Long id) {
        return this.mrRepository.findByMultimediaId(id).size();
    }
    
}
