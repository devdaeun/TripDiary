package tripdiary.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:/context-common.xml")
public class TripDiaryApplication {
	public static void main(String[] args) {
		SpringApplication.run(TripDiaryApplication.class, args);
	}
}
