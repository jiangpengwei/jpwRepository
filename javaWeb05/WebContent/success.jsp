<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" import="com.web.model.UserInfo,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
		<meta charset="utf-8">
		<title>登录成功界面</title>
		<script type="text/javascript" src="js/jquery-3.3.1.js"></script>
	</head>
	<body>
		<%
			UserInfo userInfo=(UserInfo)session.getAttribute("currentUserInfo");
		%>
		
		<h3 align="center">恭喜<%=userInfo.getU_name() %>登录成功！</h3>
		<center><a href="addUserInfo.jsp">新增用户</a>
			<input type="text" name="searchName" id="searchName"/>
			<button onclick=searchByName()>查询</button>
			<a href="logout">注销</a>
		</center>
		<table border="1" cellspacing="0" align="center">
			<tr>
				<th>编码</th>
				<th>姓名</th>
				<th>密码</th>
				<th>操作</th>
			</tr>
			<%
				List<UserInfo> userList=(List<UserInfo>)request.getAttribute("userList");
				for(int i=0;i<userList.size();i++){
			%>	
				<tr>
					<td><%=userList.get(i).getU_id() %></td>
					<td><%=userList.get(i).getU_name() %></td>
					<td><%=userList.get(i).getU_pwd() %></td>
					<td>
						<a href="addUserInfo.jsp?u_id=<%=userList.get(i).getU_id() %>&u_name=<%=userList.get(i).getU_name() %>&u_pwd=<%=userList.get(i).getU_pwd() %>">修改</a>
						<a href="deleteUserInfo?u_id=<%=userList.get(i).getU_id() %>">删除</a>
					</td>
				</tr>
			
				
				<%}%>
		</table>
		<script type="text/javascript" src="js/searchByName.js">
		
		}
		</script>
	</body>
</html>