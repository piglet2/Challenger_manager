<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/common/jspHeader.jsp"%>
<html>
<head>
<meta http-equiv="refresh" content="7;URL=http://localhost:8080/evaluation">

<script type="text/javascript">
	var time = 9;
	window.onload = function(){
		window.setInterval("showTime()", 1000);
	}
	function showTime(){
		document.getElementById("s").innerHTML = time;
		time--;
}
</script>
</head>

<body>
   <div align="center">
		<br> <img height=211 src="/resources/img/error.gif" width=329>
		<br>
		<br> <span id="s" style="color: orange; font-size: 28px;">10</span>
		秒后跳到<a href="${pageContext.request.contextPath }/evaluation">首页</a>

	</div>
</body>
</html>

