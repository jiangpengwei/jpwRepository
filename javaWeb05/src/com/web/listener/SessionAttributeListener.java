package com.web.listener;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

import com.web.dao.LogInfoDao;
import com.web.dao.impl.LogInfoDaoImpl;
import com.web.model.LogInfo;
import com.web.model.UserInfo;

/**
 * @文件名: SessionAttributeListener.java
 * @类功能说明: Session属性监听类
 * @作者: JiangPengWei
 * @Email: 352848100@qq.com
 * @日期: 2020年3月2日上午11:49:58
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: JiangPengWei</li> 
 * 	 <li>日期: 2020年3月2日上午11:49:58</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public class SessionAttributeListener implements HttpSessionAttributeListener{

	@Override
	public void attributeAdded(HttpSessionBindingEvent event) {
			UserInfo userInfo=(UserInfo) event.getValue();
			String log_name=userInfo.getU_name();
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String log_Date=sdf.format(new Date());
			String log_content="登录了本系统";
			LogInfo logInfo=new LogInfo(log_name,log_Date,log_content);
			LogInfoDao logInfoDao=new LogInfoDaoImpl();
			int result=logInfoDao.addLogInfo(logInfo);
			if(result>0) {
				System.out.println(log_name+log_Date+log_content);
			}
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent event) {
		UserInfo userInfo=(UserInfo) event.getValue();
		String log_name=userInfo.getU_name();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String log_Date=sdf.format(new Date());
		String log_content="退出了本系统";
		LogInfo logInfo=new LogInfo(log_name,log_Date,log_content);
		LogInfoDao logInfoDao=new LogInfoDaoImpl();
		int result=logInfoDao.addLogInfo(logInfo);
		if(result>0) {
			System.out.println(log_name+log_Date+log_content);
		}
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		
	}
	
}















