package app.model;

import app.entity.User;
import lombok.Data;

@Data
public class LoginUser {
	private Long id;

	private String userName;

	public LoginUser(User user) {
		this.id = user.getId();
		this.userName = user.getUserName();
	}
}
