package com.web.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.dao.UserInfoDao;
import com.web.dao.impl.UserInfoDaoImpl;

/**
 * @�ļ���: DeleteUserInfoAction.java
 * @�๦��˵��: ɾ���û���Ϣ
 * @����: JiangPengWei
 * @Email: 352848100@qq.com
 * @����: 2020��2��29������3:04:01
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: JiangPengWei</li> 
 * 	 <li>����: 2020��2��29������3:04:01</li> 
 *	 <li>����: </li>
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
