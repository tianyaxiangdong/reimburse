<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>

<div class="ui-widget-header ui-corner-top">
	修改密码
</div>
<div id="contentContainer" class="ui-widget-content">
	<form id="updateForm" method="post" action="${ctx }/security/change-pwd">
		<table>
			<col width="80px"/>
			<col width="300px"/>
			<tr>
				<td class="label">
					原始密码：
				</td>
				<td>
					<input type="password" name="oldPwd" />
				</td>
			</tr>
			<tr>
				<td class="label">
					新密码：
				</td>
				<td>
					<input type="password" id="newPwd" name="newPwd" />
				</td>
			</tr>
			<tr>
				<td class="label">
					确认新密码：
				</td>
				<td>
					<input type="password" name="confirmNewPwd" />
				</td>
			</tr>
			<tr>
				<td class="label">
				</td>
				<td>
					<button id="saveButton" type="submit">保存</button>
					<button id="resetButton" type="reset">重置</button>
				</td>
			</tr>
		</table>
		<c:choose>
			<c:when test="${param.success eq true}">
				<div class="ui-widget">
					<div class="ui-state-highlight ui-corner-all" style="padding: 0 .7em;">
						<p><span class="ui-icon ui-icon-info" style="float: left; margin-right: .3em;"></span>
							<strong>成功:</strong>密码修改成功!</p>
					</div>
				</div>
			</c:when>
			<c:when test="${param.success eq false }">
				<div class="ui-state-error ui-corner-all" style="padding: 0 .7em;">
					<p><span class="ui-icon ui-icon-alert" style="float: left; margin-right: .3em;"></span>
						<strong>失败:</strong>${param.message }</p>
				</div>
			</c:when>
		</c:choose>
	</form>
</div>