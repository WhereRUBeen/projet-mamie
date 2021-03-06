<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Panier | Corporate</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">


<link rel="stylesheet" href="style/adminAccueil.css">

<script>
	$(document).ready(function() {
		$('[data-toggle=offcanvas]').click(function() {
			$('.row-offcanvas').toggleClass('active');
		});
	});
</script>

<style type="text/css">
@charset "UTF-8";

body, html, .row-offcanvas {
	height: 100%;
}

body {
	background:
		url("https://scontent-yyz1-1.cdninstagram.com/t51.2885-15/s640x640/sh0.08/e35/21689828_132617094046270_5599749253531435008_n.jpg" )
		no-repeat center center fixed;
	background-size: cover;
	-webkit-background-size: cover;
	-moz-background-size: cover;
	-o-background-size: cover;
}

h1 {
	color: red;
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
#premierDivCorpPanier {
	background: #9e3c51;
	margin-top: 25px;
}

#secondDivCorpPanier {
	background: #fbd8c9;
}

#dernierDivCorpPanier {
	background: #9e3c51;
}

h2 {
	text-align: center;
	color: #fbd8c9;
}
</style>

</head>
<body>
	<%@include file="/views/header.jsp"%>

		<div id="main">


			<div class="jumbotron container" id="premierDivCorpPanier">
				<h2>Votre Panier</h2>

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
			<!-- LE TABBLEAU DU PANIER -->

			<div class="jumbotron container" id="secondDivCorpPanier">


				<table class="table table-hover">
					<thead>
						<tr>
							<th>Numero Commande</th>
							<th>Produit</th>
							<th>Quantité</th>
							<th>Prix total</th>
							<th>Supprimer</th>
						</tr>
						
						
						
					</thead>
					<tbody>

					</tbody>
				</table>












			</div>

			<div class="jumbotron container" id="dernierDivCorpPanier"></div>

		</div>
	</div>
	<!--/row-offcanvas -->

</body>
</html>