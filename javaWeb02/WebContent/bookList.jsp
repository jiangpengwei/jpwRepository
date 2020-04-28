<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page
	import="com.java.dao.BookInfoDao,com.java.dao.impl.BookInfoDaoImpl,java.util.*,com.java.model.BookInfo"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>jsp脚本元素操作数据库</title>
</head>
<body>
	<%
		BookInfoDao bookInfoDao = new BookInfoDaoImpl();
		List<BookInfo> bookList = bookInfoDao.findAllBookInfo();
	%>

	<table border="1px" cellspacing="0" align="center">
		<tr>
			<th colspan="4">图书信息</th>
		</tr>
		<tr>
			<th>图书编号</th>
			<th>图书名称</th>
			<th>图书作者</th>
			<th>图书价格</th>
		</tr>
		<%
			for (int i = 0; i < bookList.size(); i++) {
		%>
		<tr>
			<td><%=bookList.get(i).getBookId()%></td>
			<td><%=bookList.get(i).getBookName()%></td>
			<td><%=bookList.get(i).getBookAuthor()%></td>
			<td><%=bookList.get(i).getBookPrice()%></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>