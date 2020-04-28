package com.web.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @�ļ���: LogoutAction.java
 * @�๦��˵��: 
 * @����: JiangPengWei
 * @Email: 352848100@qq.com
 * @����: 2020��3��2������12:37:36
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: JiangPengWei</li> 
 * 	 <li>����: 2020��3��2������12:37:36</li> 
 *	 <li>����: </li>
 * </pre>
 */
public class LogoutAction extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		session.removeAttribute("currentUserInfo");
		response.sendRedirect("login.jsp");
	}

}
