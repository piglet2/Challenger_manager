<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/common/jspHeader.jsp"%>

<h2 align="center">纵向评价</h2>
<table class="table table-striped">
	<thead>
		<tr>
			<th>序号</th>
			<th>上级姓名（id）</th>
			<th>上级体系</th>
			<th>上级部门</th>
			<th>上级驻址</th>
			<th>下级姓名（id）</th>
			<th>下级体系</th>
			<th>下级部门</th>
			<th>下级驻址</th>
			<th>评论周期</th>
		    <th>意志</th>
			<th>智慧</th>
			<th>博爱</th>
			<th>备注</th>
			<th>评论时间</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${evaluations }" var="evaluation" varStatus="status">
			<tr>
				<td>${status.index+1 }</td>
				<td>${evaluation.manager }<br>（${evaluation.managerId }）</td>
				<td>${evaluation.managerDivision }</td>
				<td>${evaluation.managerDepartment }</td>
				<td>${evaluation.managerLocation }</td>
				<td>${evaluation.user }<br>（${evaluation.userId }） </td>
				<td>${evaluation.userDivision }</td>
				<td>${evaluation.userDepartment }</td>
				<td>${evaluation.userLocation }</td>
				<td>${evaluation.period }</td>
				<td><span style="color:red;">（${evaluation.priseWill }分）</span>${evaluation.prosWill }</td>
				<td><span style="color:red;">（${evaluation.priseWisdom }分）</span>${evaluation.prosWisdom }</td>
				<td><span style="color:red;">（${evaluation.priseLove }分）</span>${evaluation.prosLove }</td>
				<td>${evaluation.remark}</td>
				<td>${evaluation.cts }</td>
			</tr>
		</c:forEach>
	</tbody>
</table>





