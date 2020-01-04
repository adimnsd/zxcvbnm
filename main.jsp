<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>主页面</title>
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="js/sc.js"></script>
</head>
<body>
	<div>
		<form action="main">
			<div>
				产品代码<input type="text" name="id" value="${id }"> 风险评级 <select name="risk">
					<option value="0">请选择</option>
					<option value="1">R1</option>
					<option value="2">R2</option>
					<option value="3">R3</option>
				</select> <input type="submit" value="查询">&nbsp;&nbsp;&nbsp;&nbsp;<a
					href="xz.jsp">新增理财信息</a>
			</div>
			<div>
				<table border="1">
					<tr>
						<th>产品代码</th>
						<th>风险评级</th>
						<th>预期收益</th>
						<th>发售起始日</th>
						<th>发售截止日</th>
						<th>产品到期日</th>
						<th>操作</th>
					</tr>
					<c:forEach var="b" items="${mList }">
						<tr>
							<td>${b.id }</td>
							<td>${b.risk }</td>
							<td>${b.income }</td>
							<td>${b.saleStarting }</td>
							<td>${b.saleEnd }</td>
							<td>${b.end }</td>
							<td><a href="xg?id=${b.id }">修改</a>&nbsp; <a href="#" onclick='sc("${b.id}")'>删除</a></td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</form>
	</div>
</body>
</html>