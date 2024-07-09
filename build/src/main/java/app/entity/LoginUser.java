package app.entity;

import lombok.Data;

@Data
public class LoginUser {
	private Long id;

	private String userName;

	private String password;
}
