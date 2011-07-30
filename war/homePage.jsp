<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.google.appengine.api.users.User" %>
<%@ page import="com.google.appengine.api.users.UserService" %>
<%@ page import="com.google.appengine.api.users.UserServiceFactory" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN"
 "http://www.w3.org/TR/html4/strict.dtd">

<html>
	<head>
	   <title>YUI Base Page</title>
	   <link rel="stylesheet" href="http://yui.yahooapis.com/2.8.0r4/build/reset-fonts-grids/reset-fonts-grids.css" type="text/css">
	   <link rel="stylesheet" href="main.css" type="text/css">
	</head>
	
	<body id="homePage" class="yui-skin-sam">
		<div id="doc" class="yui-t7">
			
			<div id="hd" role="banner">
				<div class="logo">
					VolunCheer
				</div>
				<div class="volunteer">
					<a href="#">Volunteer</a>
				</div>
				<div class="list">
					<a href="#">List positions</a>
				</div>
				<div class="login">
					<a href="#">Login</a>
				</div>
		   	</div>
		   	
		   	<div id="bd" role="main">
				<div class="yui-gc">
		    		<div class="yui-u first">
						<div class="pitch"> WE CONNECT VOLUNTEERS WITH OPPORTUNITIES </div>
						<div class="latest-opp">
							<div class="opp">Opportunities</div>
							<div class="opp-list">
								<div class="opp-row">
									<div class="logo"></div>
									<div class="info">
										<div class="name"></div>
										<div class="location"></div>
										<div class="points"></div>
									</div> 
								</div>
							</div>
						</div>
				    </div>
		    		<div class="yui-u">
		    			<div class="signup">
		    				Sign up
		    			</div>
		    			<div class="feed">
		    				Latest achievements
		    			</div>	
					</div>
				</div>
		
			</div>
			
		    <div id="ft" role="contentinfo">
		    	<p>Startup Weekend : VolunCheer</p>
		    </div>
		    
		</div>
	</body>
</html>