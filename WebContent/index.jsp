<html>
<head>
<meta charset="UTF-8" />
<title>lcky</title>
<script type="text/javascript" src="/wxpay/js/lib/jquery-1.9.1.min.js"></script>

</head>
<body  style="height:100%">
<div id="addSegoAdd" style="overflow-y:scroll;height:101%">
This is my index page!<br/>
This is my index page!<br/>
This is my index page!<br/>
This is my index page!<br/>
This is my index page!<br/>
This is my index page!<br/>
This is my index page!<br/>
This is my index page!<br/>
This is my index page!<br/>
This is my index page!<br/>
This is my index page!<br/>
This is my index page!<br/>
This is my index page!<br/>
This is my index page!<br/>
This is my index page!<br/>
This is my index page!<br/>
This is my index page!<br/>
This is my index page!<br/>
 <!--加载更多按钮-->
 <div class="js-load-more">加载更多</div>

</div>

<script>
    //获取滚动条当前的位置 
	function getScrollTop() { 
		var scrollTop = 0; 
		if (document.documentElement && document.documentElement.scrollTop) { 
			scrollTop = document.documentElement.scrollTop; 
		} else if (document.body) { 
			scrollTop = document.body.scrollTop; 
		}
		return scrollTop; 
	};

    //获取当前可视范围的高度 
	function getClientHeight() { 
		var clientHeight = 0; 
		if (document.body.clientHeight && document.documentElement.clientHeight) { 
			clientHeight = Math.min(document.body.clientHeight, document.documentElement.clientHeight); 
		} else { 
			clientHeight = Math.max(document.body.clientHeight, document.documentElement.clientHeight); 
		} 
    	return clientHeight; 
    };

    //获取文档完整的高度 
	function getScrollHeight() {
		return Math.max(document.body.scrollHeight, document.documentElement.scrollHeight); 
	}
	window.onscroll = function () {
		if (getScrollHeight()-(getScrollTop() + getClientHeight())<10) {
			var $li = $("<li class='inner'></li>");
			var smgoSego = $('#addSegoAdd');
			var $divFir = $("<div></div>");
			$divFir.html("加载进来了");
			var $divSco = $("<br/>");
			$li.append($divFir);
			$li.append($divSco);
			smgoSego.append($li);
			//ajax从这里开始
		}
	}
</script>

</body>
</html>