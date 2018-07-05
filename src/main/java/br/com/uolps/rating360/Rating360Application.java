package br.com.uolps.rating360;

import br.com.uolps.rating360.config.SpringInitConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Rating360Application {

	public static void main(String[] args) {
		SpringApplication.run(Rating360Application.class, args);
		SpringInitConfig springInitConfig = new SpringInitConfig();
	}
}
