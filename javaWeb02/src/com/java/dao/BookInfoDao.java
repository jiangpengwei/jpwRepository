package com.java.dao;

import java.util.List;

import com.java.model.BookInfo;

/**
 * @文件名: BookInfoDao.java
 * @类功能说明: 数据持久层Dao接口
 * @作者: JiangPengWei
 * @Email: 352848100@qq.com
 * @日期: 2020年2月25日下午1:51:47
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: JiangPengWei</li> 
 * 	 <li>日期: 2020年2月25日下午1:51:47</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public interface BookInfoDao {
	public List<BookInfo> findAllBookInfo();
	
	
}
