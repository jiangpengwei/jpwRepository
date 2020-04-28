package com.web.action;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.web.dao.UserInfoDao;
import com.web.dao.impl.UserInfoDaoImpl;
import com.web.model.UserInfo;

/**
 * @文件名: LoginAction.java
 * @类功能说明: 用户登录servlet
 * @作者: JiangPengWei
 * @Email: 352848100@qq.com
 * @日期: 2020年2月28日下午2:30:58
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: JiangPengWei</li> 
 * 	 <li>日期: 2020年2月28日下午2:30:58</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public class LoginAction extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String u_name=request.getParameter("u_name");
		String u_pwd=request.getParameter("u_pwd");
		UserInfo userInfo=new UserInfo(u_name,u_pwd);
		HttpSession session=request.getSession();
		UserInfoDao userInfoDao=new UserInfoDaoImpl();
		UserInfo resultUserInfo=userInfoDao.login(userInfo);
		if(resultUserInfo!=null) {
			session.setAttribute("currentUserInfo", resultUserInfo);
			response.sendRedirect("findAllUserInfo");
		}else {
			String message="*用户名或密码错误";
			message=URLEncoder.encode(message,"utf-8");
			response.sendRedirect("login.jsp?error="+message+"&u_name="+u_name+"&u_pwd="+u_pwd);
		}
	}

}
