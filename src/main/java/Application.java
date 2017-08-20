
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by admin on 2017/3/1.
 */
@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan({"com.yqc"})
@EnableMongoRepositories(basePackages = {"com.yqc.repository"})
public class Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}
