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
 * @文件名: LoginFilter.java
 * @类功能说明: 
 * @作者: JiangPengWei
 * @Email: 352848100@qq.com
 * @日期: 2020年3月1日下午12:25:52
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: JiangPengWei</li> 
 * 	 <li>日期: 2020年3月1日下午12:25:52</li> 
 *	 <li>内容: </li>
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
