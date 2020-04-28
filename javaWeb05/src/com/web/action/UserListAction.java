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
 * @�ļ���: UserListAction.java
 * @�๦��˵��: 
 * @����: JiangPengWei
 * @Email: 352848100@qq.com
 * @����: 2020��2��28������8:20:44
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: JiangPengWei</li> 
 * 	 <li>����: 2020��2��28������8:20:44</li> 
 *	 <li>����: </li>
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