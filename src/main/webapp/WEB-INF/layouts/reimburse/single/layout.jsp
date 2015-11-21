<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%-- css --%>
<tiles:insertDefinition name=".reimburse/commons-css"/>
<tiles:useAttribute id="cssItems" name="css" classname="java.util.List" />
<c:forEach var="cssItem" items="${cssItems }">
<link type="text/css" href="${ctx }${cssItem}" rel="stylesheet" />
</c:forEach>
<%-- javascript --%>
<tiles:insertDefinition name=".reimburse/commons-javascript" />
<tiles:useAttribute id="jsItems" name="js" classname="java.util.List" />
<c:forEach var="jsItem" items="${jsItems }">
<script type="text/javascript" src="${ctx }${jsItem}"></script>
</c:forEach>

<title><tiles:getAsString name="title"/></title>
</head>
<body>
	<tiles:insertAttribute name="center"/>
</body>
</html>