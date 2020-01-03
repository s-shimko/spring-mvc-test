package example;

import java.util.stream.Stream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AppStarter {

    private static final Logger log = LoggerFactory.getLogger(AppStarter.class);

    public static void main(String[] args) {
        SpringApplication.run(AppStarter.class, args);
    }

//    @Bean
//    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
//        return args -> {
//            log.info("Beans from Spring Boot");
//            String[] beanNames = ctx.getBeanDefinitionNames();
//            Stream.of(beanNames)
//                .filter(s -> s.contains("org.springframework.boot"))
//                .sorted()
//                .forEach(System.out::println);
//        };
//    }
}
