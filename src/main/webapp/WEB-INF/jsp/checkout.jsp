<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="Responsive Bootstrap4 Shop Template, Created by Imran Hossain from https://imransdesign.com/">

	<!-- title -->
	<title>Check Out</title>

	<!-- favicon -->
	<link rel="shortcut icon" type="image/png" href="${pageContext.request.contextPath }/resources/assets/img/favicon2.png">
	<!-- google font -->
	<link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,700" rel="stylesheet">
	<link href="https://fonts.googleapis.com/css?family=Poppins:400,700&display=swap" rel="stylesheet">
	<!-- fontawesome -->
	<link rel="stylesheet" href="${pageContext.request.contextPath }/resources/assets/css/all.min.css">
	<!-- bootstrap -->
	<link rel="stylesheet" href="${pageContext.request.contextPath }/resources/assets/bootstrap/css/bootstrap.min.css">
	<!-- owl carousel -->
	<link rel="stylesheet" href="${pageContext.request.contextPath }/resources/assets/css/owl.carousel.css">
	<!-- magnific popup -->
	<link rel="stylesheet" href="${pageContext.request.contextPath }/resources/assets/css/magnific-popup.css">
	<!-- animate css -->
	<link rel="stylesheet" href="${pageContext.request.contextPath }/resources/assets/css/animate.css">
	<!-- mean menu css -->
	<link rel="stylesheet" href="${pageContext.request.contextPath }/resources/assets/css/meanmenu.min.css">
	<!-- main style -->
	<link rel="stylesheet" href="${pageContext.request.contextPath }/resources/assets/css/main.css">
	<!-- responsive -->
	<link rel="stylesheet" href="${pageContext.request.contextPath }/resources/assets/css/responsive.css">

</head>
<body>
	
	<!--PreLoader-->
    <div class="loader">
        <div class="loader-inner">
            <div class="circle"></div>
        </div>
    </div>
    <!--PreLoader Ends-->

	<!-- header -->
	<div class="top-header-area" id="sticker">
		<div class="container">
			<div class="row">
				<div class="col-lg-12 col-sm-12 text-center">
					<div class="main-menu-wrap">
						<!-- logo -->
						<div class="site-logo">
							<a href="/">
								<img src="${pageContext.request.contextPath }/resources/assets/img/logo.png" alt="">
							</a>
						</div>
						<!-- logo -->

						<!-- menu start -->
						<nav class="main-menu">
							<ul>
								<li><a href="index">Home</a></li>
								<li><a href="pageShop">Prenota Qui</a></li>
								<li><a href="contactPage">Contatti</a></li>
								<li>
									<div class="header-icons">
										<c:if test="${username == null}">
											<a class="shopping-cart" href="login"><i class="fas fa-shopping-bag"></i></a>
										</c:if>
										<c:if test="${username != null}">
											<a class="shopping-cart" href="profile"><i class="fas fa-shopping-cart"></i></a>
										</c:if>
										<a class="mobile-hide search-bar-icon" href="#"><i class="fas fa-search"></i></a>
									</div>
								</li>
							</ul>
						</nav>
						<a class="mobile-show search-bar-icon" href="#"><i class="fas fa-search"></i></a>
						<div class="mobile-menu"></div>
						<!-- menu end -->
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- end header -->

	<!-- search area -->
	<div class="search-area">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<span class="close-btn"><i class="fas fa-window-close"></i></span>
					<div class="search-bar">
						<div class="search-bar-tablecell">
							<h3>Search For:</h3>
							<input type="text" placeholder="Parola chiave" id="testoRicerca">
							<a onclick="cerca()"><button type="submit">Cerca <i class="fas fa-search"></i></button></a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- end search area -->
	
	<!-- breadcrumb-section -->
	<div class="breadcrumb-section breadcrumb-bg">
		<div class="container">
			<div class="row">
				<div class="col-lg-8 offset-lg-2 text-center">
					<div class="breadcrumb-text">
						<p>Procedi al</p>
						<h1>Check Out</h1>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- end breadcrumb section -->

	<!-- check out section -->
	<div class="checkout-section mt-150 mb-150">
		<div class="container">
			<div class="row">
				<div class="col-lg-8">
					<div class="checkout-accordion-wrap">
						<div class="accordion" id="accordionExample">
						  <div class="card single-accordion">
							<div class="card-header" id="headingFour">
							  <h5 class="mb-0">
								<button class="btn btn-link" type="button" data-toggle="collapse" data-target="#collapseFour" aria-expanded="true" aria-controls="collapseFour">
									Info
								</button>
							  </h5>
							</div>
							<div id="collapseFour" class="collapse show" aria-labelledby="headingThree" data-parent="#accordionExample">
							  <div class="card-body">
								  <div class="card-details">
									  <p>${utenteCheckOut.nome} ${utenteCheckOut.cognome}</p>
									  <p><label>Data inizio:</label> ${prenotazioneCheckOut.dataInizio}</p>
									  <p><label>Data fine:</label> ${prenotazioneCheckOut.dataFine}</p>
									  <p><label>Descrizione: </label></p>
									  <p>${prenotazioneCheckOut.descrizione}</p>
								  </div>
							  </div>
							</div>
						  </div>
						</div>

					</div>
				</div>

				<div class="col-lg-4">
					<div class="order-details-wrap">
						<table class="order-details">
							<thead>
								<tr>
									<th>Riepilogo del tuo ordine</th>
									<th>Prezzo</th>
								</tr>
							</thead>
							<tbody class="order-details-body">
							</tbody>
							<tbody class="checkout-details">
								<tr>
									<td>Total</td>
									<td>${prenotazioneCheckOut.prezzoTotale} ???</td>
								</tr>
							</tbody>
						</table><br/>

						<a onclick="pagamentoInLoco()" class="boxed-btn" id="btnPagamentoInSede">Pagamento fisico</a><br/>
						<a class="boxed-btn" id="cancelPrenotazione" onclick="annulla()">Annulla prenotazione</a><br/>

						<!--PULSANTE PAYPAL -->
						<br/><div id="smart-button-container">
							<div style="text-align: center;">
								<div id="paypal-button-container"></div>
							</div>
						</div>
						<script src="https://www.paypal.com/sdk/js?client-id=sb&enable-funding=venmo&currency=EUR" data-sdk-integration-source="button-factory"></script>
						<script>
							function initPayPalButton() {
								paypal.Buttons({
									style: {
										shape: 'rect',
										color: 'blue',
										layout: 'horizontal',
										label: 'pay',

									},

									createOrder: function(data, actions) {
										return actions.order.create({
											<!--CAMBIARE 25 CON IL PREZZO DELLA PRENOTAZIONE,fatto -->
											purchase_units: [{"amount":{"currency_code":"EUR","value":${prenotazioneCheckOut.prezzoTotale}}}]
										});
									},

									onApprove: function(data, actions) {
										return actions.order.capture().then(async function (orderData) {

											// Full available details
											console.log('Capture result', orderData, JSON.stringify(orderData, null, 2));

											// Show a success message within this page, e.g.
											const element = document.getElementById('paypal-button-container');
											element.innerHTML = '';
											element.innerHTML = '<h3>Grazie per il tuo ordine</h3>';

											async function sleep(ms) {
												await new Promise(resolve => setTimeout(resolve, ms));
											}

											await sleep(3000);
											window.location.href = "index";
											// Or go to another URL:  actions.redirect('thank_you.html');

										});
									},

									onError: function(err) {
										console.log(err);
									}
								}).render('#paypal-button-container');
							}
							initPayPalButton();
						</script>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- end check out section -->


	<!-- footer -->
	<div class="footer-area">
		<div class="container">
			<div class="row">
				<div class="col-lg-3 col-md-6">
					<div class="footer-box about-widget">
						<h2 class="widget-title">About us</h2>
						<p>Siamo un gruppo di 4 studenti che hanno realizzato questo sito per un progetto universitario.</p>
					</div>
				</div>
				<div class="col-lg-3 col-md-6">
					<div class="footer-box get-in-touch">
						<h2 class="widget-title">Resta in Contatto</h2>
						<ul>
							<li> Italia, Calabria, Rende, 87036, Via Pietro Bucci</li>
							<li>support@onthebeach.com</li>
							<li>+00 111 222 3333</li>
						</ul>
					</div>
				</div>
				<div class="col-lg-3 col-md-6">
					<div class="footer-box pages">
						<h2 class="widget-title">Pagine</h2>
						<ul>
							<li><a href="index">Home</a></li>
							<li><a href="pageShop">Negozio</a></li>
							<li><a href="contactPage">Contatti</a></li>
						</ul>
					</div>
				</div>
				<div class="col-lg-3 col-md-6">
					<div class="footer-box subscribe">
						<h2 class="widget-title">Subscribe</h2>
						<p>Iscriviti con la tua mail per ottenere i prossimi aggiornamenti.</p>
						<form action="index.html">
							<input type="email" placeholder="Email">
							<button type="submit"><i class="fas fa-paper-plane"></i></button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- end footer -->

	<!-- copyright -->
	<div class="copyright">
		<div class="container">
			<div class="row">
				<div class="col-lg-6 col-md-12">
					<p>Copyrights &copy; 2022 - <a href="https://informatica.unical.it/">Unical</a>,  All Rights Reserved.
					</p>
				</div>
				<div class="col-lg-6 text-right col-md-12">
					<div class="social-icons">

					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- end copyright -->
	
	<!-- jquery -->
	<script src="${pageContext.request.contextPath }/resources/assets/js/jquery-1.11.3.min.js"></script>
	<!-- bootstrap -->
	<script src="${pageContext.request.contextPath }/resources/assets/bootstrap/js/bootstrap.min.js"></script>
	<!-- count down -->
	<script src="${pageContext.request.contextPath }/resources/assets/js/jquery.countdown.js"></script>
	<!-- isotope -->
	<script src="${pageContext.request.contextPath }/resources/assets/js/jquery.isotope-3.0.6.min.js"></script>
	<!-- waypoints -->
	<script src="${pageContext.request.contextPath }/resources/assets/js/waypoints.js"></script>
	<!-- owl carousel -->
	<script src="${pageContext.request.contextPath }/resources/assets/js/owl.carousel.min.js"></script>
	<!-- magnific popup -->
	<script src="${pageContext.request.contextPath }/resources/assets/js/jquery.magnific-popup.min.js"></script>
	<!-- mean menu -->
	<script src="${pageContext.request.contextPath }/resources/assets/js/jquery.meanmenu.min.js"></script>
	<!-- sticker js -->
	<script src="${pageContext.request.contextPath }/resources/assets/js/sticker.js"></script>
	<!-- main js -->
	<script src="${pageContext.request.contextPath }/resources/assets/js/main.js"></script>

	<script src="${pageContext.request.contextPath }/resources/assets/js/prenotazione.js"></script>

	<script src="${pageContext.request.contextPath }/resources/assets/js/jquery.min.map.js"></script>
</body>
</html>