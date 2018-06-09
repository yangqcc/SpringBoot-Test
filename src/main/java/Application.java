
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author admin
 * @date 2017/3/1
 */
@EnableAutoConfiguration
@SpringBootApplication(scanBasePackages = {"com.yqc.springboot", "com.yqc.springboot.config"})
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
