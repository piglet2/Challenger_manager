<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/common/jspHeader.jsp"%>

<h2 align="center">新增应用</h2>

<form id="search" class="navbar-form navbar-left" role="search"
			action="/application/add"  method="post">
	<table class="table table-striped">
			<tr>
				<th>名称</th>
				<th><input type="text" id="name"  name="name"/></th>
			</tr>
			<tr>
				<th>图片</th>
				<th><input type="text" id="icon"   name="icon"/></th>
			</tr>
			<tr>
				<th>颜色</th>
				<th><input type="text" id="color"  name="color"  /></th>
			</tr>
			<tr>
				<th>路径</th>
				<th><input type="text" id="url"   name="url" /></th>
			</tr>
			<tr>
				<th>权重</th>
				<th>
					<select name="sort"  id="sort"  >
						<option value="0">0</option>
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
						<option value="5">5</option>
						<option value="6">6</option>
						<option value="7">7</option>
						<option value="8">8</option>
						<option value="9">9</option>
    				</select>
				</th>
			</tr>
			<tr>
				<th>是否显示</th>
				<th>
					<select name="show" id="show" >
						 <option value="true">显示</option>
						<option value="false">不显示</option>
    				</select>
				</th>
				</tr>
	</table>
	<button id="add" type="submit" class="btn btn-default" style="margin-right: 50px;">提交</button>
	<button id="add" class="btn btn-default" onclick="JavaScript :history.back(-1)">返回</button>
</form>