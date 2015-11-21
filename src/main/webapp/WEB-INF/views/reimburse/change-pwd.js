$(document).ready(function() {

	//保存按钮
	$('#saveButton').button({
		icons: {
			primary: "ui-icon-disk"
		}
	});
	
	//重置按钮
	$('#resetButton').button({
		 icons: {
             primary: "ui-icon-arrowretur-1-w"
         }
	});
	
	$('#updateForm').validate({
		rules: {
			oldPwd: {
				required: true,
				maxlength: 20,
				remote: {
					url: reach.getUrl('/security/validate-pwd'),
					type: 'post'
				}
			},
			newPwd: {
				required: true,
				maxlength: 20
			},
			confirmNewPwd: {
				required: true,
				maxlength: 20,
				equalTo: '#newPwd'
			}
		},
		messages: {
			oldPwd: {
				remote: '原始密码输入错误',
				type: 'post'
			},
			confirmNewPwd: {
				equalTo: '两次密码输入不一致'
			}
		}
	});

});