import com.amin.service.SpeakerService;
import com.amin.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

//        SpeakerService service = new SpeakerServiceImpl();
        SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);
//        System.out.println(service);

        System.out.println(service.findAll().get(0).getFirstName());
        System.out.println(service.findAll().get(0).getSeedNum());


//        SpeakerService service2 = appContext.getBean("speakerService", SpeakerService.class);
//        System.out.println(service2); // same object will print for @Scope Singleton
    }
}

// 5 Scopes
// Valid in any configuration
//  - Singleton
//  - Prototype
// Valid only in web-aware spring projects
//  - request
//  - session
//  - Global

//  Autowired => Convention over Configuration