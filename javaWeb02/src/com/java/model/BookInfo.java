package com.java.model;
/**
 * @文件名: BookInfo.java
 * @类功能说明: 图书实体类
 * @作者: JiangPengWei
 * @Email: 352848100@qq.com
 * @日期: 2020年2月25日下午1:40:38
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: JiangPengWei</li> 
 * 	 <li>日期: 2020年2月25日下午1:40:38</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public class BookInfo {
	private Integer bookId;//图书ID
	private String bookName;//图书名称
	private String bookAuthor;//图书作者
	private Double bookPrice;//图书价格
	public BookInfo() {}
	public BookInfo(String bookName, String bookAuthor, Double bookPrice) {
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
	}
	public BookInfo(Integer bookId, String bookName, String bookAuthor, Double bookPrice) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public Double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(Double bookPrice) {
		this.bookPrice = bookPrice;
	}
	
}
