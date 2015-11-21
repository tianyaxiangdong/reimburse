<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/common/prelude.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%-- css --%>
<tiles:insertDefinition name=".reimburse/commons-css"/>
<tilesx:useAttribute id="cssList" name="css" classname="java.util.List" />
<c:forEach var="item" items="${cssList}">
	<link type="text/css" href="${ctx }${item}" rel="stylesheet"/>
</c:forEach>
<%-- javascript --%>
<tiles:insertDefinition name=".reimburse/commons-javascript" />
<tilesx:useAttribute id="jsList" name="js" classname="java.util.List" />
<c:forEach var="item" items="${jsList}">
	<script type="text/javascript" src="${ctx }${item}"></script>
</c:forEach>

<title><tiles:getAsString name="title"/></title>
</head>
<body>
	<tiles:insertAttribute name="center"/>
</body>
</html>