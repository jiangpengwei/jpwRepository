package com.web.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @文件名: LogoutAction.java
 * @类功能说明: 
 * @作者: JiangPengWei
 * @Email: 352848100@qq.com
 * @日期: 2020年3月2日下午12:37:36
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: JiangPengWei</li> 
 * 	 <li>日期: 2020年3月2日下午12:37:36</li> 
 *	 <li>内容: </li>
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
