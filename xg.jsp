<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改页面</title>
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="js/xgxx.js"></script>
</head>
<body>
	<div>
		<div>
			<table>
				<tr>
					<td colspan="2" align="center">
						<h3>修改</h3>
					</td>
				</tr>
				<tr>
					<td>产品代码:</td>
					<td>${ff.id }</td>
				</tr>
				<tr>
					<td>风险评级:</td>
					<td><select name="risk">
							<c:choose>
								<c:when test="${ff.risk == 1}">
									<option selected="selected" value="1">R1</option>
									<option value="2">R2</option>
									<option value="3">R3</option>
								</c:when>
								<c:when test="${ff.risk == 2}">
									<option value="1">R1</option>
									<option selected="selected" value="2">R2</option>
									<option value="3">R3</option>
								</c:when>
								<c:when test="${ff.risk == 3}">
									<option value="1">R1</option>
									<option value="2">R2</option>
									<option selected="selected" value="3">R3</option>
								</c:when>
							</c:choose>
							
					</select></td>
				</tr>
				<tr>
					<td>预计收益:</td>
					<td><input type="text" name="income" value="${ff.income }"></td>
				</tr>
				<tr>
					<td>发售起始日:</td>
					<td><input type="text" name="saleStarting" value="${ff.saleStarting }"></td>
				</tr>
				<tr>
					<td>发售截止日:</td>
					<td><input type="text" name="saleEnd" value="${ff.saleEnd }"></td>
				</tr>
				<tr>
					<td>产品到期日:</td>
					<td><input type="text" name="end" value="${ff.end }"></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="button" value="提交"
						name="tj" id="xz">&nbsp;<input type="button" value="返回"></td>
				</tr>
			</table>
		</div>
	</div>
</body>
</html>