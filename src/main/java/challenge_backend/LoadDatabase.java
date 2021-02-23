package challenge_backend;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

    // private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(MultimediaRepository mRepository, MediaPlayerRepository mpRepository, MediaRecordRepository mrRepository) {
        return args -> {
            MediaPlayer mp = new MediaPlayer("Walkman", "Sony");
            mpRepository.save(mp);
            MediaPlayer mp2 = new MediaPlayer("iPod", "Apple");
            mpRepository.save(mp2);
            Multimedia m = new Multimedia("Baby", "Justin Bieber", 3.20);
            mRepository.save(m);
            Multimedia m2 = new Multimedia("Harvest Moon", "Poolside", 4.20);
            mRepository.save(m2);
            MediaRecord mr = new MediaRecord(mp, m);
            mrRepository.save(mr);
            MediaRecord mr2 = new MediaRecord(mp, m);
            mrRepository.save(mr2);
            MediaRecord mr3 = new MediaRecord(mp, m2);
            mrRepository.save(mr3);
            MediaRecord mr4 = new MediaRecord(mp2, m2);
            mrRepository.save(mr4);
            MediaRecord mr5 = new MediaRecord(mp2, m2);
            mrRepository.save(mr5);
        };
    }

}
