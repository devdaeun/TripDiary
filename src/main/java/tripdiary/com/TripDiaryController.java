package tripdiary.com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TripDiaryController {
	
	@GetMapping("/")
	public String main() {
		return "main";
	}

}