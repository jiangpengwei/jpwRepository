package com.java.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.dao.BookInfoDao;
import com.java.model.BookInfo;
import com.java.util.DButil;
/**
 * @文件名: BookInfoDaoImpl.java
 * @类功能说明: BookInfoDao实现类
 * @作者: JiangPengWei
 * @Email: 352848100@qq.com
 * @日期: 2020年2月25日下午2:42:48
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: JiangPengWei</li> 
 * 	 <li>日期: 2020年2月25日下午2:42:48</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public class BookInfoDaoImpl implements BookInfoDao{

	@Override
	public List<BookInfo> findAllBookInfo() {
		
		Connection conn=null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
		String sql="select bookId,bookName,bookAuthor,bookPrice from book";
		conn=DButil.getConn();
		List<BookInfo> bookList=new ArrayList<BookInfo>();
		try {
			pstm=conn.prepareStatement(sql);
			rs=pstm.executeQuery();
			while(rs.next()) {
				int bookId=rs.getInt("bookId");
				String bookName=rs.getString("bookName");
				String bookAuthor=rs.getString("bookAuthor");
				Double bookPrice=rs.getDouble("bookPrice");
				BookInfo bookInfo=new BookInfo(bookId,bookName,bookAuthor,bookPrice);
				bookList.add(bookInfo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return bookList;
	}
	
}
