package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

	@GetMapping({ "/login", "/" })
	public String getLogin() {
		return "login";
	}

	@PostMapping("/login")
	public String postLogin() {
		return "loginredirect:/main";
	}

}
