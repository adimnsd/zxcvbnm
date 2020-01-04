<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新增评论</title>
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="js/NewsXzpl.js"></script>
</head>
<body>
	<div>
		<div>
			<h2>增加评论</h2>
		</div>
		<div>
			<table border="1">
				<tr>
					<td>评论内容（*）</td>
					<td><input type="text" name="plnr"></td>
				</tr>
				<tr>
					<td>评论人</td>
					<td><input type="text" name="plr"></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="button" name="tj" value="提交">
						<input type="button" value="返回"></td>
				</tr>
			</table>
		</div>
	</div>
</body>
</html>