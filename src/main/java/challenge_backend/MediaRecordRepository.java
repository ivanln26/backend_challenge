package challenge_backend;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface MediaRecordRepository extends CrudRepository<MediaRecord, Long> {

    List<MediaRecord> findByMultimediaId(Long id);

    List<MediaRecord> findByMediaPlayerIdAndMultimediaId(Long idPlayer, Long idMedia);

}
