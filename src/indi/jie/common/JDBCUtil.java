package indi.jie.common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JDBCUtil {
	
	private static ComboPooledDataSource dataSource=null;
	
	static {
		//初始化一次资源
		dataSource=new ComboPooledDataSource();
	}
	
	//从连接池中获取连接
	public static Connection getConnection() throws SQLException {
		return dataSource.getConnection();
	}
	
	//释放资源
	public static void release(Connection connection,PreparedStatement statement) {
		if(connection!=null) {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			connection=null;
		}
		if(statement!=null) {
			try {
				statement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			statement=null;
		}
	}
	
	public static void release(ResultSet resultset,Connection connection,PreparedStatement statement) {
		if(connection!=null) {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			connection=null;
		}
		if(statement!=null) {
			try {
				statement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			statement=null;
		}
		if(resultset!=null) {
			
			try {
				resultset.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			resultset=null;
		}
		
	}
}