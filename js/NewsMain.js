$(function(){
	//使用ajax显示信息
	$.ajax({
		"url":"newsMain",
		"type":"post",
		"dataType":"json",
		"success":function(msg){
			var show = "";
			show+="<tr>";
			show+="<th>新闻编号</th>";
			show+="<th>新闻标题</th>";
			show+="<th>新闻摘要</th>";
			show+="<th>作者</th>";
			show+="<th>创建时间</th>";
			show+="<th>操作</th>";
			show+="</tr>";
			for(var i = 0; i < msg.xx.length; i++){
				show+="<tr>";
				show+="<td>"+msg.xx[i].id+"</td>";
				show+="<td>"+msg.xx[i].title+"</td>";
				show+="<td>"+msg.xx[i].summary+"</td>";
				show+="<td>"+msg.xx[i].author+"</td>";
				show+="<td>"+msg.xx[i].createdate+"</td>";
				show+="<td>";
				show+="<a href="+"newsCkpl?id="+msg.xx[i].id+">查看评论</a>&nbsp;";
				show+="<a href="+"newsId?id="+msg.xx[i].id+">评论</a>&nbsp;";
				show+="<a href="+"#"+" onclick= 'sc("+msg.xx[i].id+")'>删除</a>&nbsp;";
				show+="</td>";
				show+="</tr>";
			}
			show+="<tr>";
			show+="<td colspan="+6+" align="+"center"+">";
			show+="<a href="+"#"+" onclick= "+"cx(1)"+">首页</a>|";
			show+="<a href="+"#"+" onclick= 'cx("+(msg.ym-1)+")'>上一页</a>|";		
			show+="<a href="+"#"+" onclick= 'cx("+(msg.ym+1)+")'>下一页</a>|";			
			show+="<a href="+"#"+" onclick= 'cx("+msg.zys+")'>末页</a>&nbsp;";
			show+="第"+msg.ym+"页/共"+msg.zys+"页(共"+msg.zts+"条)";
			show+="</td>";
			show+="</tr>";
			$("#a table tr:eq(2)").parent().html(show);
		},
		"error":function(){
			alert("出错！");
		}
	});
});

//点击查询
function cx(ym){
	var newBt = $("[name='newBt']").val().trim();//获取查询条件
	
	//使用ajax查询信息
	$.ajax({
		"url":"newsMain",
		"type":"post",
		"data":{
			"newBt":newBt,
			"ym":ym
		},
		"dataType":"json",
		"success":function(msg){
			var show = "";
			show+="<tr>";
			show+="<th>新闻编号</th>";
			show+="<th>新闻标题</th>";
			show+="<th>新闻摘要</th>";
			show+="<th>作者</th>";
			show+="<th>创建时间</th>";
			show+="<th>操作</th>";
			show+="</tr>";
			for(var i = 0; i < msg.xx.length; i++){
				show+="<tr>";
				show+="<td>"+msg.xx[i].id+"</td>";
				show+="<td>"+msg.xx[i].title+"</td>";
				show+="<td>"+msg.xx[i].summary+"</td>";
				show+="<td>"+msg.xx[i].author+"</td>";
				show+="<td>"+msg.xx[i].createdate+"</td>";
				show+="<td>";
				show+="<a href="+"newsCkpl?id="+msg.xx[i].id+">查看评论</a>&nbsp;";
				show+="<a href="+"newsId?id="+msg.xx[i].id+">评论</a>&nbsp;";
				show+="<a href="+"#"+" onclick= 'sc("+msg.xx[i].id+")'>删除</a>&nbsp;";
				show+="</td>";
				show+="</tr>";
			}
			show+="<tr>";
			show+="<td colspan="+6+" align="+"center"+">";
			show+="<a href="+"#"+" onclick= "+"cx(1)"+">首页</a>|";
			show+="<a href="+"#"+" onclick= 'cx("+(msg.ym-1)+")'>上一页</a>|";
			show+="<a href="+"#"+" onclick= 'cx("+(msg.ym+1)+")'>下一页</a>|";
			show+="<a href="+"#"+" onclick= 'cx("+msg.zys+")'>末页</a>&nbsp;";
			show+="第"+msg.ym+"页/共"+msg.zys+"页(共"+msg.zts+"条)";
			show+="</td>";
			show+="</tr>";
			$("#a table tr:eq(2)").parent().html(show);
		},
		"error":function(){
			alert("出错！");
		}
	});
}

//删除
function sc(id){
	$.ajax({
		"url":"newsSc",
		"type":"post",
		"data":{
			"id":id
		},
		"dataType":"text",
		"success":function(msg){
			if(msg>0){
				alert("删除成功！");
				location.href("NewsMain.jsp");
			}else{
				alert("删除失败！");
			}
		}
	})
}