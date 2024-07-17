package app.controller;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import app.entity.User;
import app.model.LoginUser;
import app.service.LoginService;

@RestController
public class MainController {
	PasswordEncoder passwordEncoder;

	LoginService loginService;

	MainController(PasswordEncoder passwordEncoder) {
		this.passwordEncoder = passwordEncoder;
	}

	@PostMapping("/login")
	public LoginUser getLogin(User user) {
		return loginService.loadUserByUsername(user);
	}
}
