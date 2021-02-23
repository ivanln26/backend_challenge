package challenge_backend;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import challenge_backend.media_record.MediaRecord;
import challenge_backend.media_record.MediaRecordRepository;

@RestController
public class Controller {

    @Autowired
    private MediaRecordRepository repository;

    @GetMapping("/")
    public List<MediaRecord> index() {
        List<MediaRecord> mediaRecords = new ArrayList<>();
        this.repository.findAll().forEach(mediaRecords::add);
        return mediaRecords;
    }

}
