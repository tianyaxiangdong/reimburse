
$(document).ready(function () {
	var defaults = {
		spacing_open: 3,
		initClosed: false,
		togglerTip_open: '关闭',
		togglerTip_closed: '打开',
		resizerTip: '调整尺寸',
		fxName: 'slide', // none, slide, drop, scale
		fxSpeed_open: 650,
		fxSpeed_close: 650,
		fxSettings_open: { easing: "easeOutBounce" },
		fxSettings_close: { easing: "easeOutBounce" }
	};

	var layoutOptions = {
		defaults: defaults,
		north: {
			paneSelector: '#northContainer',
			spacing_open: 0,
			showOverflowOnHover: true//防止pane中的下拉元素被遮罩
		},
		south: {
			paneSelector: '#southContainer',
			spacing_open: 0
		},
		center: {
			paneSelector: '#centerContainer'
		}
	};
	//应用布局选项进行布局
	var layout = $('body').layout(layoutOptions);


});