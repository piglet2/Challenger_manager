<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/common/jspHeader.jsp"%>

<script type="text/javascript" src="/resources/js/jquery-1.6.4.js"></script>

<!-- <script type="text/javascript">
    $(function(){
    	 $("#select").click(function(){
  		   $("#search").submit();
      });
    });
   
</script> -->

<nav class="navbar navbar-fixed-top navbar-inverse" id="header_nav">
	<div class="container-fluid">
   
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="/">Challenger_manage</a>
    </div>
    
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
      <!--  <li class="active"><a href="/evaluation">评论列表<span class="sr-only">(current)</span></a></li>  -->
        <li class="dropdown">
         <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">评论列表 <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="/evaluation?code=1">纵向评论</a></li>
            <li><a href="/evaluation?code=2">横向评论</a></li>
          </ul>
        </li>
      </ul>
		<form id="search" class="navbar-form navbar-left" role="search"
			action="/evaluation/select" method="get">
			<div class="form-group">
				<input type="text" name="condition" style="width: 320px;"
					class="form-control" placeholder="根据用户名或id或周期id或时间查询">
			</div>
			<div class="btn-group" id="color" data-toggle="buttons">
				<label class="btn btn-default"> 
				     <input type="radio" name="code" id="MDeva" value="1"> 纵向
					
				</label > 
				<label class="btn btn-default"> 
				    <input type="radio" name="code" id="TDeva" value="2"> 横向
					
				</label>
			</div>
			<div class="btn-group" id="color" data-toggle="buttons">
				<label class="btn btn-default"> 
				     <input type="radio" name="mode" id="send" value="1"> 发出
					
				</label > 
				<label class="btn btn-default"> 
				    <input type="radio" name="mode" id="get" value="2"> 收到
					
				</label>
			</div>
			<button id="select" type="submit" class="btn btn-default">Submit</button>
		</form>
		
		
		<form id="search" class="navbar-form navbar-left" role="search"
			action="/application/select" method="get">
			<button id="select" type="submit" class="btn btn-default">其他应用</button>
		</form>
		<ul class="nav navbar-nav navbar-right">
		</ul>
		</div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>

