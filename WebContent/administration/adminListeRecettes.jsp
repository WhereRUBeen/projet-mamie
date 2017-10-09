<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Accueil | Administration</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


<link rel="stylesheet" href="style/adminAccueil.css">

<script>
	$(document).ready(function() {
		$('[data-toggle=offcanvas]').click(function() {
			$('.row-offcanvas').toggleClass('active');
		});
	});
</script>
<style>
@charset "UTF-8";

body, html, .row-offcanvas {
	height: 100%;
}

#divRecette {
	background: #fbd8c9;
}

/*LE MENU DE NAVIGATION*/
.navbar-nav {
	float: right;
}

.navbar-inverse .navbar-collapse, .navbar-inverse {
	border-color: #9e3c51;
	background: #fbd8c9;
	color: #9e3c51;
}

.navbar-inverse .navbar-nav>li>a {
	color: #9e3c51;
}

.navbar-nav>li>a {
	padding-top: 10px;
	padding-bottom: 10px;
	line-height: 20px;
	color: #9e3c51;
	font-family: 'Merriweather', serif;
	font-size: 18px;
	font-style: normal;
	font-weight: 700;
}

a {
	color: #ffffff;
	font-family: 'Merriweather', serif;
	font-size: 18px;
	font-style: normal;
	font-weight: 700;
}

body {
	padding-top: 50px;
}

#sidebar {
	width: inherit;
	min-width: 220px;
	max-width: 220px;
	background-color: #9e3c51;
	float: left;
	height: 100%;
	position: relative;
	overflow-y: auto;
	overflow-x: hidden;
	border-color: #9e3c51;
}

#main {
	height: 100%;
	overflow: auto;
}

/*
 * off Canvas sidebar
 * --------------------------------------------------
 */
@media screen and (max-width: 768px) {
	.row-offcanvas {
		position: relative;
		-webkit-transition: all 0.25s ease-out;
		-moz-transition: all 0.25s ease-out;
		transition: all 0.25s ease-out;
		width: calc(100% + 220px);
	}
	.row-offcanvas-left {
		left: -220px;
	}
	.row-offcanvas-left.active {
		left: 0;
	}
	.sidebar-offcanvas {
		position: absolute;
		top: 0;
	}
}

/*Menu*/
.dropdown, .dropup {
	/* position: relative; */
	height: 50px;
	padding-left: 13px;
}

/**/
#premierDivAdminListeRecetes {
	background: #9e3c51;
	margin-top: 25px;
}

#divRecette {
	background: #fbd8c9;
}

#dernierDivAdminListeRecetes {
	background: #9e3c51;
}

h2 {
	text-align: center;
	color: #fbd8c9;
}


body {
	background:
		url("https://scontent-yyz1-1.cdninstagram.com/t51.2885-15/s640x640/sh0.08/e35/21827304_301627140313944_3589131210934190080_n.jpg" )
		no-repeat center center fixed;
	background-size: cover;
	-webkit-background-size: cover;
	-moz-background-size: cover;
	-o-background-size: cover;
}
</style>




</head>
<body>
	<div class="navbar navbar-inverse navbar-fixed-top ">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target=".navbar-collapse">
				<span class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#">Mamis Clafoutis</a>
		</div>
		<div class="collapse navbar-collapse ">
			<ul class="nav navbar-nav ml-auto">

				<li><a href="#">Deconexion</a></li>
			</ul>
		</div>
		<!--/.nav-collapse -->
	</div>
	<!--/.navbar -->

	<div class="row-offcanvas row-offcanvas-left">
		<div id="sidebar" class="sidebar-offcanvas">
			<div class="col-md-12">
				<h3></h3>
				<ul class="nav nav-pills nav-stacked">
					<li class="active"><a href="#">Administration</a></li>
					<li><a href="nouvelleRecette.html">Nouvelle recette</a></li>
					<li><a href="#">Liste des recettes</a></li>
					<li class="divider"></li>
					<div class="dropdown">
						<button class="btn btn-default dropdown-toggle" type="button"
							data-toggle="dropdown">
							Utilisateurs <span class="caret"></span>
						</button>
						<ul class="dropdown-menu">
							<li><a href="#">En attentes</a></li>
							<li><a href="#">Membres</a></li>
						</ul>
					</div>
					<li class="divider"></li>
					<div class="dropdown">
						<button class="btn btn-default dropdown-toggle" type="button"
							data-toggle="dropdown">
							Commandes <span class="caret"></span>
						</button>
						<ul class="dropdown-menu">
							<li><a href="#">En attentes</a></li>
							<li><a href="#">Validées</a></li>
						</ul>
					</div>
					<li><a href="#">Statistiques</a></li>
				</ul>
			</div>

		</div>
		<div id="main">



			<div class="jumbotron container" id="premierDivAdminListeRecetes">

				<h2>Liste Des Recettes</h2>

				<div class='col-xs-12 col-sm-12 col-md-4 col-lg-4' id="divRecherche">

					<form class='navbar-form'>
						<div class='input-group'>
							<input class='form-control' type='text' name='search'
								placeholder='Recherche' /> <span class="input-group-btn">
								<button type='submit' class='btn btn-default'>
									<span class='glyphicon glyphicon-search'></span>
								</button>
							</span>

						</div>
					</form>

				</div>




			</div>
			<div class="jumbotron container " id="divRecette">

				<table class="table table-hover">
					<thead>
						<tr>
							<th>Nom Recette</th>
							<th>Catégorie</th>
							<th>URL Recette</th>
						</tr>
					</thead>
					<tbody>

					</tbody>
				</table>
			</div>

			<div class="jumbotron container" id="dernierDivAdminListeRecetes"></div>
		</div>
	</div>
	<!--/row-offcanvas -->

</body>
</html>