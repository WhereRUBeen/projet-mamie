<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Accueil | Mamie Clafoutis Entreprise</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">


<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="style/main.css">

</head>
<body>
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
					<li><a href="#myModal" data-toggle="modal">Connexion</a></li>
				</ul>
			</div>
			<!--/.nav-collapse -->
		</div>
		<!--/.navbar -->
	</header>
	<main>
	<div class="jumbotron" id="bienvenue">

		<h1 style="text-align: center;">Bienvenue chez Mamie!</h1>

	</div>
	<div class="jumbotron" id="description">
		<div class="container">
			<h3 style="text-align: center;">Chez Mamie Clafoutis, tout est
				artisanal, cela veut dire que chez Mamie, tout est fait à la main,
				avec amour et savoir-faire et sans aucun ingrédient au nom
				imprononçable.</h3>
			<p style="text-align: center;">Nous mettons un point d’honneur à
				vous servir des produits frais chaque jour. Nous sélectionnons
				soigneusement toutes les matières premières que nous utilisons et
				nos recettes sont simples et authentiques. Notre grande mission,
				c&rsquo;est de tout faire pour vous offrir des produits aussi bons
				que votre grand-mère vous aurait servi!</p>
			<p style="text-align: center;">Nous avons toute une équipe
				passionnée qui se dévoue pour vérifier que tous les jours, les
				gourmandises que l’on vous propose sont d’une qualité irréprochable,
				même si cela implique le calvaire de manger des croissants tous les
				matins.</p>
		</div>
	</div>
	<div class="jumbotron" id="carrouselContainer">
		<p style="text-align: center;">
			<a href="http://www.mamieclafoutis.com" target="_blank"
				class="btn btn-primary btn-lg">mamieclafoutis.com</a>
		</p>
		<div class="indexCarrousel">
			<div id="myCarousel" class="carousel slide" data-interval="3000"
				data-ride="carousel">
				<!-- Carousel indicators -->
				<ol class="carousel-indicators">
					<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
					<li data-target="#myCarousel" data-slide-to="1"></li>
					<li data-target="#myCarousel" data-slide-to="2"></li>
				</ol>
				<!-- Wrapper for carousel items -->
				<div class="carousel-inner">
					<div class="active item">
						<img
							src="https://scontent-yyz1-1.cdninstagram.com/t51.2885-15/s640x640/sh0.08/e35/21690803_126232098101364_1809742881724825600_n.jpg"
							alt="First Slide">
						<div class="carousel-caption">
							<h3>Le plaisir de choisir</h3>
							<p>Choisir son pain Le petit rituel qui fait plaisir</p>
						</div>
					</div>
					<div class="item">
						<img
							src="https://scontent-yyz1-1.cdninstagram.com/t51.2885-15/s640x640/sh0.08/e35/21689828_132617094046270_5599749253531435008_n.jpg"
							alt="Second Slide">
						<div class="carousel-caption">
							<h3>Une de nos boutique</h3>
							<p>N'hésitez pas à venir dans l'une de nos boutiques.</p>
						</div>
					</div>
					<div class="item">
						<img
							src="https://scontent-yyz1-1.cdninstagram.com/t51.2885-15/s640x640/sh0.08/e35/c0.39.1080.1080/21879359_1596825123714572_6917665624780963840_n.jpg"
							alt="Third Slide">
						<div class="carousel-caption">
							<h3>Particularité de nos farines</h3>
							<p>Nos farines sont issues de la meunerie La Milanaise
								biologique.</p>
						</div>
					</div>
				</div>
				<!-- Carousel controls -->
				<a class="carousel-control left" href="#myCarousel"
					data-slide="prev"> <span
					class="glyphicon glyphicon-chevron-left"></span>
				</a> <a class="carousel-control right" href="#myCarousel"
					data-slide="next"> <span
					class="glyphicon glyphicon-chevron-right"></span>
				</a>
			</div>
		</div>
	</div>
	<div class="jumbotron" id="boutiques">
		<div class="row">
			<div class="col-sm-6 col-md-4 col-lg-2">
				<h3>Van Horne</h3>
				<ul>
					<li>1291, avenue Van Horne</li>
					<li>Outremont, QC, H2V 1K7</li>
					<li>Tel: (514) 750-7245</li>

				</ul>
				<p>
					<a href="http://www.mamieclafoutis.com/les-boutiques/van-horne/"
						target="_blank" class="btn btn-success">Info &raquo;</a>
				</p>
			</div>


			<div class="col-sm-6 col-md-4 col-lg-2">
				<h3>Saint Denis</h3>
				<ul>
					<li>3660, rue Saint-Denis</li>
					<li>Montréal, QC, H2X 3L7</li>
					<li>Tel : (438) 380-5624</li>
				</ul>
				<p>
					<a href="http://www.mamieclafoutis.com/les-boutiques/saint-denis/"
						target="_blank" class="btn btn-success">Info &raquo;</a>
				</p>

			</div>
			<div class="clearfix visible-sm-block"></div>
			<div class="col-sm-6 col-md-4 col-lg-2">
				<h3>Ile de soeurs</h3>
				<ul>
					<li>105, Chemin de la Pointe Nord</li>
					<li>Verdun, QC, H3E 0B5</li>
					<li>Tel : (514) 508-8800</li>
				</ul>
				<p>
					<a
						href="http://www.mamieclafoutis.com/les-boutiques/ile-des-soeurs/"
						target="_blank" class="btn btn-success">Info &raquo;</a>
				</p>
			</div>
			<div class="clearfix visible-md-block"></div>
			<div class="col-sm-6 col-md-4 col-lg-2">
				<h3>Notre Dame</h3>
				<ul>
					<li>2660, rue Notre-Dame Ouest</li>
					<li>Montréal, QC, H3J 1N7</li>
					<li>Tel : (514) 303-1511</li>
				</ul>
				<p>
					<a href="http://www.mamieclafoutis.com/les-boutiques/notre-dame/"
						target="_blank" class="btn btn-success">Info &raquo;</a>
				</p>
			</div>
			<div class="clearfix visible-sm-block"></div>
			<div class="col-sm-6 col-md-4 col-lg-2">
				<h3>Fleury</h3>
				<ul>
					<li>1602, rue Fleury Est</li>
					<li>Montréal, QC, H2C 1S8</li>
					<li>Tel : (438) 385-1602</li>
				</ul>
				<p>
					<a href="http://www.mamieclafoutis.com/les-boutiques/fleury/"
						target="_blank" class="btn btn-success">Info &raquo;</a>
				</p>
			</div>
			<div class="col-sm-6 col-md-4 col-lg-2">
				<h3>Angus</h3>
				<ul>
					<li>4093, rue Molson</li>
					<li>Montréal, QC, H1Y 3L1</li>
					<li>tél : (438) 384-7225</li>
				</ul>
				<p>
					<a href="http://www.mamieclafoutis.com/les-boutiques/angus/"
						target="_blank" class="btn btn-success">Info &raquo;</a>
				</p>
			</div>
		</div>
		<hr>
	</div>



	</main>
	<footer class="footer-basic-centered">

		<p class="footer-company-motto">Chez Mamie Clafoutis, tout est
			artisanal</p>

		<p class="footer-links">
			<a href="https://www.facebook.com/mamieclafoutis" target="_blank">Facebook</a>
			· <a href="https://www.pinterest.com/mamieclafoutis/" target="_blank">Pinterest</a>
			· <a href="https://www.instagram.com/_mamieclafoutis/"
				target="_blank">Instagram</a> · <a
				href="http://www.mamieclafoutis.com/a-propos-de-mamie-clafoutis/"
				target="_blank">A propos</a> · <a
				href="http://www.mamieclafoutis.com/contact/" target="_blank">Contact</a>
		</p>

		<p class="footer-company-name">Mamie Clafoutis &copy; 2017</p>

	</footer>
	<!-- FORMULAIRE DE CONNEXION  -->
	<!-- Modal HTML -->
	<div id="myModal" class="modal fade">
		<div class="modal-dialog modal-login">
			<div class="modal-content">
				<div class="modal-header">
					<h4 class="modal-title">Connexion</h4>
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>
				</div>
				<div class="modal-body">
					<form action="" method="post">
						<div class="form-group">
							<i class="fa fa-user"></i> <input type="text"
								class="form-control" placeholder="Username" required="required">
						</div>
						<div class="form-group">
							<i class="fa fa-lock"></i> <input type="password"
								class="form-control" placeholder="Password" required="required">
						</div>
						<div class="form-group">
							<input type="submit" class="btn btn-primary btn-block btn-lg"
								value="Login">
						</div>
					</form>

				</div>
				<div class="modal-footer">
					<a href="#">Forgot Password?</a>
				</div>
			</div>
		</div>
	</div>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</body>
</html>


