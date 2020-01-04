$(function(){
	//点击提交
	$("[name='tj']").click(function(){
		var plnr = $("[name='plnr']").val().trim();
		var plr = $("[name='plr']").val().trim();
		
		if(plnr == ""){
			alert("评论内容不能为空！");
			return;
		}
		//使用ajax新增信息
		$.ajax({
			"url":"newsXzpl",
			"type":"post",
			"data":{
				"plnr":plnr,
				"plr":plr
			},
			"dataType":"text",
			"success":function(msg){
				if(msg>0){
					alert("新增成功！");
					location.href("NewsMain.jsp");
				}else{
					alert("新增失败！");
				}
			}
		});
	});
});