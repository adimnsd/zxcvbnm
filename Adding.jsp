<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新增数据</title>
<script src="js/jquery-2.1.4.min.js"></script>
</head>
<body>
	报表名称：<input type="text" id="rpt_name"><br>
	报告类型：<input type="text" id="rpt_type"><br>
	报告用途：<input type="text" id="rpt_usage"><br>
	报告年月：<input type="text" id="rpt_ym"><br>
	生成时间：<input type="text" id="make_time"><br>
	报告状态：<input type="text" id="status_code"><br>
	<input type="button" value="提交" id="btn">
</body>
<script type="text/javascript">
$(function(){
	$("#btn").click(function(){
		$.ajax({
			url:"sale",
			type:"post",//数据提交方式post get
			//数据提交的地址servlet
			data:{	//提交的数据
				"opr":1,//1代表新增功能
				"rpt_name":$("#rpt_name").val(),
				"rpt_type":$("#rpt_type").val(),
				"rpt_usage":$("#rpt_usage").val(),
				"rpt_ym":$("#rpt_ym").val(),
				"make_time":$("#make_time").val(),
				"status_code":$("#status_code").val()
			},
			success:function(res){
				if(res > 0){
					alert("新增成功");
					location.href("sale");
				}else{
					alert("新增失败");
				}
			},
			error:function(){
				alert("ajax执行错误！");
			}
		})
	})
})
</script>
</html>