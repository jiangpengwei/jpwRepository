package com.web.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.dao.UserInfoDao;
import com.web.dao.impl.UserInfoDaoImpl;

/**
 * @文件名: DeleteUserInfoAction.java
 * @类功能说明: 删除用户信息
 * @作者: JiangPengWei
 * @Email: 352848100@qq.com
 * @日期: 2020年2月29日下午3:04:01
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: JiangPengWei</li> 
 * 	 <li>日期: 2020年2月29日下午3:04:01</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public class DeleteUserInfoAction extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String u_id=request.getParameter("u_id");
		UserInfoDao userInfoDao=new UserInfoDaoImpl();
		int result=userInfoDao.deleteUserInfo(Integer.parseInt(u_id));
		if(result>0) {
			response.sendRedirect("findAllUserInfo");
		}
	}

}
