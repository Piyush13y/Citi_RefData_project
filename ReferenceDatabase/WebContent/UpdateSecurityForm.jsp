<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
 <link rel="stylesheet" href="style.css">
<title>Insert title here</title>
</head>
<body>
<a href="showservlet">here i'm</a>
	<form action="showservlet" method="get" >
			<input name="ISIN" id="ISIN">
			<input type="submit" value="submit">
				
	</form>

  <body>
  <div class="">
    <header class="navbar-fixed-top">
      <div class="row">
        <div class="container-fluid">
          <div class="pull-left">
            <div class="pull-left logo text-center">
              <span>LOGO</span>
            </div><button class="btn btn-primary menu"><span class=
            "glyphicon glyphicon glyphicon-menu-hamburger"></span></button>
          </div>
          <div class="pull-right">
            <div class="marr20">
              <ul class="nav navbar-top-links navbar-right">
                <li class="dropdown task">
                  <a class="dropdown-toggle" data-toggle="dropdown" href="#"><i class="fa fa-tasks fa-fw"></i>
                  <i class="fa fa-caret-down"></i></a>
                  <ul class="dropdown-menu dropdown-tasks">
                    <li>
                      <a href="#">
                      <div>
                        <p><strong   >Task 1</strong> <span class="pull-right text-muted">40% Complete</span></p>
                        <div class="progress progress-striped active">
                          <div aria-valuemax="100" aria-valuemin="0" aria-valuenow="40" class=
                          "progress-bar progress-bar-success" role="progressbar" style="width: 40%">
                            <span class="sr-only">40% Complete (success)</span>
                          </div>
                        </div>
                      </div></a>
                    </li>
                    <li class="divider"></li>
                    <li>
                      <a href="#">
                      <div>
                        <p><strong>Task 2</strong> <span class="pull-right text-muted">20% Complete</span></p>
                        <div class="progress progress-striped active">
                          <div aria-valuemax="100" aria-valuemin="0" aria-valuenow="20" class=
                          "progress-bar progress-bar-info" role="progressbar" style="width: 20%">
                            <span class="sr-only">20% Complete</span>
                          </div>
                        </div>
                      </div></a>
                    </li>
                    <li class="divider"></li>
                    <li>
                      <a href="#">
                      <div>
                        <p><strong>Task 3</strong> <span class="pull-right text-muted">60% Complete</span></p>
                        <div class="progress progress-striped active">
                          <div aria-valuemax="100" aria-valuemin="0" aria-valuenow="60" class=
                          "progress-bar progress-bar-warning" role="progressbar" style="width: 60%">
                            <span class="sr-only">60% Complete (warning)</span>
                          </div>
                        </div>
                      </div></a>
                    </li>
                    <li class="divider"></li>
                    <li>
                      <a href="#">
                      <div>
                        <p><strong>Task 4</strong> <span class="pull-right text-muted">80% Complete</span></p>
                        <div class="progress progress-striped active">
                          <div aria-valuemax="100" aria-valuemin="0" aria-valuenow="80" class=
                          "progress-bar progress-bar-danger" role="progressbar" style="width: 80%">
                            <span class="sr-only">80% Complete (danger)</span>
                          </div>
                        </div>
                      </div></a>
                    </li>
                    <li class="divider"></li>
                    <li>
                      <a class="text-center" href="#"><strong>See All Tasks</strong> <i class=
                      "fa fa-angle-right"></i></a>
                    </li>
                  </ul><!-- /.dropdown-tasks -->
                </li><!-- /.dropdown -->
                <li class="dropdown bell">
                  <a aria-expanded="false" class="dropdown-toggle" data-toggle="dropdown" href="#"><i class=
                  "fa fa-bell fa-fw"></i> <i class="fa fa-caret-down"></i></a>
                  <ul class="dropdown-menu dropdown-alerts">
                    <li>
                      <a href="#">
                      <div>
                        <i class="fa fa-comment fa-fw"></i> New Comment <span class="pull-right text-muted small">4
                        minutes ago</span>
                      </div></a>
                    </li>
                    <li class="divider"></li>
                    <li>
                      <a href="#">
                      <div>
                        <i class="fa fa-twitter fa-fw"></i> 3 New Followers <span class=
                        "pull-right text-muted small">12 minutes ago</span>
                      </div></a>
                    </li>
                    <li class="divider"></li>
                    <li>
                      <a href="#">
                      <div>
                        <i class="fa fa-envelope fa-fw"></i> Message Sent <span class="pull-right text-muted small">4
                        minutes ago</span>
                      </div></a>
                    </li>
                    <li class="divider"></li>
                    <li>
                      <a href="#">
                      <div>
                        <i class="fa fa-tasks fa-fw"></i> New Task <span class="pull-right text-muted small">4 minutes
                        ago</span>
                      </div></a>
                    </li>
                    <li class="divider"></li>
                    <li>
                      <a href="#">
                      <div>
                        <i class="fa fa-upload fa-fw"></i> Server Rebooted <span class="pull-right text-muted small">4
                        minutes ago</span>
                      </div></a>
                    </li>
                    <li class="divider"></li>
                    <li>
                      <a class="text-center" href="#"><strong>See All Alerts</strong> <i class=
                      "fa fa-angle-right"></i></a>
                    </li>
                  </ul><!-- /.dropdown-alerts -->
                </li><!-- /.dropdown -->
                <li class="dropdown user">
                  <a aria-expanded="false" class="dropdown-toggle" data-toggle="dropdown" href="#"><i class=
                  "fa fa-user fa-fw"></i> <i class="fa fa-caret-down"></i></a>
                  <ul class="dropdown-menu dropdown-user">
                    <li>
                      <a href="#"><i class="fa fa-user fa-fw"></i> User Profile</a>
                    </li>
                    <li>
                      <a href="#"><i class="fa fa-gear fa-fw"></i> Settings</a>
                    </li>
                    <li class="divider"></li>
                    <li>
                      <a href="login.html"><i class="fa fa-sign-out fa-fw"></i> Logout</a>
                    </li>
                  </ul><!-- /.dropdown-user -->
                </li><!-- /.dropdown -->
              </ul>
            </div>
          </div>
        </div>
      </div>
    </header>
    <div class="wrap">
      <div class="side-menu">
        <nav class="navbar navbar-default" role="navigation">
          <div class="navbar-header">
            <div class="brand-wrapper">
              <div class="brand-name-wrapper">
                <a class="navbar-brand" href="#">Navigation Menu</a>
              </div><a class="btn btn-default" data-toggle="collapse" href="#search" id="search-trigger"><span class=
              "glyphicon glyphicon-search"></span></a>
              <div class="panel-collapse collapse" id="search">
                <div class="panel-body">
                  <form class="navbar-form" role="search">
                    <div class="form-group">
                      <input class="form-control" placeholder="Search" type="text">
                    </div><button class="btn btn-default" type="submit"><span class=
                    "glyphicon glyphicon-ok"></span></button>
                  </form>
                </div>
              </div>
            </div>
          </div><!-- Main Menu -->
          <div class="side-menu-container">
            <ul class="nav navbar-nav">
              <li>
                <a href="#" onclick="showDash()"><span class="glyphicon glyphicon-send"></span> Home</a>
              </li>
			  <li>
                <a href="#" onclick="showInput()"><span class="glyphicon glyphicon-send"></span> Input Trade</a>
              </li>
              <li >
                <a href="#" onclick="showLog()"><span class="glyphicon glyphicon-send"></span> Trades Log</a>
              </li>
			   <li >
                <a href="#" onclick="showSec()"><span class="glyphicon glyphicon-send"></span> Update Securities</a>
              </li>
              <!-- Dropdown-->
              </ul>
          </div><!-- /.navbar-collapse -->
        </nav>
      </div><!-- Main Content -->
    <!--  <div class="container-fluid" id="dashboard" >

        <div class="side-body">
          <div class="page-title-box">
            <h3 class="page-title pull-left">Dashboard</h3>
            <ol class="breadcrumb pull-right">
              <li>
                <a href="#">home</a>
              </li>
              <li class="active">Dashboard</li>
            </ol>
            <div class="clearfix"></div>
          </div>
          <div class="row">
            <div class="col-lg-8 col-sm-12">
              <div class="row">
                <div class="col-sm-6">
                  <div class="panel panel-primary">
                    <div class="panel-heading">
                      <div class="row">
                        <div class="col-xs-9">
                          <div class="huge">
                            09
                          </div>
                          <div>
                            New Clients!
                          </div>
                        </div>
                        <div class="col-xs-3 text-right">
                          <i class="fa fa-cogs fa-5x"></i>
                        </div>
                      </div>
                    </div><a href="#">
                    <div class="panel-footer">
                      <span class="pull-left">View Details</span> <span class="pull-right"><i class=
                      "fa fa-arrow-circle-right"></i></span>
                      <div class="clearfix"></div>
                    </div></a>
                  </div>
                </div>
                <div class="col-sm-6">
                  <div class="panel panel-green">
                    <div class="panel-heading">
                      <div class="row">
                        <div class="col-xs-9">
                          <div class="huge">
                            612
                          </div>
                          <div>
                            New Deals!
                          </div>
                        </div>
                        <div class="col-xs-3 text-right">
                          <i class="fa fa-laptop fa-5x"></i>
                        </div>
                      </div>
                    </div><a href="#">
                    <div class="panel-footer">
                      <span class="pull-left">View Details</span> <span class="pull-right"><i class=
                      "fa fa-arrow-circle-right"></i></span>
                      <div class="clearfix"></div>
                    </div></a>
                  </div>
                </div>
                <div class="col-sm-6">
                  <div class="panel panel-yellow">
                    <div class="panel-heading">
                      <div class="row">
                        <div class="col-xs-9">
                          <div class="huge">
                            2148
                          </div>
                          <div>
                            Total Sales!
                          </div>
                        </div>
                        <div class="col-xs-3 text-right">
                          <i class="fa fa-shopping-cart fa-5x"></i>
                        </div>
                      </div>
                    </div><a href="#">
                    <div class="panel-footer">
                      <span class="pull-left">View Details</span> <span class="pull-right"><i class=
                      "fa fa-arrow-circle-right"></i></span>
                      <div class="clearfix"></div>
                    </div></a>
                  </div>
                </div>
                <div class="col-sm-6">
                  <div class="panel panel-red">
                    <div class="panel-heading">
                      <div class="row">
                        <div class="col-xs-9">
                          <div class="huge">
                            $56M
                          </div>
                          <div>
                            Total Income!
                          </div>
                        </div>
                        <div class="col-xs-3 text-right">
                          <i class="fa fa-dollar fa-5x"></i>
                        </div>
                      </div>
                    </div><a href="#">
                    <div class="panel-footer">
                      <span class="pull-left">View Details</span> <span class="pull-right"><i class=
                      "fa fa-arrow-circle-right"></i></span>
                      <div class="clearfix"></div>
                    </div></a>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-lg-4 col-sm-12">
              <div class="panel panel-info">
                <div class="panel-heading">
                  <i class="fa fa-bell fa-fw"></i> Notifications Panel
                </div>
                <div class="panel-body">
                  <div class="list-group">
                    <a class="list-group-item" href="#"><i class="fa fa-comment fa-fw"></i> New Comment <span class=
                    "pull-right text-muted small"><em>14 minutes ago</em></span></a> <a class="list-group-item" href=
                    "#"><i class="fa fa-tasks fa-fw"></i> New Task <span class="pull-right text-muted small"><em>55
                    minutes ago</em></span></a> <a class="list-group-item" href="#"><i class="fa fa-upload fa-fw"></i>
                    Server Rebooted <span class="pull-right text-muted small"><em>55 minutes ago</em></span></a>
                    <a class="list-group-item" href="#"><i class="fa fa-bolt fa-fw"></i> Server Crashed! <span class=
                    "pull-right text-muted small"><em>3:33 PM</em></span></a> <a class="list-group-item" href=
                    "#"><i class="fa fa-warning fa-fw"></i> Server Not Responding <span class=
                    "pull-right text-muted small"><em>10:57 AM</em></span></a>
                  </div><a class="btn btn-info btn-block" href="#">View All Alerts</a>
                </div>
              </div>
            </div>
          </div>

          <div class="row">
            <div class="col-sm-8">
              <div class="panel panel-info">
                <div class="panel-heading">
                  <i class="fa fa-line-chart fa-fw"></i> Browser Usage (5 Years)
                </div>
                <p class="padd20">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
                <div id="line-chart" style="height:250px;"></div>
              </div>
            </div> 
            <div class="col-sm-4">
              <div class="panel panel-success">
                <div class="panel-heading">
                  <i class="fa fa-pie-chart fa-fw"></i> Project Task Details
                </div>
                <p class="padd20">Lorem ipsum dolor sit amet, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
                <div id="donut-chart" style="height:250px"></div>
              </div>
            </div>            
          </div>

          <div class="row">
            <div class="col-sm-6">
              <div class="panel panel-warning">
                <div class="panel-heading">
                  <i class="fa fa-bar-chart fa-fw"></i> Browser Usage Details
                </div>
                <div id="bar-chart" style="height:200px"></div>
              </div>
            </div>
            <div class="col-sm-6">
              <div class="panel panel-success">
                <div class="panel-heading">
                  <i class="fa fa-table fa-fw"></i> Table Details
                </div>
                <div class="table-responsive">
                  <table class="table table-striped" id="example">
                    <tr>
                      <th>Heading 1</th>
                      <th>Heading 2</th>
                      <th>Heading 3</th>
                      <th>Heading 4</th>
                      <th>Heading 5</th>
                      <th>Heading 6</th>
                    </tr>
                    <tr>
                      <td>Content</td>
                      <td>Content</td>
                      <td>Content</td>
                      <td>Content</td>
                      <td>Content</td>
                      <td>Content</td>
                    </tr>
                    <tr>
                      <td>Content</td>
                      <td>Content</td>
                      <td>Content</td>
                      <td>content</td>
                      <td>content</td>
                      <td>content</td>
                    </tr>
                    <tr>
                      <td>Content</td>
                      <td>Content</td>
                      <td>Content</td>
                      <td>content</td>
                      <td>content</td>
                      <td>content</td>
                    </tr>
                    <tr>
                      <td>Content</td>
                      <td>Content</td>
                      <td>Content</td>
                      <td>content</td>
                      <td>content</td>
                      <td>content</td>
                    </tr>
                  </table>
                </div>
              </div>
            </div>
          </div>
        </div>
        <div class="side-footer">
          <div class="footer text-center">
            Designed By <a target="_blank" href="https://www.linkedin.com/in/peeyush200/"> Peeyush </a>
          </div>
        </div>
      </div> -->
	<div class="container-fluid" id="dash" >
        <div class="side-body">
          <div class="page-title-box">
            <h3 class="page-title pull-left">Home</h3>
            <ol class="breadcrumb pull-right">
              <li>
                <a href="#">home</a>
              </li>
              <li class="active">Dashboard</li>
            </ol>
            <div class="clearfix"></div>
          </div>
          <div class="row">
            <div class="col-lg-8 col-sm-12">
              <div class="row">
                <div class="col-sm-6">
                  <div class="panel panel-green">
                    <div class="panel-heading">
                      <div class="row">
                        <div class="col-xs-9">
                          <div class="huge">
                            09
                          </div>
                          <div>
                            New Clients!
                          </div>
                        </div>
                        <div class="col-xs-3 text-right">
                          <i class="fa fa-cogs fa-5x"></i>
                        </div>
                      </div>
                    </div><a href="#">
                    <div class="panel-footer">
                      <span class="pull-left">View Details</span> <span class="pull-right"><i class=
                      "fa fa-arrow-circle-right"></i></span>
                      <div class="clearfix"></div>
                    </div></a>
                  </div>
                </div>
                <div class="col-sm-6">
                  <div class="panel panel-green">
                    <div class="panel-heading">
                      <div class="row">
                        <div class="col-xs-9">
                          <div class="huge">
                            612
                          </div>
                          <div>
                            New Deals!
                          </div>
                        </div>
                        <div class="col-xs-3 text-right">
                          <i class="fa fa-laptop fa-5x"></i>
                        </div>
                      </div>
                    </div><a href="#">
                    <div class="panel-footer">
                      <span class="pull-left">View Details</span> <span class="pull-right"><i class=
                      "fa fa-arrow-circle-right"></i></span>
                      <div class="clearfix"></div>
                    </div></a>
                  </div>
                </div>
                <div class="col-sm-6">
                  <div class="panel panel-yellow">
                    <div class="panel-heading">
                      <div class="row">
                        <div class="col-xs-9">
                          <div class="huge">
                            2148
                          </div>
                          <div>
                            Total Sales!
                          </div>
                        </div>
                        <div class="col-xs-3 text-right">
                          <i class="fa fa-shopping-cart fa-5x"></i>
                        </div>
                      </div>
                    </div><a href="#">
                    <div class="panel-footer">
                      <span class="pull-left">View Details</span> <span class="pull-right"><i class=
                      "fa fa-arrow-circle-right"></i></span>
                      <div class="clearfix"></div>
                    </div></a>
                  </div>
                </div>
                <div class="col-sm-6">
                  <div class="panel panel-red">
                    <div class="panel-heading">
                      <div class="row">
                        <div class="col-xs-9">
                          <div class="huge">
                            $56M
                          </div>
                          <div>
                            Total Income!
                          </div>
                        </div>
                        <div class="col-xs-3 text-right">
                          <i class="fa fa-dollar fa-5x"></i>
                        </div>
                      </div>
                    </div><a href="#">
                    <div class="panel-footer">
                      <span class="pull-left">View Details</span> <span class="pull-right"><i class=
                      "fa fa-arrow-circle-right"></i></span>
                      <div class="clearfix"></div>
                    </div></a>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-lg-4 col-sm-12">
              <div class="panel panel-info">
                <div class="panel-heading">
                  <i class="fa fa-bell fa-fw"></i> Notifications Panel
                </div>
                <div class="panel-body">
                  <div class="list-group">
                    <a class="list-group-item" href="#"><i class="fa fa-comment fa-fw"></i> New Comment <span class=
                    "pull-right text-muted small"><em>14 minutes ago</em></span></a> <a class="list-group-item" href=
                    "#"><i class="fa fa-tasks fa-fw"></i> New Task <span class="pull-right text-muted small"><em>55
                    minutes ago</em></span></a> <a class="list-group-item" href="#"><i class="fa fa-upload fa-fw"></i>
                    Server Rebooted <span class="pull-right text-muted small"><em>55 minutes ago</em></span></a>
                    <a class="list-group-item" href="#"><i class="fa fa-bolt fa-fw"></i> Server Crashed! <span class=
                    "pull-right text-muted small"><em>3:33 PM</em></span></a> <a class="list-group-item" href=
                    "#"><i class="fa fa-warning fa-fw"></i> Server Not Responding <span class=
                    "pull-right text-muted small"><em>10:57 AM</em></span></a>
                  </div><a class="btn btn-info btn-block" href="#">View All Alerts</a>
                </div>
              </div>
            </div>
          </div>

          <div class="row">
            <div class="col-sm-8">
              <div class="panel panel-info">
                <div class="panel-heading">
                  <i class="fa fa-line-chart fa-fw"></i> Browser Usage (5 Years)
                </div>
                <p class="padd20">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
                <div id="line-chart" style="height:250px;"></div>
              </div>
            </div> 
            <div class="col-sm-4">
              <div class="panel panel-success">
                <div class="panel-heading">
                  <i class="fa fa-pie-chart fa-fw"></i> Project Task Details
                </div>
                <p class="padd20">Lorem ipsum dolor sit amet, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
                <div id="donut-chart" style="height:250px"></div>
              </div>
            </div>            
          </div>

          <div class="row">
            <div class="col-sm-6">
              <div class="panel panel-warning">
                <div class="panel-heading">
                  <i class="fa fa-bar-chart fa-fw"></i> Browser Usage Details
                </div>
                <div id="bar-chart" style="height:200px"></div>
              </div>
            </div>
            <div class="col-sm-6">
              <div class="panel panel-success">
                <div class="panel-heading">
                  <i class="fa fa-table fa-fw"></i> Table Details
                </div>
                <div class="table-responsive">
                  <table class="table table-striped" id="example">
                    <tr>
                      <th>Heading 1</th>
                      <th>Heading 2</th>
                      <th>Heading 3</th>
                      <th>Heading 4</th>
                      <th>Heading 5</th>
                      <th>Heading 6</th>
                    </tr>
                    <tr>
                      <td>Content</td>
                      <td>Content</td>
                      <td>Content</td>
                      <td>Content</td>
                      <td>Content</td>
                      <td>Content</td>
                    </tr>
                    <tr>
                      <td>Content</td>
                      <td>Content</td>
                      <td>Content</td>
                      <td>content</td>
                      <td>content</td>
                      <td>content</td>
                    </tr>
                    <tr>
                      <td>Content</td>
                      <td>Content</td>
                      <td>Content</td>
                      <td>content</td>
                      <td>content</td>
                      <td>content</td>
                    </tr>
                    <tr>
                      <td>Content</td>
                      <td>Content</td>
                      <td>Content</td>
                      <td>content</td>
                      <td>content</td>
                      <td>content</td>
                    </tr>
                  </table>
                </div>
              </div>
            </div>
          </div>
        </div>
        <div class="side-footer">
          <div class="footer text-center">
            Designed By <a target="_blank" > Peeyush </a>
          </div>
        </div>
      </div>
	<div class="container-fluid" id="input" hidden >
        <div class="side-body">
			<div class="page-title-box">
            <h3 class="page-title pull-left">Trade Form</h3>
            <ol class="breadcrumb pull-right">
              <li>
                <a href="#">home</a>
              </li>
              <li class="active">Dashboard</li>
            </ol>
            <div class="clearfix"></div>
          </div>
          <div class="row">
            <div class="col-lg-9 col-sm-12">
              <div class="row">
                <div style="margin-left:40%"class="col-sm-8">
                  <div class="panel panel-yellow" style="background-color: #ffc108">
                    <div class="panel-heading" style="background-color: #ffc108">
                      <div class="row">
                        <div class="col-xs-9">
                          <form action="tradeinput" method="post">
							 							 
							 Trade-date : <span id="donedate" name="donedate" style="margin-left:40px"></span><br>
							 Trade-time: <span id="time" name="time" style="margin-left:40px"></span><br>
							 Security name: <select name="cars" id="security" onchange="updatesec()" style="margin-left:20px">
													<option value="Volvo" >Volvo</option>
													<option value="saab">Saab</option>
													<option value="fiat">Fiat</option>
													<option value="audi">Audi</option>
													</select><br>
							Trade: <select name="trade" id="trade" onchange="updatetrade()" style="margin-left:75px">
													<option value="Buy" >Buy</option>
													<option value="Sell">Sell</option>
													</select><br>
													<span id="msg"></span>
													<span id="msg1"></span>
													
							Counterparty:<input type="text" name="counterparty" placeholder="Party Name" style="margin-left:30px">
							Settlement Date: <input type="date" name="setdate" style="margin-left:7px">
							Traded Price:<input type="radio" name="method" id="decimalInput" onchange="display()" value="decimalInput" style="margin-left:30px"> Decimal Input<br>
										 <input type="radio" name="method" id="fractionInput" onchange="display()" value="fractionInput" style="margin-left:112px"> Fraction input<br>
										  <span id="decimalvalue1" style="margin-left:112px" hidden ><input type="text" name="decimal" placeholder="Price in Decimals"></span>
										  <span id="fraction1" style="margin-left:112px" hidden><input type="text" name="fraction_whole" placeholder="Price in whole number"><input type="text" name="fraction_frac" placeholder="Multiples of 1/32" style="margin-left:112px"></span>
										  
										  
													<script> 
													function display(){
													
													if( document.getElementById("decimalInput").checked==true){
																document.getElementById("decimalvalue1").hidden=false;
																document.getElementById("fraction1").hidden=true;}
													if( document.getElementById("fractionInput").checked==true){
																document.getElementById("decimalvalue1").hidden=true;
																document.getElementById("fraction1").hidden=false;}	
													
																
																}

													function updatesec(){
													p=document.getElementById("security").value;
													 document.getElementById("msg").innerHTML=p;}
													function updatetrade(){
													q=document.getElementById("trade").value;
													document.getElementById("msg1").innerHTML=q;}
													
							 var d= new Date();
							 var r = d.getMonth()+1;
							 document.getElementById("donedate").innerHTML=d.getDate()+"/"+r+"/"+d.getFullYear()+" (dd/mm/yyyy)";
							 document.getElementById("time").innerHTML=d.getHours()+":"+d.getMinutes()+":"+d.getSeconds();						 
							 </script>	
							<input type="submit" style="margin-left:120px; margin-top: 4%">
							</form>	
							</div>
						</div>
						</div>
					</div>
				</div>
		</div>
		</div>
						</div>
		</div>
		</div>
	 <div class="container-fluid" id="log" hidden>
        <div class="side-body">
          <div class="page-title-box">
            <h3 class="page-title pull-left">Analysis</h3>
            <ol class="breadcrumb pull-right">
              <li>
                <a href="#">home</a>
              </li>
              <li class="active">Dashboard</li>
            </ol>
            <div class="clearfix"></div>
          </div>
        <!--  <div class="row">
            <div class="col-lg-8 col-sm-12">
              <div class="row">
                <div class="col-sm-6">
                  <div class="panel panel-green">
                    <div class="panel-heading">
                      <div class="row">
                        <div class="col-xs-9">
                          <div class="huge">
                            123
                          </div>
                          <div>
                            Old Clients!
                          </div>
                        </div>
                        <div class="col-xs-3 text-right">
                          <i class="fa fa-cogs fa-5x"></i>
                        </div>
                      </div>
                    </div><a href="#">
                    <div class="panel-footer">
                      <span class="pull-left">Hey Whazzaap!</span> <span class="pull-right"><i class=
                      "fa fa-arrow-circle-right"></i></span>
                      <div class="clearfix"></div>
                    </div></a>
                  </div>
                </div>
                <div class="col-sm-6">
                  <div class="panel panel-green">
                    <div class="panel-heading">
                      <div class="row">
                        <div class="col-xs-9">
                          <div class="huge">
                            000
                          </div>
                          <div>
                            New!
                          </div>
                        </div>
                        <div class="col-xs-3 text-right">
                          <i class="fa fa-laptop fa-5x"></i>
                        </div>
                      </div>
                    </div><a href="#">
                    <div class="panel-footer">
                      <span class="pull-left">View Details</span> <span class="pull-right"><i class=
                      "fa fa-arrow-circle-right"></i></span>
                      <div class="clearfix"></div>
                    </div></a>
                  </div>
                </div>
                <div class="col-sm-12">
                  <div class="panel panel-yellow">
                    <div class="panel-heading">
                      <div class="row">
                        <div class="col-xs-9">
                          <div class="huge">
                            2148
                          </div>
                          <div>
                            Total Sales!
                          </div>
                        </div>
                        <div class="col-xs-3 text-right">
                          <i class="fa fa-shopping-cart fa-5x"></i>
                        </div>
                      </div>
                    </div><a href="#">
                    <div class="panel-footer">
                      <span class="pull-left">View Details</span> <span class="pull-right"><i class=
                      "fa fa-arrow-circle-right"></i></span>
                      <div class="clearfix"></div>
                    </div></a>
                  </div>
                </div>
				<div class="col-sm-6">
                  <div class="panel panel-yellow">
                    <div class="panel-heading">
                      <div class="row">
                        <div class="col-xs-9">
                          <div class="huge">
                            2148
                          </div>
                          <div>
                            Total Sales!
                          </div>
                        </div>
                        <div class="col-xs-3 text-right">
                          <i class="fa fa-shopping-cart fa-5x"></i>
                        </div>
                      </div>
                    </div><a href="#">
                    <div class="panel-footer">
                      <span class="pull-left">View Details</span> <span class="pull-right"><i class=
                      "fa fa-arrow-circle-right"></i></span>
                      <div class="clearfix"></div>
                    </div></a>
                  </div>
                </div>
                <div class="col-sm-6">
                  <div class="panel panel-red">
                    <div class="panel-heading">
                      <div class="row">
                        <div class="col-xs-9">
                          <div class="huge">
                            $56M
                          </div>
                          <div>
                            Total Income!
                          </div>
                        </div>
                        <div class="col-xs-3 text-right">
                          <i class="fa fa-dollar fa-5x"></i>
                        </div>
                      </div>
                    </div><a href="#">
                    <div class="panel-footer">
                      <span class="pull-left">View Details</span> <span class="pull-right"><i class=
                      "fa fa-arrow-circle-right"></i></span>
                      <div class="clearfix"></div>
                    </div></a>
                  </div>
                </div>
              </div>
            </div>
           
          </div>-->

        <!--  <div class="row">
            <div class="col-sm-8">
              <div class="panel panel-info">
                <div class="panel-heading">
                  <i class="fa fa-line-chart fa-fw"></i> Browser Usage (5 Years)
                </div>
                <p class="padd20">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
                <div id="line-chart" style="height:250px;"></div>
              </div>
            </div> 
            <div class="col-sm-4">
              <div class="panel panel-success">
                <div class="panel-heading">
                  <i class="fa fa-pie-chart fa-fw"></i> Project Task Details
                </div>
                <p class="padd20">Lorem ipsum dolor sit amet, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
                <div id="donut-chart" style="height:250px"></div>
              </div>
            </div>            
          </div>
-->
      <!--    <div class="row">
            <div class="col-sm-6">
              <div class="panel panel-warning">
                <div class="panel-heading">
                  <i class="fa fa-bar-chart fa-fw"></i> Browser Usage Details
                </div>
                <div id="bar-chart" style="height:200px"></div>
              </div>
            </div>
            <div class="col-sm-6">
              <div class="panel panel-success">
                <div class="panel-heading">
                  <i class="fa fa-table fa-fw"></i> Table Details
                </div>
                <div class="table-responsive">
                  <table class="table table-striped" id="example">
                    <tr>
                      <th>Heading 1</th>
                      <th>Heading 2</th>
                      <th>Heading 3</th>
                      <th>Heading 4</th>
                      <th>Heading 5</th>
                      <th>Heading 6</th>
                    </tr>
                    <tr>
                      <td>Content</td>
                      <td>Content</td>
                      <td>Content</td>
                      <td>Content</td>
                      <td>Content</td>
                      <td>Content</td>
                    </tr>
                    <tr>
                      <td>Content</td>
                      <td>Content</td>
                      <td>Content</td>
                      <td>content</td>
                      <td>content</td>
                      <td>content</td>
                    </tr>
                    <tr>
                      <td>Content</td>
                      <td>Content</td>
                      <td>Content</td>
                      <td>content</td>
                      <td>content</td>
                      <td>content</td>
                    </tr>
                    <tr>
                      <td>Content</td>
                      <td>Content</td>
                      <td>Content</td>
                      <td>content</td>
                      <td>content</td>
                      <td>content</td>
                    </tr>
                  </table>
                </div>
              </div>
            </div>
          </div>
        </div>-->
        <!--<div class="side-footer">
          <div class="footer text-center">
            Designed By <a target="_blank" href="https://www.linkedin.com/in/peeyush200/"> Peeyush </a>
          </div>-->
		  
		  <div class="stack-horz" style="padding-left: 8%;padding-right:5%;padding-top:3%;padding-bottom:5%">
        <div id = "container" class="content" style="width: 48%; height: 35%;">Horz 1</div>
        <div id = "container2"class="content" style="width: 48%; height: 35%;">Horz 2</div>
        
    </div>
<div class="stack-horz" style="padding-left: 8%;padding-right:5%;padding-top:5%;padding-bottom:5%">
        <div id = "container1" class="content" style="width: 48%; height: 35%;">Horz 1</div>
        <div id = "container3" class="content" style="width: 48%; height: 35%;">Horz 2</div>
        
    </div>	
		  
		  
		  
        </div>
      </div>
	  
	  <div class="container-fluid" id="sec" hidden >
        <div class="side-body">
			<div class="page-title-box">
            <h3 class="page-title pull-left">Update Securities</h3>
            <ol class="breadcrumb pull-right">
              <li>
                <a href="#">home</a>
              </li>
              <li class="active">Dashboard</li>
            </ol>
            <div class="clearfix"></div>
          </div>
          <div class="row">
            <div class="col-lg-9 col-sm-12">
              <div class="row">
                <div style="margin-left:40%"class="col-sm-8">
                  <div class="panel panel-yellow">
                    <div class="panel-heading">
                      <div class="row">
                        <div class="col-xs-9">
                          <form action="add_securities_servlet" method="get">
							 							 
							 Date : <span id="donedate1" name="donedate" style="margin-left:40px"></span><br>
							<!-- Trade-time: <span id="time1" name="time" style="margin-left:40px"></span><br>-->
							 Security name: <input type="text" name="SECURITY_NAME" placeholder="Security Name" style="margin-left:30px"><br>
							<!--Trade: <select name="trade" id="trade1" onchange="updatetrade()" style="margin-left:75px">
													<option value="Buy" >Buy</option>
													<option value="Sell">Sell</option>
													</select><br>
													<span id="msg"></span>
													<span id="msg1"></span>-->
													
							Issuer Name:<input type="text" name="ISSUER_NAME" placeholder="Issuer Name" style="margin-left:45px">

							Frequency:<input type="text" name="FREQUENCY" placeholder="Frequency" style="margin-left:57px"><br>

							Day Count Convention: <select name="DAY_COUNT_CONVENTION" id="trade1" onchange="" style="margin-left:45px">
													<option value="1" >30/ACT</option>
													<option value="2">ACT/360</option>
													</select><br>
													<span id="msg"></span>
													<span id="msg1"></span>							
							ISIN:<input type="text" name="ISIN" placeholder="ISIN" style="margin-left:97px"><br>

							Face Value:<input type="text" name="FACE_VALUE" placeholder="Face Value" style="margin-left:55px"><br>

							Coupon Dates:<input type="text" name="COUPON_DATES" placeholder="Coupon Dates" style="margin-left:33px"><br>

							Maturity Date: <input id="setdate" type="date" name="MATURITY_DATE" style="margin-left:31px">
						<!--	Traded Price:<input type="radio" name="method" id="decimalInput1" onchange="display1()" value="decimalInput" style="margin-left:30px"> Decimal Input<br>
										 <input type="radio" name="method" id="fractionInput1" onchange="display1()" value="fractionInput" style="margin-left:112px"> Fraction input<br>
										  <span id="decimalvalue11" style="margin-left:112px" hidden ><input type="text" name="decimal" placeholder="Price in Decimals"></span>
										  <span id="fraction11" style="margin-left:112px" hidden><input type="text" name="fraction_whole" placeholder="Price in whole number"><input type="text" name="fraction_frac" placeholder="Multiples of 1/32" style="margin-left:112px"></span>
										  
										  -->
													<script> 
	
													function display1(){
													
													if( document.getElementById("decimalInput1").checked==true){
																document.getElementById("decimalvalue11").hidden=false;
																document.getElementById("fraction11").hidden=true;}
													if( document.getElementById("fractionInput1").checked==true){
																document.getElementById("decimalvalue11").hidden=true;
																document.getElementById("fraction11").hidden=false;}	
													
																
																}

													function updatesec(){
													p=document.getElementById("security").value;
													document.getElementById("msg").innerHTML=p;}
													function updatetrade(){
													q=document.getElementById("trade").value;
													document.getElementById("msg1").innerHTML=q;}
													
							 var d= new Date();
							 var r = d.getMonth()+1;
							 document.getElementById("donedate1").innerHTML=d.getDate()+"/"+r+"/"+d.getFullYear()+" (dd/mm/yyyy)";
							// document.getElementById("time1").innerHTML=d.getHours()+":"+d.getMinutes()+":"+d.getSeconds();						 
							 </script>	<br>
							<input type="submit"  style="margin-left:120px; margin-top:4%" value="insert">
							</form>	
							</div>
						</div>
						</div>
					</div>
	
		</div>
		</div>
						</div>
		</div>
		</div>
	  
    </div>
  </div>
</body>
  <script src='https://code.jquery.com/jquery-1.12.4.js'></script>
<script src='https://cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js'></script>
<script src='https://cdn.oesmith.co.uk/morris-0.4.1.min.js'></script>
<script src='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js'></script>

  
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="https://code.highcharts.com/highcharts.js"></script>
<script src="https://code.highcharts.com/modules/exporting.js"></script>
<script src="https://code.highcharts.com/modules/export-data.js"></script>
    <script  src="js/index.js"></script>
	<script src="js/citi_test.js"></script>
<script src="js/click2add.js"></script>
<script src="js/pie.js"></script>
<script src="js/column.js"></script>





				
	
</body>
</html>