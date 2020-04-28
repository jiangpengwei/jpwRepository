package com.web.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.web.dao.LogInfoDao;
import com.web.model.LogInfo;
import com.web.util.DbUtil;

import javafx.util.converter.PercentageStringConverter;

/**
 * @文件名: LogInfoDaoImpl.java
 * @类功能说明: logInfoDao实现类
 * @作者: JiangPengWei
 * @Email: 352848100@qq.com
 * @日期: 2020年3月2日上午11:32:18
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: JiangPengWei</li> 
 * 	 <li>日期: 2020年3月2日上午11:32:18</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public class LogInfoDaoImpl implements LogInfoDao{

	@Override
	public int addLogInfo(LogInfo logInfo) {
		String sql="insert into log(log_name,log_date,log_content,log_remark)value(?,?,?,?)";
		Connection conn=DbUtil.getConn();
		PreparedStatement pstm=null;
		int result=0;
		try {
			pstm=conn.prepareStatement(sql);
			pstm.setString(1,logInfo.getLog_name() );
			pstm.setString(2,logInfo.getLog_date() );
			pstm.setString(3,logInfo.getLog_content() );
			pstm.setString(4,logInfo.getLog_remark() );
			result=pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
}
