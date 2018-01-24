package rt.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerBoot1Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerBoot1Application.class, args);
	}
}
