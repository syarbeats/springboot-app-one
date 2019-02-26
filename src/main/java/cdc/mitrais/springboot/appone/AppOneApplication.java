package cdc.mitrais.springboot.appone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppOneApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(AppOneApplication.class);

	public static void main(String[] args) {
		logger.info("Spring Boot Application will starting soon....");
		SpringApplication.run(AppOneApplication.class, args);
	}

}
