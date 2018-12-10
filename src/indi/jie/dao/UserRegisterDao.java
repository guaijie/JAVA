package indi.jie.dao;

import indi.jie.common.JDBCUtil;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRegisterDao {

    private Connection connection;
    private ResultSet resultSet;
    private PreparedStatement preparedStatement;

    public UserRegisterDao(){ super();}

    @Test
    public void register(){

        try {
            connection= JDBCUtil.getConnection();
            String sql="insert user(username,password) values(?,?)";

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


}
