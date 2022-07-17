package fr.shewbii.helloworldjavaspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class HelloWorldJavaSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldJavaSpringBootApplication.class, args);
	}

}
