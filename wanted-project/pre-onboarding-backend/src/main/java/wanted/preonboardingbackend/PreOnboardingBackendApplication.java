package wanted.preonboardingbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "wanted.preonboardingbackend.repository")
@EntityScan(basePackages = "wanted.preonboardingbackend.entity")
public class PreOnboardingBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(PreOnboardingBackendApplication.class, args);
	}

}
