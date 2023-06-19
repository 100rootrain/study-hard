package bkw.studyhard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("bkw.etc")
@SpringBootApplication
public class StudyHardApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudyHardApplication.class, args);
	}


}
