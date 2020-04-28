package com.web.dao;

import java.util.List;

import com.web.model.UserInfo;

/**
 * @�ļ���: UserInfoDao.java
 * @�๦��˵��: �����û���ϢDao�ӿ�
 * @����: JiangPengWei
 * @Email: 352848100@qq.com
 * @����: 2020��2��28������12:51:25
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: JiangPengWei</li> 
 * 	 <li>����: 2020��2��28������12:51:25</li> 
 *	 <li>����: </li>
 * </pre>
 */
public interface UserInfoDao {
	/**
	 * @������: login
	 * @����˵��: �û���¼�ӿ�
	 * @����: JiangPengWei
	 * @���䣺352848100@qq.com
	 * @����: 2020��2��28������12:56:26
	 * @param userInfo
	 * @return
	 * @return: UserInfo
	 */
	public UserInfo login(UserInfo userInfo);
	
	/**
	 * @������: findAllUserInfo
	 * @����˵��:�û��б�Dao�ӿ�
	 * @����: JiangPengWei
	 * @���䣺352848100@qq.com
	 * @����: 2020��2��28������12:57:40
	 * @return
	 * @return: List<UserInfo>
	 */
	public List<UserInfo> findAllUserInfo();
	
	/**
	 * @������: findUserInfoByName
	 * @����˵��: �����û���ģ����ѯ�û���ϢDao�ӿ�
	 * @����: JiangPengWei
	 * @���䣺352848100@qq.com
	 * @����: 2020��2��28������12:58:47
	 * @return
	 * @return: List<UserInfo>
	 */
	public List<UserInfo> findUserInfoByName(String u_name);
	
	/**
	 * @������: addUserInfo
	 * @����˵��: �����û���Ϣ
	 * @����: JiangPengWei
	 * @���䣺352848100@qq.com
	 * @����: 2020��2��28������1:00:12
	 * @param userInfo
	 * @return
	 * @return: int
	 */
	public int addUserInfo(UserInfo userInfo);
	
	/**
	 * @������: updateUserInfo
	 * @����˵��: �޸��û���ϢDao�ӿ�
	 * @����: JiangPengWei
	 * @���䣺352848100@qq.com
	 * @����: 2020��2��28������1:01:21
	 * @param userInfo
	 * @return
	 * @return: int
	 */
	public int updateUserInfo(UserInfo userInfo);
	
	/**
	 * @������: deleteUserInfo
	 * @����˵��: ɾ���û���ϢDao�ӿ�
	 * @����: JiangPengWei
	 * @���䣺352848100@qq.com
	 * @����: 2020��2��28������1:02:50
	 * @param user_Id
	 * @return
	 * @return: int
	 */
	public int deleteUserInfo(int u_id);
	
}
