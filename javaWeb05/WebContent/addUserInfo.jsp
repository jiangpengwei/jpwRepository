<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>用户编辑页面</title>
<script type="text/javascript" src="js/jquery-3.3.1.js"></script>
</head>
<body>
<form action="addUserInfo" method="post">
	<p><input type="hidden" name="u_id" id="u_id"/></p>
		<table align="center">
			<tr>
				<td>用户名：</td>
				<td><input type="text" name="u_name" id="u_name"/></td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><input type="password" name="u_pwd" id="u_pwd"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="保存"/></td>
				<td><input type="reset" value="清空"/></td>
			</tr>
		</table>
	</form>
	<script type="text/javascript" src="js/editUserInfo.js"></script>
</body>
</html>