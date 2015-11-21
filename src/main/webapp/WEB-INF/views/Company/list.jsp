<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: BMjishu100
  Date: 2015/11/21
  Time: 11:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title></title>
  <style>
    .td td{border:solid 1px #add9c0;}
  </style>
</head>
<body>
<table>
  <tr>
    <td>公司名称：<input name="companyName"/></td>
    <td>
      公司类型：
      <select id="companyType">
        <option value="1">团结</option>
        <option value="2">月结</option>
        <option value="3">散客</option>
      </select>
    </td>
    <td>联系人：<input name=""/></td>
    <td><input type="button" value="搜索"/></td>
  </tr>
  <tr>
    <td><a href="/Company/new"><input type="button" value="添加公司"/></a></td>
    <td><input type="button" value="交易导入"/></td>
  </tr>
</table>
<table style="border:solid 1px #add9c0;" class="td">
  <tr>
    <td>修改</td>
    <td>公司名称</td>
    <td>公司类型</td>
    <td>联系人/电话</td>
    <td>公司备注</td>
    <td>实付金额</td>
    <td>实收金额</td>
    <td>去年实付金额</td>
    <td>去年实收金额</td>
    <td>历年实付金额</td>
    <td>历年实收金额</td>
  </tr>
  <c:forEach var="company"  items="${list_company}">
    <tr>
        <td><a href="#">修改</a></td>
        <td>${company.companyName}</td>
        <td>${company.companyJsTypeId}</td>
        <td>${company.companyLxr}</td>
        <td>${company.companyBz}</td>
        <td>${company.companySfje}</td>
        <td>${company.companySsje}</td>
        <td>${company.companyQnsfje}</td>
        <td>${company.companyQnssje}</td>
        <td>${company.companyLnsfje}</td>
        <td>${company.companyLnssje}</td>
  </tr>
  </c:forEach>

</table>
</body>
</html>
