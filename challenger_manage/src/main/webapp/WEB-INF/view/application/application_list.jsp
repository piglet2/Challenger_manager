<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/common/jspHeader.jsp"%>

<h2 align="center">第三方应用列表</h2>
<table class="table table-striped">
	<thead>
		<tr>
			<th>序号</th>
			<th>名称</th>
			<th>图片</th>
			<th>颜色</th>
			<th>路径</th>
			<th>权重</th>
			<th>是否显示</th>
			<th>修改时间</th>
			<th>操作</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${applications}" var="application" varStatus="status">
			<tr>
				<td>${status.index+1 }</td>
				<td>${application.name }</td>
				<td>${application.icon }</td>
				<td>${application.color }</td>
				<td>${application.url }</td>
				<td>${application.sort }</td>
				<td>${application.show }</td>
				<td>${application.cts }</td>
				<td>
					<form id="search" class="navbar-form navbar-left" role="search" action="/application/delete" method="post">
						<input name="id" id="id" type="hidden"  value="${application.id }" />
						<button id="delete" type="submit" class="btn btn-default">删除</button>
					</form>
					<form id="search" class="navbar-form navbar-left" role="search" action="/application/toUpdate" method="post">
						<input name="id" id="id" type="hidden"  value="${application.id }" />
						<button id="update"  type="submit" class="btn btn-default"  >修改</button>
					</form>
				</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="/application/toAdd"><button id="add"  class="btn btn-default"  >新增</button></a>
