package com.web.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.web.dao.LogInfoDao;
import com.web.model.LogInfo;
import com.web.util.DbUtil;

import javafx.util.converter.PercentageStringConverter;

/**
 * @�ļ���: LogInfoDaoImpl.java
 * @�๦��˵��: logInfoDaoʵ����
 * @����: JiangPengWei
 * @Email: 352848100@qq.com
 * @����: 2020��3��2������11:32:18
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: JiangPengWei</li> 
 * 	 <li>����: 2020��3��2������11:32:18</li> 
 *	 <li>����: </li>
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
