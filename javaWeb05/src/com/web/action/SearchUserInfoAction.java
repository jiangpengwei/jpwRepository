package com.web.action;

import java.io.IOException;
import java.util.ArrayList;
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
 * @文件名: SearchUserInfoAction.java
 * @类功能说明: 
 * @作者: JiangPengWei
 * @Email: 352848100@qq.com
 * @日期: 2020年2月29日下午3:28:58
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: JiangPengWei</li> 
 * 	 <li>日期: 2020年2月29日下午3:28:58</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public class SearchUserInfoAction extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String searchName=request.getParameter("searchName");
		UserInfoDao userInfoDao=new UserInfoDaoImpl();
		List<UserInfo> userList=userInfoDao.findUserInfoByName(searchName);
		request.setAttribute("userList",userList);
		RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
		rd.forward(request, response);
	}

}
