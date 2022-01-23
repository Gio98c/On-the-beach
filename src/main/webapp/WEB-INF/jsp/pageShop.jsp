<%--
  Created by IntelliJ IDEA.
  User: nikod
  Date: 23/01/2022
  Time: 12:59
  To change this template use File | Settings | File Templates.
--%>

<!DOCTYPE html>
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
<!--PreLoader Ends-->

<!-- header -->
<div id="sticker-sticky-wrapper" class="sticky-wrapper" style="height: 50px;"><div class="top-header-area" id="sticker" style="width: 966px;">
    <div class="container">
        <div class="row">
            <div class="col-lg-12 col-sm-12 text-center">
                <div class="main-menu-wrap">
                    <!-- logo -->
                    <div class="site-logo">
                        <a href="index.html">
                            <img src="${pageContext.request.contextPath }/resources/assets/img/logo.png" alt="">
                        </a>
                    </div>
                    <!-- logo -->

                    <!-- menu start -->
                    <div class="mean-push"></div><nav class="main-menu" style="display: none;">
                    <ul>
                        <li class="current-list-item"><a href="#">Home</a>
                            <ul class="sub-menu">
                                <li><a href="index">Home</a></li>
                            </ul>
                        </li>
                        <li><a href="about.html">About</a></li>
                        <li><a href="contact.html">Contatti</a></li>
                        <li><a href="shop.html">Shop</a>
                            <ul class="sub-menu">
                                <li><a href="shop.html">Shop</a></li>
                                <li><a href="checkout.html">Check Out</a></li>
                                <li><a href="single-product.html">Single Product</a></li>
                                <li><a href="cart.html">Cart</a></li>
                            </ul>
                        </li>
                        <li>
                            <div class="header-icons">
                                <a class="shopping-cart" href="cart.html"><i class="fas fa-shopping-cart"></i></a>
                                <a class="mobile-hide search-bar-icon" href="#"><i class="fas fa-search"></i></a>
                            </div>
                        </li>
                    </ul>
                </nav>
                    <a class="mobile-show search-bar-icon" href="#"><i class="fas fa-search"></i></a>
                    <div class="mobile-menu mean-container"><div class="mean-bar"><a href="#nav" class="meanmenu-reveal" style="background:;color:;right:0;left:auto;"><span></span><span></span><span></span></a><nav class="mean-nav">
                        <ul style="display: none;">
                            <li class="current-list-item"><a href="#">Home</a>
                                <ul class="sub-menu" style="display: none;">
                                    <li><a href="index.html">Static Home</a></li>
                                    <li><a href="index_2.html">Slider Home</a></li>
                                </ul>
                                <a class="mean-expand" href="#" style="font-size: 18px">+</a></li>
                            <li><a href="about.html">About</a></li>
                            <li><a href="#">Pages</a>
                                <ul class="sub-menu" style="display: none;">
                                    <li><a href="404.html">404 page</a></li>
                                    <li><a href="about.html">About</a></li>
                                    <li><a href="cart.html">Cart</a></li>
                                    <li><a href="checkout.html">Check Out</a></li>
                                    <li><a href="contact.html">Contact</a></li>
                                    <li><a href="news.html">News</a></li>
                                    <li><a href="shop.html">Shop</a></li>
                                </ul>
                                <a class="mean-expand" href="#" style="font-size: 18px">+</a></li>
                            <li><a href="news.html">News</a>
                                <ul class="sub-menu" style="display: none;">
                                    <li><a href="news.html">News</a></li>
                                    <li><a href="single-news.html">Single News</a></li>
                                </ul>
                                <a class="mean-expand" href="#" style="font-size: 18px">+</a></li>
                            <li><a href="contact.html">Contact</a></li>
                            <li><a href="shop.html">Shop</a>
                                <ul class="sub-menu" style="display: none;">
                                    <li><a href="shop.html">Shop</a></li>
                                    <li><a href="checkout.html">Check Out</a></li>
                                    <li><a href="single-product.html">Single Product</a></li>
                                    <li><a href="cart.html">Cart</a></li>
                                </ul>
                                <a class="mean-expand" href="#" style="font-size: 18px">+</a></li>
                            <li class="mean-last">
                                <div class="header-icons">
                                    <a class="shopping-cart" href="cart.html"><i class="fas fa-shopping-cart"></i></a>
                                    <a class="mobile-hide search-bar-icon" href="#"><i class="fas fa-search"></i></a>
                                </div>
                            </li>
                        </ul>
                    </nav></div></div>
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
                        <h3>Search For:</h3>
                        <input type="text" placeholder="Keywords">
                        <button type="submit">Search <i class="fas fa-search"></i></button>
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
                    <p>Per un soggiorno speciale</p>
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
                        <li class="active" data-filter="*">All</li>
                        <li data-filter=".strawberry">Soverato</li>
                        <li data-filter=".berry">Tropea</li>
                        <li data-filter=".lemon">Praia a Mare</li>
                    </ul>
                </div>
            </div>
        </div>

        <div class="row product-lists" style="position: relative; height: 1667.1px;">
            <div class="col-lg-4 col-md-6 text-center strawberry" style="position: absolute; left: 0px; top: 0px;">
                <div class="single-product-item">
                    <div class="product-image">
                        <a href="single-product.html"><img src="${pageContext.request.contextPath }/resources/assets/img/products/product-img-1.jpg" alt=""></a>
                    </div>
                    <h3>Strawberry</h3>
                    <p class="product-price"><span>1 giorno</span> 25$ </p>
                    <a href="cart.html" class="cart-btn"><i class="fas fa-shopping-cart"></i> Add to Cart</a>
                </div>
            </div>
            <div class="col-lg-4 col-md-6 text-center berry" style="position: absolute; left: 360px; top: 0px;">
                <div class="single-product-item">
                    <div class="product-image">
                        <a href="single-product.html"><img src="assets/img/products/product-img-2.jpg" alt=""></a>
                    </div>
                    <h3>Berry</h3>
                    <p class="product-price"><span>Per Kg</span> 70$ </p>
                    <a href="cart.html" class="cart-btn"><i class="fas fa-shopping-cart"></i> Add to Cart</a>
                </div>
            </div>
            <div class="col-lg-4 col-md-6 text-center lemon" style="position: absolute; left: 0px; top: 555.7px;">
                <div class="single-product-item">
                    <div class="product-image">
                        <a href="single-product.html"><img src="assets/img/products/product-img-3.jpg" alt=""></a>
                    </div>
                    <h3>Lemon</h3>
                    <p class="product-price"><span>Per Kg</span> 35$ </p>
                    <a href="cart.html" class="cart-btn"><i class="fas fa-shopping-cart"></i> Add to Cart</a>
                </div>
            </div>
            <div class="col-lg-4 col-md-6 text-center" style="position: absolute; left: 360px; top: 555.7px;">
                <div class="single-product-item">
                    <div class="product-image">
                        <a href="single-product.html"><img src="assets/img/products/product-img-4.jpg" alt=""></a>
                    </div>
                    <h3>Avocado</h3>
                    <p class="product-price"><span>Per Kg</span> 50$ </p>
                    <a href="cart.html" class="cart-btn"><i class="fas fa-shopping-cart"></i> Add to Cart</a>
                </div>
            </div>
            <div class="col-lg-4 col-md-6 text-center" style="position: absolute; left: 0px; top: 1111.4px;">
                <div class="single-product-item">
                    <div class="product-image">
                        <a href="single-product.html"><img src="assets/img/products/product-img-5.jpg" alt=""></a>
                    </div>
                    <h3>Green Apple</h3>
                    <p class="product-price"><span>Per Kg</span> 45$ </p>
                    <a href="cart.html" class="cart-btn"><i class="fas fa-shopping-cart"></i> Add to Cart</a>
                </div>
            </div>
            <div class="col-lg-4 col-md-6 text-center strawberry" style="position: absolute; left: 360px; top: 1111.4px;">
                <div class="single-product-item">
                    <div class="product-image">
                        <a href="single-product.html"><img src="assets/img/products/product-img-6.jpg" alt=""></a>
                    </div>
                    <h3>Strawberry</h3>
                    <p class="product-price"><span>Per Kg</span> 80$ </p>
                    <a href="cart.html" class="cart-btn"><i class="fas fa-shopping-cart"></i> Add to Cart</a>
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
<!-- end logo carousel -->

<!-- footer -->
<div class="footer-area">
    <div class="container">
        <div class="row">
            <div class="col-lg-3 col-md-6">
                <div class="footer-box about-widget">
                    <h2 class="widget-title">About us</h2>
                    <p>Ut enim ad minim veniam perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae.</p>
                </div>
            </div>
            <div class="col-lg-3 col-md-6">
                <div class="footer-box get-in-touch">
                    <h2 class="widget-title">Get in Touch</h2>
                    <ul>
                        <li>34/8, East Hukupara, Gifirtok, Sadan.</li>
                        <li>support@fruitkha.com</li>
                        <li>+00 111 222 3333</li>
                    </ul>
                </div>
            </div>
            <div class="col-lg-3 col-md-6">
                <div class="footer-box pages">
                    <h2 class="widget-title">Pages</h2>
                    <ul>
                        <li><a href="index.html">Home</a></li>
                        <li><a href="about.html">About</a></li>
                        <li><a href="services.html">Shop</a></li>
                        <li><a href="news.html">News</a></li>
                        <li><a href="contact.html">Contact</a></li>
                    </ul>
                </div>
            </div>
            <div class="col-lg-3 col-md-6">
                <div class="footer-box subscribe">
                    <h2 class="widget-title">Subscribe</h2>
                    <p>Subscribe to our mailing list to get the latest updates.</p>
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
                <p>Copyrights © 2019 - <a href="https://imransdesign.com/">Imran Hossain</a>,  All Rights Reserved.<br>
                    Distributed By - <a href="https://themewagon.com/">Themewagon</a>
                </p>
            </div>
            <div class="col-lg-6 text-right col-md-12">
                <div class="social-icons">
                    <ul>
                        <li><a href="#" target="_blank"><i class="fab fa-facebook-f"></i></a></li>
                        <li><a href="#" target="_blank"><i class="fab fa-twitter"></i></a></li>
                        <li><a href="#" target="_blank"><i class="fab fa-instagram"></i></a></li>
                        <li><a href="#" target="_blank"><i class="fab fa-linkedin"></i></a></li>
                        <li><a href="#" target="_blank"><i class="fab fa-dribbble"></i></a></li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- end copyright -->

<!-- jquery -->
<script src="assets/js/jquery-1.11.3.min.js"></script>
<!-- bootstrap -->
<script src="assets/bootstrap/js/bootstrap.min.js"></script>
<!-- count down -->
<script src="assets/js/jquery.countdown.js"></script>
<!-- isotope -->
<script src="assets/js/jquery.isotope-3.0.6.min.js"></script>
<!-- waypoints -->
<script src="assets/js/waypoints.js"></script>
<!-- owl carousel -->
<script src="assets/js/owl.carousel.min.js"></script>
<!-- magnific popup -->
<script src="assets/js/jquery.magnific-popup.min.js"></script>
<!-- mean menu -->
<script src="assets/js/jquery.meanmenu.min.js"></script>
<!-- sticker js -->
<script src="assets/js/sticker.js"></script>
<!-- main js -->
<script src="assets/js/main.js"></script>


</body></html>