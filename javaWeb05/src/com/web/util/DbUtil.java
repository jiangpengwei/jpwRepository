package com.web.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @文件名: DbUtil.java
 * @类功能说明: 获取数据库连接
 * @作者: JiangPengWei
 * @Email: 352848100@qq.com
 * @日期: 2020年2月28日下午12:48:40
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: JiangPengWei</li> 
 * 	 <li>日期: 2020年2月28日下午12:48:40</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public class DbUtil {
	private static String jdbcUrl = "jdbc:mysql://localhost:3306/test01";
	private static String driverName = "com.mysql.jdbc.Driver";
	private static String username = "root";
	private static String password = "root";
	
	/**
	 * @方法名: getConn
	 * @方法说明: 获取连接数据库Connection类的方法
	 * @作者: JiangPengWei
	 * @邮箱：352848100@qq.com
	 * @日期: 2020年2月28日下午12:49:15
	 * @return
	 * @return: Connection
	 */
	public static Connection getConn() {
		Connection conn = null;
		try {
			Class.forName(driverName);
			conn = DriverManager.getConnection(jdbcUrl, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;

	}
	/**
	 * @方法名: close
	 * @方法说明: 关闭连接数据库Connection类的方法
	 * @作者: JiangPengWei
	 * @邮箱：352848100@qq.com
	 * @日期: 2020年2月28日下午12:49:24
	 * @param conn
	 * @param pstm
	 * @return: void
	 */
	public static void close(Connection conn, PreparedStatement pstm) {
		if (pstm != null) {
			try {
				pstm.close();
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}

