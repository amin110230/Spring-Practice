import com.amin.repository.HibernateSpeakerRepositoryImpl;
import com.amin.repository.SpeakerRepository;
import com.amin.service.SpeakerService;
import com.amin.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "speakerService")
    public SpeakerService getSpeakerService() {
//        return new SpeakerServiceImpl();
//        SpeakerServiceImpl service = new SpeakerServiceImpl();  // for setter Injection
//        service.setRepository(getSpeakerRepository()); // for setter Injection
        SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());    // for Constructor Injection
        return service;
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository() {
        return new HibernateSpeakerRepositoryImpl();
    }
}
