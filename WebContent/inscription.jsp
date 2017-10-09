<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Inscription | Mamie Clafoutis Entreprise</title>
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

	<%@ include file="views/header.jsp" %>
	
	<main>
	<div class="jumbotron" id="bienvenue">

		<h3 style="text-align: center;">Inscription</h3>
	</div>



	<div class="jumbotron">
		<div class="container">
			<form>
				<div class="form-group row">
					<label for="inputEmail3" class="col-sm-2 col-form-label">Nom</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="inputNom"
							placeholder="Nom">
					</div>
				</div>
				<div class="form-group row">
					<label for="inputEmail3" class="col-sm-2 col-form-label">Prenom</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="inputPrenom"
							placeholder="Prenom">
					</div>
				</div>
				<div class="form-group row">
					<label for="inputEmail3" class="col-sm-2 col-form-label">Email</label>
					<div class="col-sm-10">
						<input type="email" class="form-control" id="inputEmail3"
							placeholder="Email">
					</div>
				</div>
				<div class="form-group row">
					<label for="inputPassword3" class="col-sm-2 col-form-label">Password</label>
					<div class="col-sm-10">
						<input type="password" class="form-control" id="inputPassword3"
							placeholder="Password">
					</div>
				</div>
				<fieldset class="form-group row">
					<legend class="col-form-legend col-sm-2">Vous etes</legend>
					<div class="col-sm-10">
						<div class="form-check">
							<label class="form-check-label"> <input
								class="form-check-input" type="radio" name="gridRadios"
								id="gridRadios1" value="corporate" checked> Corporate
							</label>
						</div>
						<div class="form-check">
							<label class="form-check-label"> <input
								class="form-check-input" type="radio" name="gridRadios"
								id="gridRadios2" value="franchise"> Franchise
							</label>
						</div>
						<div class="form-check disabled">
							<label class="form-check-label"> <input
								class="form-check-input" type="radio" name="gridRadios"
								id="gridRadios3" value="autres"> Autres
							</label>
						</div>
					</div>
				</fieldset>

				<div class="form-group row">
					<div class="offset-sm-2 col-sm-10">
						<button type="submit" class="btn btn-primary">Inscription</button>
					</div>
				</div>
			</form>
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
					<a href="#">Mot de passe oublié ?</a>
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