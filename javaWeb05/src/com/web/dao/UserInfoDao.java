package com.web.dao;

import java.util.List;

import com.web.model.UserInfo;

/**
 * @文件名: UserInfoDao.java
 * @类功能说明: 操作用户信息Dao接口
 * @作者: JiangPengWei
 * @Email: 352848100@qq.com
 * @日期: 2020年2月28日下午12:51:25
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: JiangPengWei</li> 
 * 	 <li>日期: 2020年2月28日下午12:51:25</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public interface UserInfoDao {
	/**
	 * @方法名: login
	 * @方法说明: 用户登录接口
	 * @作者: JiangPengWei
	 * @邮箱：352848100@qq.com
	 * @日期: 2020年2月28日下午12:56:26
	 * @param userInfo
	 * @return
	 * @return: UserInfo
	 */
	public UserInfo login(UserInfo userInfo);
	
	/**
	 * @方法名: findAllUserInfo
	 * @方法说明:用户列表Dao接口
	 * @作者: JiangPengWei
	 * @邮箱：352848100@qq.com
	 * @日期: 2020年2月28日下午12:57:40
	 * @return
	 * @return: List<UserInfo>
	 */
	public List<UserInfo> findAllUserInfo();
	
	/**
	 * @方法名: findUserInfoByName
	 * @方法说明: 根据用户名模糊查询用户信息Dao接口
	 * @作者: JiangPengWei
	 * @邮箱：352848100@qq.com
	 * @日期: 2020年2月28日下午12:58:47
	 * @return
	 * @return: List<UserInfo>
	 */
	public List<UserInfo> findUserInfoByName(String u_name);
	
	/**
	 * @方法名: addUserInfo
	 * @方法说明: 新增用户信息
	 * @作者: JiangPengWei
	 * @邮箱：352848100@qq.com
	 * @日期: 2020年2月28日下午1:00:12
	 * @param userInfo
	 * @return
	 * @return: int
	 */
	public int addUserInfo(UserInfo userInfo);
	
	/**
	 * @方法名: updateUserInfo
	 * @方法说明: 修改用户信息Dao接口
	 * @作者: JiangPengWei
	 * @邮箱：352848100@qq.com
	 * @日期: 2020年2月28日下午1:01:21
	 * @param userInfo
	 * @return
	 * @return: int
	 */
	public int updateUserInfo(UserInfo userInfo);
	
	/**
	 * @方法名: deleteUserInfo
	 * @方法说明: 删除用户信息Dao接口
	 * @作者: JiangPengWei
	 * @邮箱：352848100@qq.com
	 * @日期: 2020年2月28日下午1:02:50
	 * @param user_Id
	 * @return
	 * @return: int
	 */
	public int deleteUserInfo(int u_id);
	
}
