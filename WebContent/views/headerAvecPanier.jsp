<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	<%! boolean isConnected = (boolean)session.getValue('isConnected'); %>
	<% if (isConnected == null){isConnected = false;} %>
	
<% if (isConnected){ %>;

<header>
	<div class="navbar navbar-inverse navbar-fixed-top ">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target=".navbar-collapse">
				<span class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
				<a class="navbar-brand" href="#">Mami Clafoutis</a>
		</div>
		<div class="collapse navbar-collapse ">
			<ul class="nav navbar-nav ml-auto">
				<li>
					<a href="">Panier<i class="fa fa-cart-plus fa-1x" aria-hidden="true"></i></a>
				</li>
				<li><a href="#">Deconexion</a></li>
			</ul>
		</div>
		<!--/.nav-collapse -->
	</div>
<!--/.navbar -->
</header>

<%} else { %>

<header>
	<div class="navbar navbar-inverse navbar-fixed-top ">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target=".navbar-collapse">
				<span class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#">Mami Cafoutie</a>
		</div>
		<div class="collapse navbar-collapse ">
			<ul class="nav navbar-nav ml-auto">
				<li><a href="#">Inscription</a></li>
				<li><a href="#myModal" data-toggle="modal">Connexion</a>
				<span style="color:red; display:<%= tryed ? "inline" : "none"%>;">Identifiants incorects</span></li>
			</ul>
		</div>
		<!--/.nav-collapse -->
			
	</div>
	<!--/.navbar -->
</header>

<% } %>
