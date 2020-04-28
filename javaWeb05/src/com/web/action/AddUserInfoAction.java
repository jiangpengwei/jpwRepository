package com.web.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.dao.UserInfoDao;
import com.web.dao.impl.UserInfoDaoImpl;
import com.web.model.UserInfo;

/**
 * @�ļ���: AddUserInfo.java
 * @�๦��˵��: ����û���Ϣservlet
 * @����: JiangPengWei
 * @Email: 352848100@qq.com
 * @����: 2020��2��29������1:05:16
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: JiangPengWei</li> 
 * 	 <li>����: 2020��2��29������1:05:16</li> 
 *	 <li>����: </li>
 * </pre>
 */
public class AddUserInfoAction extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String u_id=request.getParameter("u_id");
		String u_name=request.getParameter("u_name");
		String u_pwd=request.getParameter("u_pwd");
		int delflag=0;
		int result=0;
		UserInfo userInfo=null;
		UserInfoDao userInfoDao=new UserInfoDaoImpl();
		if(u_id==null||u_id=="") {
			userInfo=new UserInfo(u_name,u_pwd,delflag);
			result=userInfoDao.addUserInfo(userInfo);
		}else {
			userInfo=new UserInfo(Integer.parseInt(u_id),u_name,u_pwd,delflag);
			result=userInfoDao.updateUserInfo(userInfo);
		}
		if(result>0) {
			response.sendRedirect("findAllUserInfo");
		}
	}

}
