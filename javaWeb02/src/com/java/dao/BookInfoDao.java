package com.java.dao;

import java.util.List;

import com.java.model.BookInfo;

/**
 * @�ļ���: BookInfoDao.java
 * @�๦��˵��: ���ݳ־ò�Dao�ӿ�
 * @����: JiangPengWei
 * @Email: 352848100@qq.com
 * @����: 2020��2��25������1:51:47
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: JiangPengWei</li> 
 * 	 <li>����: 2020��2��25������1:51:47</li> 
 *	 <li>����: </li>
 * </pre>
 */
public interface BookInfoDao {
	public List<BookInfo> findAllBookInfo();
	
	
}
