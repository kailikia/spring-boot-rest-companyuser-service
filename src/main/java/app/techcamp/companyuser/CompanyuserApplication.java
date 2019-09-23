package app.techcamp.companyuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class CompanyuserApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompanyuserApplication.class, args);
	}

}
