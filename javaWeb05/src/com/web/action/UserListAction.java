package com.web.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.dao.UserInfoDao;
import com.web.dao.impl.UserInfoDaoImpl;
import com.web.model.UserInfo;

/**
 * @文件名: UserListAction.java
 * @类功能说明: 
 * @作者: JiangPengWei
 * @Email: 352848100@qq.com
 * @日期: 2020年2月28日下午8:20:44
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: JiangPengWei</li> 
 * 	 <li>日期: 2020年2月28日下午8:20:44</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public class UserListAction extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserInfoDao userInfoDao=new UserInfoDaoImpl();
		List<UserInfo> userList=userInfoDao.findAllUserInfo();
		request.setAttribute("userList", userList);
		RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
		rd.forward(request, response);
	}

}
