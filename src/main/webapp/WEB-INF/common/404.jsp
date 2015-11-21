<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%-- css --%>
<link type="text/css" href="${ctx }/css/ui.css" rel="stylesheet" />	
<title>页面不存在</title>
</head>
<body style="padding: 50px;">
	<div class="ui-widget">
		<div class="ui-state-error ui-corner-all" style="padding: 0 .7em;"> 
			<p><span class="ui-icon ui-icon-alert" style="float: left; margin-right: .3em;"></span> 
			<strong>警告:</strong> 您访问的页面不存在! <a href="<c:url value="/"/>">返回首页.</a></p>
		</div>
	</div>
</body>
</html>
