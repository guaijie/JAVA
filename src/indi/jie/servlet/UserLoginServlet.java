package indi.jie.servlet;

import indi.jie.bean.UserLogin;
import indi.jie.service.UserLoginService;
import net.sf.json.JSONObject;
import net.sf.json.JSONArray;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class UserLoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UserLoginService userLoginService;


	@Override
	public void init() throws ServletException {
		super.init();
		userLoginService =new UserLoginService();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doPost(req, res);
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("application/json; charset=utf-8");
		res.setCharacterEncoding("UTF-8");

		PrintWriter out =res.getWriter();
		String username=req.getParameter("username");
		String password=req.getParameter("password");

		JSONArray jsonarray = new JSONArray();
		JSONObject jsonobj = new JSONObject();
		JSONObject user=new JSONObject();

		UserLogin userLogin= userLoginService.login(username, password);
		String string="2343432";

		user.put("id",userLogin.getId());
		user.put("username",username);
		user.put("sesstionToken",userLogin.getSessionToken());

		if(userLogin==null) {
			jsonobj.put("isSuccessful",false);
			jsonobj.put("message","用户名或密码不正确！");
			out.println(jsonobj);
		}else{
			jsonobj.put("isSuccessful",true);
			jsonobj.put("userInfo",user);
			out.println(jsonobj);
		}
		out.close();
	}

	
}
