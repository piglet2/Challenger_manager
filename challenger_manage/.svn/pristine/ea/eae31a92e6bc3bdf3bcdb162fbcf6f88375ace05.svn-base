<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/common/jspHeader.jsp"%>

<%-- 来来来，客官，添点备注吧，Come on, Baby --%>

<div class="container">
<br><br><br><br><br>


	<form class="form-horizontal" method="get" action="/login">	
		<div class="form-group">
			<label class="col-md-offset-2 col-md-2 control-label"></label>
			<div class="col-md-4">
			<h1>Challenger_manage</h1>				
			</div>
		</div>
		<br>
		<div class="form-group">
			<label class="col-md-offset-2 col-md-2 control-label">用户名</label>
			<div class="col-md-4">
				<input id="userNameTxt" name="login_name" class="form-control" placeholder="请输入用户名" required autofocus>
			</div>
		</div>

		
		<div class="form-group">
			<label class="col-md-offset-2  col-md-2 control-label">密码</label>
			<div class="col-md-4">
				<input type="password" class="form-control" id="password" name="password" placeholder="请输入密码" required />
			</div>
		</div>

		<div class="form-group">
			<div class="col-md-offset-4 col-md-4">
				<div class="checkbox">
					<label> <input type="checkbox" id="rememberMeChk" name="rememberMe"/>下次自动登陆
					</label>
				</div>
			</div>
		</div>

		<div class="form-group">
			<div class="col-md-offset-4 col-md-4">
				<button class="btn btn-lg btn-primary btn-block" id="loginBtn">登录了哦</button>
			</div>
		</div>		
	</form>

</div>

<script>
//自动登录
$().ready(function(){
	//记住用户账户
	$("#rememberMeChk").click(function(){
		if($(this).prop("checked")){
			$.setLocalStorage("loginId",$("#userNameTxt").val());
			$.setLocalStorage("password",$("#password").val());
		}else{
			$.removeLocalStorage("loginId");
			$.removeLocalStorage("password");
		}
	})
	
	//检查是否要自动登录
	if($.getLocalStorage("loginId") && $.getLocalStorage("password")){
		$("#rememberMeChk").prop("checked",true);
		$("#userNameTxt").val($.getLocalStorage("loginId"));
		$("#password").val($.getLocalStorage("password"));
		
		$("#loginBtn").text("登录中...");
		setTimeout(function(){
			$("#loginBtn").click();
		},2000)
		
	}
})

</script>