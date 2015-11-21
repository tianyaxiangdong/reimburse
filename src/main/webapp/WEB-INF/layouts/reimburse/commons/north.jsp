<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div class="uiheader">
	<div class="uiheader_titlebar">
		<h1 class="applicationTitle">Reimburse</h1>
		<h2 class="tagline">Reach <span class="taglineEm">1</span></h2>
		<div class="topNav">
			<ul class="menu-right">
				<li>欢迎 <a href="javascript:void(0);"><shiro:principal/></a></li>
				<li><a href="javascript:void(0);"  onclick="javascript:window.location.href='${ctx }/security/logout';">注销</a></li>
				<li><a href="javascript:void(0);"  onclick="javascript:reimburse.openWindow({name: 'changePwdWindow',url: reimburse.getUrl('/security/change-pwd'),width: 500,height: 240});">修改密码</a></li>
			</ul>
		</div>
	</div>
</div>
<div class="uimenubar">

</div>
