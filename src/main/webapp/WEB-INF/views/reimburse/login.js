$(document).ready(function() {
	
	//页面加载完毕后,用户名文本框获取焦点
	$('#username').focus();

	//换一个验证码链接
	$('#changeCaptchaLink').click(function(){
		$('#captchaContainer').load(reach.getUrl('/security/captcha/change?tp=' + new Date().valueOf()));
	});
	
	//确定按钮
	$('#submitButton').button({
		icons: {
			primary: "ui-icon-key"
		}
	});
	
	//重置按钮
	$('#resetButton').button({
		 icons: {
             primary: "ui-icon-arrowretur-1-w"
         }
	});
	
	//登录表单校验器
	$('#loginForm').validate({
		rules: {
			username: {
				required: true,
				maxlength: 50
			},
			password: {
				required: true,
				maxlength: 20
			},
			captcha: {
				required: true,
				maxlength: 4
			}
		}
	});
	$('#username').change(function(){
		$('#error').hide();
	});
	
});