package indi.jie.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import indi.jie.bean.UserLogin;
import indi.jie.common.JDBCUtil;
//import org.junit.Test;

public class UserLoginDao {
	
	private Connection connection;
	private ResultSet resultSet;
	private PreparedStatement preparedStatement;
	
	public UserLoginDao() {
		super();
	}

//	public static void main(String arg[]){
//		UserLoginDao login=new UserLoginDao();
//		UserInfo user = login.login("guaijie","123456");
//		System.out.println(user);
//	}

	public UserLogin login(String username, String password) {
		UserLogin userLogin =null;
		try {
			connection=JDBCUtil.getConnection();
			String sql="select * from user where username=? and password=?";
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1,username);
			preparedStatement.setString(2,password);
			
			resultSet=preparedStatement.executeQuery();
			if(resultSet.next()){
				userLogin.setId(resultSet.getInt("id"));
				userLogin.setUsername(resultSet.getString("username"));
				userLogin.setSessionToken(resultSet.getString("sessionToken"));
			}
//			userInfo.setUsername(resultSet.getString("username"));
//			userInfo.setPassword(resultSet.getString("password"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCUtil.release(resultSet, connection,preparedStatement);
		}

		return userLogin;
	}

}
