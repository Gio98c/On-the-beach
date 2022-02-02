<%--
  Created by IntelliJ IDEA.
  User: nikod
  Date: 23/01/2022
  Time: 12:59
  To change this template use File | Settings | File Templates.
--%>

<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en"><head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport"">
    <meta name="description">

    <!-- title -->
    <title>Negozio</title>

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
<!--PreLoader Ends -->



<!-- header -->
<div class="top-header-area" id="sticker">
    <div class="container">
        <div class="row">
            <div class="col-lg-12 col-sm-12 text-center">
                <div class="main-menu-wrap">
                    <!-- logo -->
                    <div class="site-logo">
                        <a href="index">
                            <img src="${pageContext.request.contextPath }/resources/assets/img/logo.png" alt="">
                        </a>
                    </div>
                    <!-- logo -->

                    <!-- menu start -->
                    <nav class="main-menu">
                        <ul>
                            <li><a href="index">Home</a></li>
                            <li><a href="pageShop">Prenota Qui</a></li>
                            <!--<li><a href="#">Pages</a>
                                <ul class="sub-menu">
                                    <li><a href="404.jsp">404 page</a></li>
                                    <li><a href="about.html">About</a></li>
                                    <li><a href="cart.html">Cart</a></li>
                                    <li><a href="checkout.html">Check Out</a></li>
                                    <li><a href="contact.html">Contact</a></li>
                                    <li><a href="news.html">News</a></li>
                                    <li><a href="shop.html">Shop</a></li>
                                </ul>
                            </li>
                            <li><a href="news.html">News</a>
                                <ul class="sub-menu">
                                    <li><a href="news.html">News</a></li>
                                    <li><a href="single-news.html">Single News</a></li>
                                </ul>
                            </li>-->
                            <li><a href="contactPage">Contatti</a></li>
                            <!--<li><a href="shop.html">Shop</a>
                                <ul class="sub-menu">
                                    <li><a href="shop.html">Shop</a></li>
                                    <li><a href="checkout.html">Check Out</a></li>
                                    <li><a href="single-product.html">Single Product</a></li>
                                    <li><a href="cart.html">Cart</a></li>
                                </ul>
                            </li>-->
                            <li>
                                <div class="header-icons">
                                    <c:if test="${username == null}">
                                        <a class="shopping-cart" href="login"><i class="fas fa-shopping-bag"></i></a>
                                    </c:if>
                                    <c:if test="${username != null}">
                                        <!-- questo va tolto -->
                                        <a class="shopping-cart" href="logout"><i class="fas fa-shopping-cart"></i></a>
                                    </c:if>
                                    <a class="mobile-hide search-bar-icon" href="#"><i class="fas fa-search"></i></a>
                                </div>
                            </li>
                        </ul>
                    </nav>
                    <a class="mobile-show search-bar-icon" href="#"><i class="fas fa-search"></i></a>
                    <div class="mobile-menu"></div>
                    <!-- menu end -->
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
                        <h3>Cerca per:</h3>
                        <input type="text" placeholder="Parola chiave">
                        <a href="product?lido=${lido.nome}"><button type="submit">Cerca <i class="fas fa-search"></i></button></a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- end search arewa -->

<!-- breadcrumb-section -->
<div class="breadcrumb-section breadcrumb-bg">
    <div class="container">
        <div class="row">
            <div class="col-lg-8 offset-lg-2 text-center">
                <div class="breadcrumb-text">
                    <p>Per la tua vacanza ideale</p>
                    <h1>Negozio</h1>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- end breadcrumb section -->

<!-- products -->
<div class="product-section mt-150 mb-150">
    <div class="container">

        <div class="row">
            <div class="col-md-12">
                <div class="product-filters">
                    <ul>
                        <li class="active" data-filter="*">ALL</li>
                        <li data-filter=".strawberry">Prezzo </li>
                        <li data-filter=".berry">Recensioni</li>
                        <li data-filter=".lemon">Localita' vicine</li>
                    </ul>
                </div>
            </div>
        </div>

        <div class="latest-news mt-150 mb-150">
            <div class="container">
                <div class="row">
                    <!--<jsp:useBean id="lidi" scope="request" type="java.util.List"/>-->
                    <c:forEach items="${lidi}" var="lido">
                        <div class="col-lg-4 col-md-6">
                            <div class="single-latest-news">
                                <a onclick="visualizzaProdotto(${lido.nome})"><div class="latest-news-bg" style="background-image: url('./imgPath1/${lido.foto}')"></div></a>
                                <div class="news-text-box">
                                    <h3><a href="product?lido=${lido.nome}">${lido.nome}</a></h3>
                                    <!-- <p class="blog-meta">
                                        <span class="author"><i class="fas fa-user"></i> Admin</span>
                                        <span class="date"><i class="fas fa-calendar"></i> 27 December, 2019</span>
                                    </p> -->
                                    <p class="excerpt">${lido.descrizione}</p>
                                    <c:forEach items="${ombrelloni}" var="omb">
                                        <c:if test="${omb.nomeLido == lido.nome}">
                                            <p class="product-price"><span>1 giorno</span> ${omb.prezzo} </p>
                                        </c:if>
                                    </c:forEach>

                                    <!--<p class="product-price"><span>1 giorno</span> ${ombrelloni.prezzo}</p>-->
                                    <a href="product?lido=${lido.nome}" class="cart-btn"><i class="fas fa-shopping-cart"></i> Prenota</a>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                    <!--
                    <div class="col-lg-4 col-md-6">
                        <div class="single-latest-news">
                            <a href="single-news.html"><div class="latest-news-bg news-bg-2"></div></a>
                            <div class="news-text-box">
                                <h3><a href="single-news.html">Spox</a></h3>
                                <p class="excerpt">Descrizione lido Spox</p>
                                <a href="single-news.html" class="read-more-btn">read more <i class="fas fa-angle-right"></i></a>

                                <p class="product-price"><span>1 giorno</span> 35€ </p>
                                <a href="checkout" class="cart-btn"><i class="fas fa-shopping-cart"></i> Prenota</a>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-6">
                        <div class="single-latest-news">
                            <a href="single-news.html"><div class="latest-news-bg news-bg-3"></div></a>
                            <div class="news-text-box">
                                <h3><a href="single-news.html">San Domenico</a></h3>
                                <p class="excerpt">Descrizione lido San Domenico</p>
                                <p class="product-price"><span>1 giorno</span> 30€ </p>
                                <a href="checkout" class="cart-btn"><i class="fas fa-shopping-cart"></i> Prenota</a>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-6">
                        <div class="single-latest-news">
                            <a href="single-news.html"><div class="latest-news-bg news-bg-4"></div></a>
                            <div class="news-text-box">
                                <h3><a href="single-news.html">Fall in love with the fresh orange</a></h3>
                                <p class="blog-meta">
                                    <span class="author"><i class="fas fa-user"></i> Admin</span>
                                    <span class="date"><i class="fas fa-calendar"></i> 27 December, 2019</span>
                                </p>
                                <p class="excerpt">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Voluptatibus laborum autem, dolores inventore, beatae nam.</p>
                                <a href="single-news.html" class="read-more-btn">read more <i class="fas fa-angle-right"></i></a>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-6">
                        <div class="single-latest-news">
                            <a href="single-news.html"><div class="latest-news-bg news-bg-5"></div></a>
                            <div class="news-text-box">
                                <h3><a href="single-news.html">Why the berries always look delecious</a></h3>
                                <p class="blog-meta">
                                    <span class="author"><i class="fas fa-user"></i> Admin</span>
                                    <span class="date"><i class="fas fa-calendar"></i> 27 December, 2019</span>
                                </p>
                                <p class="excerpt">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Voluptatibus laborum autem, dolores inventore, beatae nam.</p>
                                <a href="single-news.html" class="read-more-btn">read more <i class="fas fa-angle-right"></i></a>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-6">
                        <div class="single-latest-news">
                            <a href="single-news.html"><div class="latest-news-bg news-bg-6"></div></a>
                            <div class="news-text-box">
                                <h3><a href="single-news.html">Love for fruits are genuine of John Doe</a></h3>
                                <p class="blog-meta">
                                    <span class="author"><i class="fas fa-user"></i> Admin</span>
                                    <span class="date"><i class="fas fa-calendar"></i> 27 December, 2018</span>
                                </p>
                                <p class="excerpt">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Voluptatibus laborum autem, dolores inventore, beatae nam.</p>
                                <a href="single-news.html" class="read-more-btn">read more <i class="fas fa-angle-right"></i></a>
                            </div>
                        </div>
                    </div>-->
                </div>

            </div>
        </div>
        <div class="row">
            <div class="col-lg-12 text-center">
                <div class="pagination-wrap">
                    <ul>
                        <li><a href="#">Prev</a></li>
                        <li><a href="#">1</a></li>
                        <li><a class="active" href="#">2</a></li>
                        <li><a href="#">3</a></li>
                        <li><a href="#">Next</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- end products -->

<!-- logo carousel -->
<!--
<div class="logo-carousel-section">
    <div class="container">
        <div class="row">
            <div class="col-lg-12">
                <div class="logo-carousel-inner owl-carousel owl-theme owl-loaded">





                    <div class="owl-stage-outer"><div class="owl-stage" style="transform: translate3d(-720px, 0px, 0px); transition: all 0.25s ease 0s; width: 2640px;"><div class="owl-item cloned" style="width: 210px; margin-right: 30px;"><div class="single-logo-item">
                        <img src="${pageContext.request.contextPath }/resources/assets/img/company-logos/3.png" alt="">
                    </div></div><div class="owl-item cloned" style="width: 210px; margin-right: 30px;"><div class="single-logo-item">
                        <img src="${pageContext.request.contextPath }/resources/assets/img/company-logos/4.png" alt="">
                    </div></div><div class="owl-item cloned" style="width: 210px; margin-right: 30px;"><div class="single-logo-item">
                        <img src="${pageContext.request.contextPath }/resources/assets/img/company-logos/5.png" alt="">
                    </div></div><div class="owl-item active" style="width: 210px; margin-right: 30px;"><div class="single-logo-item">
                        <img src="${pageContext.request.contextPath }/resources/assets/img/company-logos/1.png" alt="">
                    </div></div><div class="owl-item active" style="width: 210px; margin-right: 30px;"><div class="single-logo-item">
                        <img src="${pageContext.request.contextPath }/resources/assets/img/company-logos/2.png" alt="">
                    </div></div><div class="owl-item active" style="width: 210px; margin-right: 30px;"><div class="single-logo-item">
                        <img src="${pageContext.request.contextPath }/resources/assets/img/company-logos/3.png" alt="">
                    </div></div><div class="owl-item" style="width: 210px; margin-right: 30px;"><div class="single-logo-item">
                        <img src="${pageContext.request.contextPath }/resources/assets/img/company-logos/4.png" alt="">
                    </div></div><div class="owl-item" style="width: 210px; margin-right: 30px;"><div class="single-logo-item">
                        <img src="${pageContext.request.contextPath }/resources/assets/img/company-logos/5.png" alt="">
                    </div></div><div class="owl-item cloned" style="width: 210px; margin-right: 30px;"><div class="single-logo-item">
                        <img src="${pageContext.request.contextPath }/resources/assets/img/company-logos/1.png" alt="">
                    </div></div><div class="owl-item cloned" style="width: 210px; margin-right: 30px;"><div class="single-logo-item">
                        <img src="${pageContext.request.contextPath }/resources/assets/img/company-logos/2.png" alt="">
                    </div></div><div class="owl-item cloned" style="width: 210px; margin-right: 30px;"><div class="single-logo-item">
                        <img src="${pageContext.request.contextPath }/resources/assets/img/company-logos/3.png" alt="">
                    </div></div></div></div><div class="owl-controls"><div class="owl-nav"><div class="owl-prev" style="display: none;">prev</div><div class="owl-next" style="display: none;">next</div></div><div class="owl-dots" style=""><div class="owl-dot active"><span></span></div><div class="owl-dot"><span></span></div></div></div></div>
            </div>
        </div>
    </div>
</div>
-->
<!-- end logo carousel -->

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
                        <li href="mailto:giovannirusso1998.gr@gmail.com">support@onthebeach.com</li>
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