import com.amin.repository.HibernateSpeakerRepositoryImpl;
import com.amin.repository.SpeakerRepository;
import com.amin.service.SpeakerService;
import com.amin.service.SpeakerServiceImpl;
import com.amin.util.CalendarFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Calendar;

@Configuration
@ComponentScan({"com.amin"}) // to fully autowired our application
public class AppConfig {
//    hybrid configuration in bellow are commented
    /*
    @Bean(name = "speakerService")
    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
//    @Scope(value = BeanDefinition.SCOPE_PROTOTYPE) // every time generates unique bean object per request [oppsite to singleton]
    public SpeakerService getSpeakerService() {
//        return new SpeakerServiceImpl();
//        SpeakerServiceImpl service = new SpeakerServiceImpl();  // for setter Injection
//        service.setRepository(getSpeakerRepository()); // for setter Injection
//        SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());    // for Constructor Injection
        SpeakerServiceImpl service = new SpeakerServiceImpl(); // test autowired
        return service;
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository() {
        return new HibernateSpeakerRepositoryImpl();
    }

     */

    @Bean(name = "cal")
    public CalendarFactory calFactory() {
        CalendarFactory factory = new CalendarFactory();
        factory.addDays(2);
        return factory;
    }

    @Bean
    public Calendar cal() throws Exception {
        return calFactory().getObject();
    }

}
