<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查看评论页面</title>
</head>
<body>
	<div style="border: 1px solid black; width: 600px;">
		<div>
			<span style="font-size: 35px">评论列表</span>&nbsp;&nbsp;&nbsp;&nbsp; <input
				type="button" onClick="javascript :history.back(1);" value="返回新闻列表">
		</div>
		<div>
			<table border="1">
				<tr>
					<th>评论编号</th>
					<th>评论内容</th>
					<th>评论人</th>
					<th>评论时间</th>
				</tr>
				<c:forEach var="a" items="${list }">
					<tr>
						<td>${a.id }</td>
						<td>${a.content }</td>
						<td>${a.author }</td>
						<td>${a.createdate }</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>