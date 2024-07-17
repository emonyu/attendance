package app.service;

import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import app.entity.User;
import app.mapper.UserMapper;
import app.model.LoginUser;

@Service
@Transactional
public class LoginService {
	private final UserMapper mapper;

	public LoginService(UserMapper mapper) {
		this.mapper = mapper;
	}

	public LoginUser loadUserByUsername(User user) throws UsernameNotFoundException {

		User loginUser = mapper.selectByLogin(user);
		if (loginUser == null) {
			throw new UsernameNotFoundException("user name or password wrong");
		}

		return new LoginUser(loginUser);
	}
}
