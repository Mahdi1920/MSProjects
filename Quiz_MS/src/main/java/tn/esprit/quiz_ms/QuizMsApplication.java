package tn.esprit.quiz_ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
@SpringBootApplication
@EnableMongoAuditing
public class QuizMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizMsApplication.class, args);
	}

}
