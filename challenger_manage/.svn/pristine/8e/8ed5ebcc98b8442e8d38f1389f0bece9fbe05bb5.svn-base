<%--每个JSP页面都是这样的 --%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/common/jspHeader.jsp"%>

<%--注意：在JSP页面中，使用这样的注释，目的是为了保证在前台页面中不打印出来 --%>
<html>
<head>
<%--网站的整体头部 --%>
<title><tiles:insertAttribute name="title"></tiles:insertAttribute></title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="keywords" content="<tiles:insertAttribute name="keyword" />">
<meta name="description" content="<tiles:insertAttribute name="description"/>">
<meta charset="utf-8">

<%--静态资源文件 --%>
<tiles:insertAttribute name="static"></tiles:insertAttribute>
</head>


<body>
	<tiles:insertAttribute name="header" defaultValue="/WEB-INF/view/templates/base/header.jsp" />
	
	<div class="container-fluid">
		<div class="row">
		 <div class="col-md-2">				
				<ul class="nav nav-pills nav-stacked">
					<tiles:insertAttribute name="left_nav" />
				</ul>
		</div>
		<div class="col-md-10 col-md-offset-2">			
				<div id="content">
					<tiles:insertAttribute name="body" />
				</div>
				<br>
				<br>
				
				<%--
				<bs:page-header size="3">
					功能规划：
				</bs:page-header>

				<tiles:insertAttribute name="dev" />
				 --%>
			</div>
		</div>

	</div>

	<%--
	<tiles:insertAttribute name="footer" defaultValue="/WEB-INF/view/templates/base/footer.jsp" />
 --%>
</body>
</html>

