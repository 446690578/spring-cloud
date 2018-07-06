
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;

@EnableEurekaServer
@SpringBootApplication
@ComponentScan(basePackages = "com.gaiaworks")
public class Enreka_Application {

    public static void main(String[] args) {
        SpringApplication.run(Enreka_Application.class,args);
    }

}
