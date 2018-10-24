
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;

@EnableEurekaServer
@SpringBootApplication
@ComponentScan(basePackages = "com.ben")
public class Eureka_Application {

    public static void main(String[] args) {
        SpringApplication.run(Eureka_Application.class,args);
    }

}

/*
* @Author: Ben.Yuan
* @Description:
* @param 端口        8761
* @Date: 上午11:30 2018/10/23 
*/