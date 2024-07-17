package app.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.builder.annotation.ProviderMethodResolver;
import org.apache.ibatis.jdbc.SQL;

import app.entity.User;

@Mapper
public interface UserMapper {
	//ログイン情報取得
	@SelectProvider(LoginUserSqlProvider.class)
	User selectByLogin(User user);

	//全件取得
	//	@SelectProvider(LoginUserSqlProvider.class)
	//	List<LoginUser> selectAll();
	//
	//	//１件取得
	//	@SelectProvider(LoginUserSqlProvider.class)
	//	LoginUser selectByPrimaryKey(Long id);
	//
	//	//登録
	//	@SelectProvider(LoginUserSqlProvider.class)
	//	int insert(LoginUser user);
	//
	//	//更新
	//	@SelectProvider(LoginUserSqlProvider.class)
	//	int updateByPrimaryKey(LoginUser user);
	//
	//	//削除
	//	@SelectProvider(LoginUserSqlProvider.class)
	//	int deleteByPrimaryKey(Long id);

	class LoginUserSqlProvider implements ProviderMethodResolver {

		// ログイン情報取得
		public String selectByLogin(User user) {
			return new SQL() {
				{
					SELECT("id", "user_name", "password");
					FROM("user");
					WHERE("user_name = #{userName}");
				}
			}.toString();
		}

	}
}
