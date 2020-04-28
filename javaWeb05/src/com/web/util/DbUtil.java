package com.web.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @�ļ���: DbUtil.java
 * @�๦��˵��: ��ȡ���ݿ�����
 * @����: JiangPengWei
 * @Email: 352848100@qq.com
 * @����: 2020��2��28������12:48:40
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: JiangPengWei</li> 
 * 	 <li>����: 2020��2��28������12:48:40</li> 
 *	 <li>����: </li>
 * </pre>
 */
public class DbUtil {
	private static String jdbcUrl = "jdbc:mysql://localhost:3306/test01";
	private static String driverName = "com.mysql.jdbc.Driver";
	private static String username = "root";
	private static String password = "root";
	
	/**
	 * @������: getConn
	 * @����˵��: ��ȡ�������ݿ�Connection��ķ���
	 * @����: JiangPengWei
	 * @���䣺352848100@qq.com
	 * @����: 2020��2��28������12:49:15
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
	 * @������: close
	 * @����˵��: �ر��������ݿ�Connection��ķ���
	 * @����: JiangPengWei
	 * @���䣺352848100@qq.com
	 * @����: 2020��2��28������12:49:24
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

