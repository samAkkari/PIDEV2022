package tn.esprit.pidev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@EnableWebMvc
@SpringBootApplication
@EnableJpaRepositories
public class VoyageAffaireApplication {

	public static void main(String[] args) {
		SpringApplication.run(VoyageAffaireApplication.class, args);
	}

}
