<!DOCTYPE html>
<html lang=zh-cmn-Hans>

<head>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>合同信息管理</title>
    <!-- Fonts -->
    <link href='http://fonts.googleapis.com/css?family=Roboto+Condensed:300,400' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Lato:300,400,700,900' rel='stylesheet' type='text/css'>
    <!-- CSS Libs -->
    <link rel="stylesheet" type="text/css" href="${ctx}/lib/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="${ctx}/lib/css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="${ctx}/lib/css/animate.min.css">
    <link rel="stylesheet" type="text/css" href="${ctx}/lib/css/bootstrap-switch.min.css">
    <link rel="stylesheet" type="text/css" href="${ctx}/lib/css/checkbox3.min.css">
    <link rel="stylesheet" type="text/css" href="${ctx}/lib/css/jquery.dataTables.min.css">
    <link rel="stylesheet" type="text/css" href="${ctx}/lib/css/dataTables.bootstrap.css">
    <link rel="stylesheet" type="text/css" href="${ctx}/lib/css/select2.min.css">
    <!-- CSS App -->
    <link rel="stylesheet" type="text/css" href="${ctx}/css/style.css">
    <link rel="stylesheet" type="text/css" href="${ctx}/css/vmcss.css">
    <link rel="stylesheet" type="text/css" href="${ctx}/css/themes/flat-blue.css">
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
                        <ol class="breadcrumb navbar-breadcrumb">
                            <li class="active" style="width:150px;text-align:center;">
                            <a href="http://www.baidu.com">
                            <p class="{true:'active',false:'inactive'}[show.isActive0]" onclick="changeBar(0)">供配电系统</p>
                            </a></li>
                        </ol>
                        <ol class="breadcrumb navbar-breadcrumb">
                            <li class="active" style="width:150px;text-align:center;">
                            <a href="">
                            <p class="{true:'active',false:'inactive'}[show.isActive1]" onclick="changeBar(1)">给排水系统</p>
                            </a></li>
                        </ol>
                        <ol class="breadcrumb navbar-breadcrumb">
                            <li class="active" style="width:150px;text-align:center;">
                            <a href="">
                            <p class="{true:'active',false:'inactive'}[show.isActive2]" onclick="changeBar(2)">中央空调系统</p></a></li>
                        </ol>
                        <ol class="breadcrumb navbar-breadcrumb">
                            <li class="active" style="width:150px;text-align:center;">
                            <a href=""">
                            <p class="{true:'active',false:'inactive'}[show.isActive3]" onclick="changeBar(3)">电梯系统</p></a></li>
                        </ol>
                        <ol class="breadcrumb navbar-breadcrumb">
                            <li class="active" style="width:150px;text-align:center;">
                            <a href="">
                            <p class="{true:'active',false:'inactive'}[show.isActive4]" onclick="changeBar(4)">消防系统</p></a></li>
                        </ol>
                        
                        <button type="button" class="navbar-right-expand-toggle pull-right visible-xs">
                            <i class="fa fa-th icon"></i>
                        </button>
                    </div>
                    <ul class="nav navbar-nav navbar-right">
                        <button type="button" class="navbar-right-expand-toggle pull-right visible-xs">
                            <i class="fa fa-times icon"></i>
                        </button>
                        
                        <li class="dropdown danger">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><i class="fa fa-star-half-o"></i> 4</a>
                            <ul class="dropdown-menu danger  animated fadeInDown">
                                <li class="title">
                                    Notification <span class="badge pull-right">4</span>
                                </li>
                                <li>
                                    <ul class="list-group notifications">
                                        <a href="#">
                                            <li class="list-group-item">
                                                <span class="badge">1</span> <i class="fa fa-exclamation-circle icon"></i> new registration
                                            </li>
                                        </a>
                                        <a href="#">
                                            <li class="list-group-item">
                                                <span class="badge success">1</span> <i class="fa fa-check icon"></i> new orders
                                            </li>
                                        </a>
                                        <a href="#">
                                            <li class="list-group-item">
                                                <span class="badge danger">2</span> <i class="fa fa-comments icon"></i> customers messages
                                            </li>
                                        </a>
                                        <a href="#">
                                            <li class="list-group-item message">
                                                view all
                                            </li>
                                        </a>
                                    </ul>
                                </li>
                            </ul>
                        </li>
                       
                    </ul>
                </div>
            </nav>
<script>
function changeBar(state){
	
				switch(state){
				case 0:
					show={
						isActive0:true,
						isActive1:false,
						isActive2:false,
						isActive3:false,
						isActive4:false
				}
				case 1:
					show={
						isActive0:false,
						isActive1:true,
						isActive2:false,
						isActive3:false,
						isActive4:false
				}
					
					break;
				case 2:
					show={
						isActive0:false,
						isActive1:false,
						isActive2:true,
						isActive3:false,
						isActive4:false
				}
					break;
				case  3:
					show={
						isActive1:false,
						isActive2:false,
						isActive3:true,
						isActive4:false
				}
					break;
				case  4:
					show={
						isActive0:false,
						isActive1:false,
						isActive2:false,
						isActive3:false,
						isActive4:true
				}
					break;
				}
			}
</script>		
	<section>