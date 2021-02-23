package challenge_backend.media_record;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface MediaRecordRepository extends CrudRepository<MediaRecord, Long> {

    List<MediaRecord> findByMultimediaId(Long id);

    List<MediaRecord> findByMediaPlayerIdAndMultimediaId(Long idPlayer, Long idMedia);

}
