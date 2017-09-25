<!DOCTYPE html>
<html lang=zh-cmn-Hans>

<head>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>合同信息管理</title>
<!-- Fonts -->
<link
	href='http://fonts.googleapis.com/css?family=Roboto+Condensed:300,400'
	rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Lato:300,400,700,900'
	rel='stylesheet' type='text/css'>
<!-- CSS Libs -->
<link rel="stylesheet" type="text/css"
	href="${ctx}/lib/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css"
	href="${ctx}/lib/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css"
	href="${ctx}/lib/css/animate.min.css">
<link rel="stylesheet" type="text/css"
	href="${ctx}/lib/css/bootstrap-switch.min.css">
<link rel="stylesheet" type="text/css"
	href="${ctx}/lib/css/checkbox3.min.css">
<link rel="stylesheet" type="text/css"
	href="${ctx}/lib/css/jquery.dataTables.min.css">
<link rel="stylesheet" type="text/css"
	href="${ctx}/lib/css/dataTables.bootstrap.css">
<link rel="stylesheet" type="text/css"
	href="${ctx}/lib/css/select2.min.css">
<!-- CSS App -->
<link rel="stylesheet" type="text/css" href="${ctx}/css/style.css">
<link rel="stylesheet" type="text/css" href="${ctx}/css/vmcss.css">
<link rel="stylesheet" type="text/css"
	href="${ctx}/css/themes/flat-blue.css">
</head>

<body class="flat-blue">
	<div class="app-container">
		<div class="row content-container">
			<nav class="navbar navbar-default navbar-fixed-top navbar-top">
				<div class="container-fluid">
					<div class="navbar-header">
						<button type="button" class="navbar-expand-toggle">
							<i class="fa fa-bars icon"></i>
						</button>
						<button type="button"
							class="navbar-right-expand-toggle pull-right visible-xs">
							<i class="fa fa-th icon"></i>
						</button>
						<ol class="breadcrumb navbar-breadcrumb">
							<li >Dashboard</li>
							<li class="active">Tabs & Steps</li>
						</ol>
					</div>
					<ul class="nav navbar-nav navbar-right">
						<button type="button"
							class="navbar-right-expand-toggle pull-right visible-xs">
							<i class="fa fa-times icon"></i>
						</button>

						<li class="dropdown danger"><a href="#"
							class="dropdown-toggle" data-toggle="dropdown" role="button"
							aria-expanded="false"><i class="fa fa-star-half-o"></i> 4</a>
							<ul class="dropdown-menu danger  animated fadeInDown">
								<li class="title">Notification <span
									class="badge pull-right">4</span>
								</li>
								<li>
									<ul class="list-group notifications">
										<a href="#">
											<li class="list-group-item"><span class="badge">1</span>
												<i class="fa fa-exclamation-circle icon"></i> new
												registration</li>
										</a>
										<a href="#">
											<li class="list-group-item"><span class="badge success">1</span>
												<i class="fa fa-check icon"></i> new orders</li>
										</a>
										<a href="#">
											<li class="list-group-item"><span class="badge danger">2</span>
												<i class="fa fa-comments icon"></i> customers messages</li>
										</a>
										<a href="#">
											<li class="list-group-item message">view all</li>
										</a>
									</ul>
								</li>
							</ul></li>

					</ul>
				</div>
			</nav>
			<section>