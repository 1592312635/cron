import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableEurekaClient
@EnableAsync
@EnableCaching
@EnableScheduling
@EnableAutoConfiguration
@MapperScan(basePackages = "com.minyan.cron")
public class CronApplication {

  public static void main(String[] args) {
    SpringApplication.run(CronApplication.class, args);
  }
}
