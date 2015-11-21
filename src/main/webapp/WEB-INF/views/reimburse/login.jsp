<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div id="content" class="ui-widget ui-widget-content ui-corner-all" style="width:300px;height:200px;margin:100px auto;">
	<div class="ui-dialog-titlebar ui-widget-header ui-corner-all ui-helper-clearfix">登录</div>
	<form id="loginForm" action="${ctx }/security/login" method="post">
		<table>
			<col width="70px"/>
			<col width="280px"/>
			<tr>
				<td class="label">
					用户名：
				</td>
				<td >
					<input id="username" name="username" type="text" />
				</td>
			</tr>
			<tr>
				<td class="label">
					密　码：
				</td>
				<td >
					<input id="password" name="password" type="password" />
				</td>
			</tr>
			<c:if test="${needCaptcha }">
				<tr>
					<td class="label">
						验证码：
					</td>
					<td >
						<input name="captcha" type="text" />
					</td>
				</tr>
				<tr>
					<td class="label"></td>
					<td>
						<span id="captchaContainer"><img src="${ctx }/security/captcha" /></span>
						<a id="changeCaptchaLink" href="javascript:void(0);">换一个</a>
					</td>
				</tr>
			</c:if>
			<tr>
				<td class="label">
				</td>
				<td >
					<button id="submitButton" type="submit">登录</button>
					&nbsp;&nbsp;
					<button id="resetButton" type="reset">重置</button>
				</td>
			</tr>
		</table>
	</form>

	<c:if test="${param.success eq false}">
		<div class="ui-widget error">
			<div class="ui-state-error ui-corner-all" style="padding: 0 .7em;">
				<p><span class="ui-icon ui-icon-alert" style="float: left; margin-right: .3em;"></span>
					<strong>警告:</strong>${param.message }</p>
			</div>
		</div>
	</c:if>
</div>

<!--[if lt IE 7]>
<div class="ui-widget">
<div class="ui-state-error ui-corner-all" style="padding: 0 .7em;">
<p><span class="ui-icon ui-icon-alert" style="float: left; margin-right: .3em;"></span>
<strong>警告:</strong> 您正在使用的Internet Explorer版本过旧，为了更好的使用本系统，请 <a href="http://windows.microsoft.com/zh-CN/internet-explorer/downloads/ie?ocid=ie6_countdown_bannercode">升级您的Internet Explorer</a>。</p>
</div>
</div>
<![endif]-->
