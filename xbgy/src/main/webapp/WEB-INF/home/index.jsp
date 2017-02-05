<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
 <head>
    <meta charset="utf-8">
	<title>Insert title here</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap-theme.min.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/index.css">
</head>
<body>
	<!-- 顶部 -->
  	<nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container-fluid">
        <div class="navbar-header">
          <a class="navbar-brand" href="#">多媒体教室管理系统</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
        	<!-- 登录 -->
        	<!-- 用户信息 -->
        	<c:if test="${userInfo != null}">
	        	<ul class="nav navbar-nav navbar-right">
		            <li><label style="line-height: 50px; font-size: 15px; color: #ccc">欢迎你,${userInfo.username }</label></li>
		            <li><a href="#">设置</a></li>
		            <li><a href="#">帮助</a></li>
		             <li><a href="${pageContext.request.contextPath}/user/logout">登出</a></li>
	          	</ul>
          	</c:if>
        </div><!--/.navbar-collapse -->
      </div>
    </nav>

    <div class="container-fluid">
      <div class="blog-header"></div>
      <div class="row">
		<div class="col-sm-2 sidebar">
			<ul class="nav nav-sidebar">
	            <li><a href="test.jsp" target="main">会议室管理</a></li>
	            <li><a href="#">用户管理</a></li>
	            <li><a href="#">Analytics</a></li>
	            <li><a href="#">Export</a></li>
          	</ul>
          	<ul class="nav nav-sidebar">
	            <li><a href="#">会议室管理</a></li>
	            <li><a href="#">用户管理</a></li>
	            <li><a href="#">Analytics</a></li>
	            <li><a href="#" target="main">Export</a></li>
          	</ul>
        </div><!-- /.sidebar -->

        <div id="main" class="col-sm-9 blog-main">
        	<h1>会议室管理</h1>
        	<!-- 搜索框 -->
        	<div class="form-inline form-group">
	        	<input type="text" placeholder="编号" class="form-control">
	        	<select class="form-control">
				  <option>1</option>
				  <option>2</option>
				  <option>3</option>
				  <option>4</option>
				  <option>5</option>
				</select>
	        	<label class="checkbox-inline">
				  <input type="checkbox" id="inlineCheckbox1" value="option1"> 可用
				</label>
				<label class="checkbox-inline">
				  <input type="checkbox" id="inlineCheckbox2" value="option2"> 禁用
				</label>
	       		<button type="button" class="btn btn-info">查找</button>
	       		
	       		<!-- 操作按钮 -->
	       		<div class="btn-group pull-right">
	       			<button type="button" class="btn btn-primary">新增</button>
		       		<button type="button" class="btn btn-primary">修改</button>
		       		<button type="button" class="btn btn-danger">删除</button>
	       		</div>
        	</div>
        	
        	<!-- 表单 -->
        	<table class="table table-striped">
        		<thead>
        			<tr><th>全选</th><th>序号</th><th>编号</th><th>描述</th><th>类型</th><th>状态</th><th>最后编辑日期</th></tr>
       			</thead>
        		<tbody>
        			<tr><td><input type="checkbox"></td><td>1</td><td>17-201</td><td>多媒体教室</td><td>多媒体</td><td>可用</td><td>2017.1.2</td></tr>
        			<tr><td><input type="checkbox"></td><td>2</td><td>15-306</td><td>会议室</td><td>会议室</td><td>可用</td><td>2017.1.3</td></tr>
        			<tr><td><input type="checkbox"></td><td>3</td><td>12-506</td><td>会议室</td><td>会议室</td><td>禁用</td><td>2017.1.3</td></tr>
       			</tbody>
       		</table>
       		
       		<!-- 分页 -->
       		<nav aria-label="Page navigation" style="text-align: center">
			  <ul class="pagination">
			    <li>
			      <a href="#" aria-label="Previous">
			        <span aria-hidden="true">&laquo;</span>
			      </a>
			    </li>
			    <li><a href="#">1</a></li>
			    <li><a href="#">2</a></li>
			    <li><a href="#">3</a></li>
			    <li><a href="#">4</a></li>
			    <li><a href="#">5</a></li>
			    <li>
			      <a href="#" aria-label="Next">
			        <span aria-hidden="true">&raquo;</span>
			      </a>
			    </li>
			  </ul>
			</nav>
			
        </div>
      </div><!-- /.row -->

    </div><!-- /.container -->
    
	<footer class="blog-footer">
      <p>Blog template built for <a href="http://getbootstrap.com">Bootstrap</a> by <a href="https://twitter.com/mdo">@mdo</a>.</p>
      <p>
        <a href="#">Back to top</a>
      </p>
    </footer>
</body>
<script src='${pageContext.request.contextPath}/js/jquery-1.11.min.js'></script>
<script src='${pageContext.request.contextPath}/js/bootstrap.min.js'></script>
<script type="text/javascript">
		function ajaxload(local){
		    var htmlobj=$.ajax({url:local,async:false});
		    $("#main").html(htmlobj.responseText);
		}	
		$(document).ready(function(){
			var pagePath = "${pageContext.request.contextPath}/index.html";
			//ajaxload(pagePath);
			
			
		})
		
</script>
</html>