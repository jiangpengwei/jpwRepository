package com.java.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 * @�ļ���: DButil.java
 * @�๦��˵��: ��ȡ�������ݿ�
 * @����: JiangPengWei
 * @Email: 352848100@qq.com
 * @����: 2020��2��25������1:40:59
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: JiangPengWei</li> 
 * 	 <li>����: 2020��2��25������1:40:59</li> 
 *	 <li>����: </li>
 * </pre>
 */

public class DButil {

	private static String jdbcUrl = "jdbc:mysql://localhost:3306/test01";
	private static String driverName = "com.mysql.jdbc.Driver";
	private static String username = "root";
	private static String password = "root";

	/**
	 * @������: getConn
	 * @����˵��: ��ȡ�������ݿ�Connection��ķ���
	 * @����: JiangPengWei
	 * @���䣺352848100@qq.com
	 * @����: 2020��2��25������1:02:50
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