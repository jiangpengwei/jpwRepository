package com.web.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.web.dao.UserInfoDao;
import com.web.model.UserInfo;
import com.web.util.DbUtil;

/**
 * @文件名: UserInfoDaoImpl.java
 * @类功能说明: 用户信息管理Dao实现类
 * @作者: JiangPengWei
 * @Email: 352848100@qq.com
 * @日期: 2020年2月28日下午1:03:54
 * @修改说明:<br>
 * 
 *            <pre>
 * 	 <li>作者: JiangPengWei</li> 
 * 	 <li>日期: 2020年2月28日下午1:03:54</li> 
 *	 <li>内容: </li>
 *            </pre>
 */
public class UserInfoDaoImpl implements UserInfoDao {
	/**
	 * 用户登录
	 */
	@Override
	public UserInfo login(UserInfo userInfo) {
		String sql = "select u_id,u_name,u_pwd,delflag from userlist where delflag=0 and u_name=? and u_pwd=?";
		Connection conn = DbUtil.getConn();
		PreparedStatement pstm = null;
		UserInfo resultUserInfo = null;
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, userInfo.getU_name());
			pstm.setString(2, userInfo.getU_pwd());
			ResultSet rs = pstm.executeQuery();
			while (rs.next()) {
				resultUserInfo = new UserInfo(rs.getInt("u_id"), rs.getString("u_name"),rs.getString("u_pwd"), rs.getInt("delflag"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultUserInfo;

	}

	/**
	 * 用户列表信息
	 */
	@Override
	public List<UserInfo> findAllUserInfo() {
		String sql = "select u_id,u_name,u_pwd,delflag from userlist where delflag=0";
		Connection conn = DbUtil.getConn();
		PreparedStatement pstm = null;
		List<UserInfo> userList = new ArrayList<UserInfo>();
		try {
			pstm = conn.prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();
			while (rs.next()) {
				UserInfo userInfo = new UserInfo(rs.getInt("u_id"), rs.getString("u_name"),rs.getString("u_pwd"), rs.getInt("delflag"));
				userList.add(userInfo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userList;
	}

	/**
	 * 根据用户名模糊查询用户信息
	 */
	@Override
	public List<UserInfo> findUserInfoByName(String u_name) {
		String sql = "select u_id,u_name,u_pwd,delflag from userlist where delflag=0 and u_name like ?";
		Connection conn = DbUtil.getConn();
		PreparedStatement pstm = null;
		List<UserInfo> userList = new ArrayList<UserInfo>();
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, "%" + u_name + "%");
			ResultSet rs = pstm.executeQuery();
			while (rs.next()) {
				UserInfo userInfo = new UserInfo(rs.getInt("u_id"), rs.getString("u_name"),rs.getString("u_pwd"), rs.getInt("delflag"));
				userList.add(userInfo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userList;

	}

	/**
	 * 新增用户信息
	 */
	@Override
	public int addUserInfo(UserInfo userInfo) {
		String sql = "insert into userlist(u_name,u_pwd,delflag) values(?,?,?)";
		Connection conn = DbUtil.getConn();
		PreparedStatement pstm = null;
		int result = 0;
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, userInfo.getU_name());
			pstm.setString(2, userInfo.getU_pwd());
			pstm.setInt(3, userInfo.getDelflag());
			result = pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * 修改用户信息
	 */
	@Override
	public int updateUserInfo(UserInfo userInfo) {
		String sql = "update userlist set u_name=?,u_pwd=? where u_id=?";
		Connection conn = DbUtil.getConn();
		PreparedStatement pstm = null;
		int result = 0;
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, userInfo.getU_name());
			pstm.setString(2, userInfo.getU_pwd());
			pstm.setInt(3, userInfo.getU_id());
			result = pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;

	}

	/**
	 * 根据用户Id删除用户信息
	 */
	@Override
	public int deleteUserInfo(int u_id) {
		String sql = "update userlist set delflag=1 where u_id=?";
		Connection conn = DbUtil.getConn();
		PreparedStatement pstm = null;
		int result = 0;
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, u_id);
			result = pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;

	}

}
