<%--
  Created by IntelliJ IDEA.
  User: BMjishu100
  Date: 2015/11/21
  Time: 10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<form action="/Company/newAdd" method="post">
<table>
  <tr>
    <td>公司名称：</td>
    <td><input name="companyName"/></td>
  </tr>
  <tr>
    <td>结算类型：</td>
    <td>
      <select name="companyJsTypeId">
        <option value="1">团结</option>
        <option value="2">月结</option>
        <option value="3">散客</option>
      </select>
    </td>
  </tr>
  <tr>
    <td>联系人：</td>
    <td><input name="companyLxr"/></td>
  </tr>
  <tr>
    <td>电话：</td>
    <td><input name="companyLxdh"/></td>
  </tr>
  <tr>
    <td>公司备注：</td>
    <td><textarea name="companyBz"></textarea></td>
  </tr>
  <tr>
    <td colspan="2"><input type="submit" value="确 定"/></td>
  </tr>
</table>
</form>
</body>
</html>
