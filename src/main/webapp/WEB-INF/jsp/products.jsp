<%--
  Created by IntelliJ IDEA.
  User: nikod
  Date: 27/01/2022
  Time: 16:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en"><head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="Responsive Bootstrap4 Shop Template, Created by Imran Hossain from https://imransdesign.com/">

    <!-- title -->
    <title>Single Product</title>

    <!-- favicon -->
    <link rel="shortcut icon" type="image/png" href="${pageContext.request.contextPath }/resources/assets/img/favicon2.png">
    <!-- google font -->
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,700" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Poppins:400,700&amp;display=swap" rel="stylesheet">
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
<div class="loader" style="display: none;">
    <div class="loader-inner">
        <div class="circle"></div>
    </div>
</div>
<!--PreLoader Ends-->

<!-- header -->
<div id="sticker-sticky-wrapper" class="sticky-wrapper" style="height: 50px;"><div class="top-header-area" id="sticker" style="">
    <div class="container">
        <div class="row">
            <div class="col-lg-12 col-sm-12 text-center">
                <div class="main-menu-wrap">
                    <!-- logo -->
                    <div class="site-logo">
                        <a href="index.html">
                            <img src="assets/img/logo.png" alt="">
                        </a>
                    </div>
                    <!-- logo -->

                    <!-- menu start -->
                    <nav class="main-menu">
                        <ul>
                            <li><a href="index">Home</a></li>
                            <li><a href="pageShop">Prenota Qui</a></li>
                            <li><a href="contactPage">Contatti</a></li
                            <li>
                                <div class="header-icons">
                                    <a class="shopping-cart" href="loginPage"><i class="fas fa-shopping-bag"></i></a>
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
</div></div>
<!-- end header -->

<!-- search area -->
<div class="search-area">
    <div class="container">
        <div class="row">
            <div class="col-lg-12">
                <span class="close-btn"><i class="fas fa-window-close"></i></span>
                <div class="search-bar">
                    <div class="search-bar-tablecell">
                        <h3>Cerca per:</h3>
                        <input type="text" placeholder="Parola chiave">
                        <button type="submit">Cerca <i class="fas fa-search"></i></button>
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
                    <p>Effettua la prenotazione</p>
                    <h1>Stabilimento Balneare</h1>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- end breadcrumb section -->

<!-- single product -->
<div class="single-product mt-150 mb-150">
    <div class="container">
        <div class="row">
            <div class="col-md-5">
                <div class="single-product-img">
                    <img src="${pageContext.request.contextPath }/resources/assets/img/products/product-img-5.jpg" alt="">
                </div>
            </div>
            <div class="col-md-7">
                <div class="single-product-content">
                    <h3>Green apples have polyphenols</h3>
                    <p class="single-product-pricing"><span>Per Kg</span> $50</p>
                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Dicta sint dignissimos, rem commodi cum voluptatem quae reprehenderit repudiandae ea tempora incidunt ipsa, quisquam animi perferendis eos eum modi! Tempora, earum.</p>
                    <div class="single-product-form">
                        <form action="index.html">
                            <input type="number" placeholder="0">
                        </form>
                        <a href="cart.html" class="cart-btn"><i class="fas fa-shopping-cart"></i> Add to Cart</a>
                        <p><strong>Categories: </strong>Fruits, Organic</p>
                    </div>
                    <h4>Share:</h4>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- end single product -->

<!-- more products -->
<div class="more-products mb-150">
    <div class="container">
        <div class="row">
            <div class="col-lg-8 offset-lg-2 text-center">
                <div class="section-title">
                    <h3><span class="orange-text">Related</span> Products</h3>
                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Aliquid, fuga quas itaque eveniet beatae optio.</p>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-lg-4 col-md-6 text-center">
                <div class="single-product-item">
                    <div class="product-image">
                        <a href="single-product.html"><img src="${pageContext.request.contextPath }/resources/assets/img/products/product-img-1.jpg" alt=""></a>
                    </div>
                    <h3>Strawberry</h3>
                    <p class="product-price"><span>Per Kg</span> 85$ </p>
                    <a href="cart.html" class="cart-btn"><i class="fas fa-shopping-cart"></i> Add to Cart</a>
                </div>
            </div>
            <div class="col-lg-4 col-md-6 text-center">
                <div class="single-product-item">
                    <div class="product-image">
                        <a href="single-product.html"><img src="${pageContext.request.contextPath }/resources/assets/img/products/product-img-2.jpg" alt=""></a>
                    </div>
                    <h3>Berry</h3>
                    <p class="product-price"><span>Per Kg</span> 70$ </p>
                    <a href="cart.html" class="cart-btn"><i class="fas fa-shopping-cart"></i> Add to Cart</a>
                </div>
            </div>
            <div class="col-lg-4 col-md-6 offset-lg-0 offset-md-3 text-center">
                <div class="single-product-item">
                    <div class="product-image">
                        <a href="single-product.html"><img src="${pageContext.request.contextPath }/resources/assets/img/products/product-img-3.jpg" alt=""></a>
                    </div>
                    <h3>Lemon</h3>
                    <p class="product-price"><span>Per Kg</span> 35$ </p>
                    <a href="cart.html" class="cart-btn"><i class="fas fa-shopping-cart"></i> Add to Cart</a>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- end more products -->


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


</body></html>
