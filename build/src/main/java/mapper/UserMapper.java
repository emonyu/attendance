package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import entity.LoginUser;

@Mapper
public interface UserMapper {
	//ログイン情報取得
	LoginUser selectByLogin(String userName);

	//全件取得
	List<LoginUser> selectAll();

	//１件取得
	LoginUser selectByPrimaryKey(Long id);

	//登録
	int insert(LoginUser user);

	//更新
	int updateByPrimaryKey(LoginUser user);

	//削除
	int deleteByPrimaryKey(Long id);
}
