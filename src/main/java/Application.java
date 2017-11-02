
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by admin on 2017/3/1.
 */
@EnableAutoConfiguration
@SpringBootApplication(scanBasePackages = {"com.cityos.hb", "com.cityos.hb.config"})
public class Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}
