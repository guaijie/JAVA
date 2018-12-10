package indi.jie.dao;

import indi.jie.bean.UserInfo;
import indi.jie.common.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserInfoDao {

    private Connection connection=null;
    private ResultSet resultSet=null;
    private PreparedStatement preparedStatement=null;

    public UserInfoDao(){super();}

    public void getUserInfo(){
        String sessionToken="";
        UserInfo userInfo =new UserInfo();
        try {
            connection= JDBCUtil.getConnection();
            String sql="select * from user where sesssionToken = ?";
            preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,sessionToken);
            resultSet=preparedStatement.executeQuery();
            if(resultSet.next()){
                userInfo =new UserInfo();
                userInfo.setId(resultSet.getInt("id"));
                userInfo.setUsername(resultSet.getString("username"));
                userInfo.setName(resultSet.getString("name"));
                userInfo.setBirthDay(resultSet.getString("birthDay"));
                userInfo.setPhone(resultSet.getString("phone"));
                userInfo.setAddress(resultSet.getString("address"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
//        return userInfo
    }

}
