<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/common/jspHeader.jsp"%>

<script>
	function check() {
		var file = document.getElementById('file').value;
		if (file == '') {
			alert("请选择上传文件");
			return false;
		}
		var stuff = file.substr(file.length - 4, 4);
		if (stuff != '.xls'&& stuff != 'xlsx') {
			alert('文件类型不正确，请选择xls或xlsx文件');
			return false;
		}
		return true;
	}
	
</script>

<form enctype="multipart/form-data" onsubmit="return check()" class="form-horizontal" method="post" action="/evaluation/upload">
  <div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">请上传文件</label>
    <div class="col-sm-10">
      <input id="file" type="file" class="form-control"  name="file" placeholder="文件名">
      <br>
	      <div class="btn-group" id="color" data-toggle="buttons">
			<label class="btn btn-default"> <input type="radio"
				name="code" id="MDeva" value="1" checked> 纵向
	
			</label> <label class="btn btn-default"> <input type="radio"
				name="code" id="TDeva" value="2"> 横向
			</label>
		 </div>
    </div>
  </div>
  
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-default">导入</button>
    </div>
  </div>
  
</form>




