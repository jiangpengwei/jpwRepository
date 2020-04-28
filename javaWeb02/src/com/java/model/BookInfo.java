package com.java.model;
/**
 * @�ļ���: BookInfo.java
 * @�๦��˵��: ͼ��ʵ����
 * @����: JiangPengWei
 * @Email: 352848100@qq.com
 * @����: 2020��2��25������1:40:38
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: JiangPengWei</li> 
 * 	 <li>����: 2020��2��25������1:40:38</li> 
 *	 <li>����: </li>
 * </pre>
 */
public class BookInfo {
	private Integer bookId;//ͼ��ID
	private String bookName;//ͼ������
	private String bookAuthor;//ͼ������
	private Double bookPrice;//ͼ��۸�
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
