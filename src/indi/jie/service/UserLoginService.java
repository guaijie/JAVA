package indi.jie.service;

import indi.jie.bean.UserLogin;
import indi.jie.dao.UserLoginDao;

public class UserLoginService {
	UserLoginDao userLoginDao =null;
	public UserLoginService(){
		userLoginDao =new UserLoginDao();
	}
	
	public UserLogin login(String username, String password) {

		UserLogin userLogin = userLoginDao.login(username, password);

		return userLogin;

	}
}
