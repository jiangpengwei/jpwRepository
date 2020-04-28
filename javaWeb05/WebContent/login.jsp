<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>用户登录</title>
<script type="text/javascript" src="js/jquery-3.3.1.js"></script>
</head>
<body>
	<form action="loginAction" method="post">
	
		<table style="text-align: center">
			<tr>
				<th colspan="2">用户登录</th>
			</tr>
			<tr>
				<td colspan="2">
					<font color="red" id="error"></font>
				</td>
			</tr>
			<tr>
				<td>
				用户名:<input type="text" name="u_name" id="u_name"/>
				</td>
			</tr>
			
			<tr>
				<td>
				密码:<input type="password" name="u_pwd" id="u_pwd"/>
				</td>
			</tr>
			<tr>
				<td>
				<input type="submit" value="登录"/>
				<input type="reset" value="重置"/>
				</td>
			</tr>
		
		</table>	
		</form>
		
		<script type="text/javascript" src="js/login.js">
			
		</script>
</body>
</html>