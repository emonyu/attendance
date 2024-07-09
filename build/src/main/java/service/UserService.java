package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import entity.LoginUser;
import entity.LoginUserDetails;
import mapper.UserMapper;

public class UserService {
	@Autowired
	private UserMapper mapper;

	public UserDetails loadUserByUsername(String username, String password) throws UsernameNotFoundException {

		LoginUser user = mapper.selectByLogin(username);
		if (user == null) {
			throw new UsernameNotFoundException("not found :" + username);
		}

		return new LoginUserDetails(user);
	}
}
