package app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MainController {
	@Autowired
	PasswordEncoder passwordEncoder;

	@GetMapping("/login")
	public ModelAndView getLogin(ModelAndView mAndv) {
		mAndv.setViewName("login");
		System.out.println(passwordEncoder.encode("test"));
		return mAndv;
	}

	@PostMapping("/login")
	public String postLogin() {
		return "loginredirect:/main";
	}
}
