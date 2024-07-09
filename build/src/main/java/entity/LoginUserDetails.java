package entity;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class LoginUserDetails implements UserDetails {

	// ログインユーザー
	private final LoginUser user;

	/**
	 * ユーザーの取得
	 * 
	 * @param user
	 */
	public LoginUserDetails(LoginUser user) {
		this.user = user;
	}

	/**
	 * ロール取得
	 */
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	/**
	 * パスワード取得
	 */
	@Override
	public String getPassword() {
		// TODO 自動生成されたメソッド・スタブ
		return this.user.getPassword();
	}

	/**
	 * ユーザ名取得
	 */
	@Override
	public String getUsername() {
		// TODO 自動生成されたメソッド・スタブ
		return this.user.getUserName();
	}

}
