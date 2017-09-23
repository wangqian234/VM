<script type="text/javascript" src="${ctx}/js/lib/jquery-1.9.1.min.js"></script>
<script type="text/javascript"
	src="${ctx}/js/lib/jquery.json-2.2.min.js"></script>
<div class="side-menu sidebar-inverse">
	<nav class="navbar navbar-default" role="navigation">
		<div class="side-menu-container">
			<div class="navbar-header"  style="background-color:rgba(124, 189, 187, 1)" >
				<a class="navbar-brand" href="#">
					<div class="icon"><img src="/VM/img/lg2-50.png"  height="25" width="25"/></div>
					<div class="title">公元物业管理平台</div>
				</a>
				<button type="button"
					class="navbar-expand-toggle pull-right visible-xs">
					<i class="fa fa-times icon"></i>
				</button>
			</div>
			<ul class="nav navbar-nav">
				<!-- <li class="active"><a href="index.html"> <span
						class="icon fa fa-tachometer"></span><span class="title">公元物业管理平台</span>
				</a></li> -->
				<li class="panel panel-default dropdown">
				<a data-toggle="collapse" href="#dropdown-element"> 
					<span class="icon fa fa-desktop"></span><span class="title">设备基本信息</span>
				</a> <!-- Dropdown level 1 -->
					<div id="dropdown-element" class="panel-collapse collapse">
						<div class="panel-body">
							<ul class="nav navbar-nav">
								<li><a href="${ctx}/routeController/toTestPage.do#/testIndex">展会演示</a></li>
								<li><a href="">清远凤城郦都</a></li>
								<li><a href="">光明迈瑞</a></li>
							</ul>
						</div>
					</div></li>
				<li class="panel panel-default dropdown">
				<a data-toggle="collapse" href="#dropdown-table">
					<span class="icon fa fa-table"></span><span class="title">设备运行状态信息</span>
				</a> <!-- Dropdown level 1 -->
					<div id="dropdown-table" class="panel-collapse collapse">
						<div class="panel-body">
							<ul class="nav navbar-nav">
								<li><a href="">展会演示</a></li>
								<li><a href="">清远凤城郦都</a></li>
								<li><a href="">光明迈瑞</a></li>
							</ul>
						</div>
					</div></li>
				<li class="panel panel-default dropdown">
				<a data-toggle="collapse" href="#dropdown-form">
					<span class="icon glyphicon glyphicon-exclamation-sign"></span><span class="title">设备异常状态报警</span>
				</a> <!-- Dropdown level 1 -->
					<div id="dropdown-form" class="panel-collapse collapse">
						<div class="panel-body">
							<ul class="nav navbar-nav">
								<li><a href=""></a></li>
								<li><a href=""></a></li>
								<li><a href=""></a></li>
							</ul>
						</div>
					</div></li>

				<!-- Dropdown-->
				<li class="panel panel-default dropdown">
				<a data-toggle="collapse" href="#component-example">
					<span class="icon fa fa-cubes"></span><span class="title">设备预测性维修保障策略分析</span>
				</a> <!-- Dropdown level 1 -->
					<div id="component-example" class="panel-collapse collapse">
						<div class="panel-body">
							<ul class="nav navbar-nav">
								<li><a href=""></a></li>
								<li><a href=""></a></li>
							</ul>
						</div>
					</div></li>
				<!-- Dropdown-->
				<li class="panel panel-default dropdown">
				<a data-toggle="collapse" href="#dropdown-example">
					<span class="icon fa fa-slack"></span><span class="title">设备健康状态评估</span>
				</a> <!-- Dropdown level 1 -->
					<div id="dropdown-example" class="panel-collapse collapse">
						<div class="panel-body">
							<ul class="nav navbar-nav">
								<li><a href=""></a></li>
								<li><a href=""></a></li>
							</ul>
						</div>
					</div></li>
				<!-- Dropdown-->
				<!-- <li><a href="license.html"> <span
						class="icon fa fa-thumbs-o-up"></span><span class="title">License</span>
				</a></li> -->
			</ul>
		</div>
		<!-- /.navbar-collapse -->
	</nav>
</div>