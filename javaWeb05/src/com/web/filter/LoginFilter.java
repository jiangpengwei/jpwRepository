package com.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @�ļ���: LoginFilter.java
 * @�๦��˵��: 
 * @����: JiangPengWei
 * @Email: 352848100@qq.com
 * @����: 2020��3��1������12:25:52
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: JiangPengWei</li> 
 * 	 <li>����: 2020��3��1������12:25:52</li> 
 *	 <li>����: </li>
 * </pre>
 */
public class LoginFilter implements Filter{

	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
			throws IOException, ServletException {
		HttpServletRequest request=(HttpServletRequest)servletRequest;
		HttpSession session=request.getSession();
		Object o=session.getAttribute("currentUserInfo");
		String path=request.getServletPath();
		
		if(o==null&&path.indexOf("login")<0) {
			request.getRequestDispatcher("login.jsp").forward(servletRequest, servletResponse);
			
		}else {
			filterChain.doFilter(servletRequest, servletResponse);
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
	}

}
