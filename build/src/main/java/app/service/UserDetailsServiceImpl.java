package app.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import app.entity.LoginUser;
import app.entity.LoginUserDetails;
import app.mapper.UserMapper;

@Service
@Transactional
public class UserDetailsServiceImpl implements UserDetailsService {
	private final UserMapper mapper;

	public UserDetailsServiceImpl(UserMapper mapper) {
		this.mapper = mapper;
	}

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		LoginUser user = mapper.selectByLogin(username);
		if (user == null) {
			throw new UsernameNotFoundException("not found :" + username);
		}

		return new LoginUserDetails(user);
	}
}
