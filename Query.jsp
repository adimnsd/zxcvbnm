<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询数据</title>
<script src="js/jquery-2.1.4.min.js"></script>
</head>
<body>
	<form action="sale?opr=2" method="post">
	<a href="Adding.jsp">新增信息</a><br>
		勘察意见：<input type="text" name="cha">
		<input type="submit" value="查询" id="btn">
		<table border="1" width="100%">
			<tr>
				<td>报表编号</td>
				<td>报表名称</td>
				<td>报告类型</td>
				<td>报告用途</td>
				<td>报告年月</td>
				<td>生成时间</td>
				<td>报告状态</td>
				<td>操作</td>
			</tr>
			<c:forEach items="${list }" var="a">
				<tr>
					<td>${a.rpt_no }</td>
					<td>${a.rpt_name }</td>
					<td>${a.rpt_type }</td>
					<td>${a.rpt_usage }</td>
					<td>${a.rpt_ym }</td>
					<td>${a.make_time }</td>
					<td>${a.status_code }</td>
					<td><a href="javascript:upd(${a.rpt_no} )">修改</a>&nbsp<a href="javascript:del(${a.rpt_no} )">删除</a></td>
				</tr>
			</c:forEach>
		</table>
	</form>
</body>
<script type="text/javascript">
  	function del(id){
	  	var a = window.confirm("是否删除数据？");
	  	if(a){
	  		$.ajax({
  			type:"post",
  			url:"sale",
  			data:{
  				opr:3,
  				id:id
  			},
  			dataType:"json",
  			success:function(res){
  				if(res>0){
  					alert("删除成功");
  					location.href("sale");
  				}else{
  					alert("删除失败");
  				}
  			},
  			error:function(){
  				alert("ajax执行错误！");
  			}
  			
  		});
	  	}
  	}
  	
  	function upd(id){
  		window.location.href = "Update.jsp?id=" + id;
  	}
  </script>
</html>