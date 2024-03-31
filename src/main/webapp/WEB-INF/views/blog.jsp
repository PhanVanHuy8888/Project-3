<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Blog</title>
<link href="img/favicon.ico" rel="icon">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Heebo:wght@400;500;600&family=Inter:wght@600&family=Lobster+Two:wght@700&display=swap"
	rel="stylesheet">
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css"
	rel="stylesheet">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css"
	rel="stylesheet">
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/styles.css" rel="stylesheet" type="text/css">

<link href="css/style.css" rel="stylesheet" type="text/css">
</head>
<body>
	<%@include file="../static/header.jsp"%>

	<!-- Page Header End -->
	<div class="container-fluid p-0 mb-5">
			<div class="owl-carousel header-carousel position-relative">
				<div class="owl-carousel-item position-relative">
					<img class="img-fluid" src="img/slide4.jpg" alt="">
					<div
						class="position-absolute top-0 start-0 w-100 h-100 d-flex align-items-center"
						style="background: rgba(0, 0, 0, .2);">
						<div class="container py-5">

							<h1 class="display-2 text-white animated slideInDown mb-4">Blog</h1>
							<nav aria-label="breadcrumb animated slideInDown">
								<ol class="breadcrumb">
									<li class="breadcrumb-item"><a href="#">Trang chủ</a></li>
									<li class="breadcrumb-item text-white active"
										aria-current="page">Bài viết</li>
								</ol>
							</nav>
						</div>
					</div>
				</div>
			</div>
		</div>
	<!-- Page Header End -->
	<!-- Breaking News Start -->
	<div class="container-fluid mt-5 mb-3 pt-3">
		<div class="container">
			<div class="row align-items-center">
				<div class="col-12">
					<div class="d-flex justify-content-between">
						<div class="section-title border-right-0 mb-0"
							style="width: 180px;">
							<h4 class="m-0 text-uppercase font-weight-bold">Tranding</h4>
						</div>
						<div
							class="owl-carousel tranding-carousel position-relative d-inline-flex align-items-center  border border-left-0"
							style="width: calc(100% - 180px); padding-right: 100px;">
							<div class="text-truncate">
								<a class="text-secondary text-uppercase font-weight-semi-bold"
									href="">Lorem ipsum dolor sit amet elit. Proin interdum
									lacus eget ante tincidunt, sed faucibus nisl sodales</a>
							</div>
							<div class="text-truncate">
								<a class="text-secondary text-uppercase font-weight-semi-bold"
									href="">Lorem ipsum dolor sit amet elit. Proin interdum
									lacus eget ante tincidunt, sed faucibus nisl sodales</a>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Breaking News End -->


	<!-- News With Sidebar Start -->
	<div class="container-fluid">
		<div class="container">
			<div class="row">
				<div class="col-lg-8">
					<!-- News Detail Start -->
					<div class="position-relative mb-3">
						<img class="img-fluid w-100" src="img/news-700x435-1.jpg"
							style="object-fit: cover;">
						<div class=" border border-top-0 p-4">
							<div class="mb-3">
								<a
									class="badge badge-primary text-uppercase font-weight-semi-bold p-2 mr-2"
									href="">Business</a> <a class="text-body" href="">Jan 01,
									2045</a>
							</div>
							<h1 class="mb-3 text-secondary text-uppercase font-weight-bold">Lorem
								ipsum dolor sit amet elit vitae porta diam...</h1>
							<p>Sadipscing labore amet rebum est et justo gubergren. Et
								eirmod ipsum sit diam ut magna lorem. Nonumy vero labore lorem
								sanctus rebum et lorem magna kasd, stet amet magna accusam
								consetetur eirmod. Kasd accusam sit ipsum sadipscing et at at
								sanctus et. Ipsum sit gubergren dolores et, consetetur justo
								invidunt at et aliquyam ut et vero clita. Diam sea sea no sed
								dolores diam nonumy, gubergren sit stet no diam kasd vero.</p>
							<p>Voluptua est takimata stet invidunt sed rebum nonumy stet,
								clita aliquyam dolores vero stet consetetur elitr takimata rebum
								sanctus. Sit sed accusam stet sit nonumy kasd diam dolores,
								sanctus lorem kasd duo dolor dolor vero sit et. Labore ipsum duo
								sanctus amet eos et. Consetetur no sed et aliquyam ipsum justo
								et, clita lorem sit vero amet amet est dolor elitr, stet et no
								diam sit. Dolor erat justo dolore sit invidunt.</p>
							<h3 class="text-uppercase font-weight-bold mb-3">Lorem ipsum
								dolor sit amet elit</h3>
							<img class="img-fluid w-50 float-left mr-4 mb-2"
								src="img/news-800x500-1.jpg">
							<p>Diam dolor est labore duo invidunt ipsum clita et, sed et
								lorem voluptua tempor invidunt at est sanctus sanctus. Clita
								dolores sit kasd diam takimata justo diam lorem sed. Magna amet
								sed rebum eos. Clita no magna no dolor erat diam tempor rebum
								consetetur, sanctus labore sed nonumy diam lorem amet eirmod. No
								at tempor sea diam kasd, takimata ea nonumy elitr sadipscing
								gubergren erat. Gubergren at lorem invidunt sadipscing rebum sit
								amet ut ut, voluptua diam dolores at sadipscing stet. Clita
								dolor amet dolor ipsum vero ea ea eos. Invidunt sed diam dolores
								takimata dolor dolore dolore sit. Sit ipsum erat amet lorem et,
								magna sea at sed et eos. Accusam eirmod kasd lorem clita sanctus
								ut consetetur et. Et duo tempor sea kasd clita ipsum et.</p>
							<h5 class="text-uppercase font-weight-bold mb-3">Lorem ipsum
								dolor sit amet elit</h5>
							<img class="img-fluid w-50 float-right mr-4 mb-2"
								src="img/news-800x500-2.jpg">
							<p>Diam dolor est labore duo invidunt ipsum clita et, sed et
								lorem voluptua tempor invidunt at est sanctus sanctus. Clita
								dolores sit kasd diam takimata justo diam lorem sed. Magna amet
								sed rebum eos. Clita no magna no dolor erat diam tempor rebum
								consetetur, sanctus labore sed nonumy diam lorem amet eirmod. No
								at tempor sea diam kasd, takimata ea nonumy elitr sadipscing
								gubergren erat. Gubergren at lorem invidunt sadipscing rebum sit
								amet ut ut, voluptua diam dolores at sadipscing stet. Clita
								dolor amet dolor ipsum vero ea ea eos. Invidunt sed diam dolores
								takimata dolor dolore dolore sit. Sit ipsum erat amet lorem et,
								magna sea at sed et eos. Accusam eirmod kasd lorem clita sanctus
								ut consetetur et. Et duo tempor sea kasd clita ipsum et.
								Takimata kasd diam justo est eos erat aliquyam et ut.</p>
						</div>
						
					</div>
					<!-- News Detail End -->


				</div>
				<div class="col-lg-4">
					<!-- Ads Start -->
					<div class="mb-3">
						<div class="section-title mb-0">
							<h4 class="m-0 text-uppercase font-weight-bold">Advertisement</h4>
						</div>
						<div class=" text-center border border-top-0 p-3">
							<a href=""><img class="img-fluid"
								src="img/news-800x500-2.jpg" alt=""></a>
						</div>
					</div>
					<!-- Ads End -->

					<!-- Popular News Start -->
					<div class="mb-3">
						<div class="section-title mb-0">
							<h4 class="m-0 text-uppercase font-weight-bold">Tranding
								News</h4>
						</div>
						<div class=" border border-top-0 p-3">
							<div class="d-flex align-items-center  mb-3"
								style="height: 110px;">
								<img class="img-fluid" src="img/news-110x110-1.jpg" alt="">
								<div
									class="w-100 h-100 px-3 d-flex flex-column justify-content-center border border-left-0">
									<div class="mb-2">
										<a
											class="badge badge-primary text-uppercase font-weight-semi-bold p-1 mr-2"
											href="">Business</a> <a class="text-body" href=""><small>Jan
												01, 2045</small></a>
									</div>
									<a
										class="h6 m-0 text-secondary text-uppercase font-weight-bold"
										href="">Lorem ipsum dolor sit amet elit...</a>
								</div>
							</div>
							<div class="d-flex align-items-center  mb-3"
								style="height: 110px;">
								<img class="img-fluid" src="img/news-110x110-2.jpg" alt="">
								<div
									class="w-100 h-100 px-3 d-flex flex-column justify-content-center border border-left-0">
									<div class="mb-2">
										<a
											class="badge badge-primary text-uppercase font-weight-semi-bold p-1 mr-2"
											href="">Business</a> <a class="text-body" href=""><small>Jan
												01, 2045</small></a>
									</div>
									<a
										class="h6 m-0 text-secondary text-uppercase font-weight-bold"
										href="">Lorem ipsum dolor sit amet elit...</a>
								</div>
							</div>
							<div class="d-flex align-items-center  mb-3"
								style="height: 110px;">
								<img class="img-fluid" src="img/news-110x110-3.jpg" alt="">
								<div
									class="w-100 h-100 px-3 d-flex flex-column justify-content-center border border-left-0">
									<div class="mb-2">
										<a
											class="badge badge-primary text-uppercase font-weight-semi-bold p-1 mr-2"
											href="">Business</a> <a class="text-body" href=""><small>Jan
												01, 2045</small></a>
									</div>
									<a
										class="h6 m-0 text-secondary text-uppercase font-weight-bold"
										href="">Lorem ipsum dolor sit amet elit...</a>
								</div>
							</div>
							<div class="d-flex align-items-center  mb-3"
								style="height: 110px;">
								<img class="img-fluid" src="img/news-110x110-4.jpg" alt="">
								<div
									class="w-100 h-100 px-3 d-flex flex-column justify-content-center border border-left-0">
									<div class="mb-2">
										<a
											class="badge badge-primary text-uppercase font-weight-semi-bold p-1 mr-2"
											href="">Business</a> <a class="text-body" href=""><small>Jan
												01, 2045</small></a>
									</div>
									<a
										class="h6 m-0 text-secondary text-uppercase font-weight-bold"
										href="">Lorem ipsum dolor sit amet elit...</a>
								</div>
							</div>
							<div class="d-flex align-items-center  mb-3"
								style="height: 110px;">
								<img class="img-fluid" src="img/news-110x110-5.jpg" alt="">
								<div
									class="w-100 h-100 px-3 d-flex flex-column justify-content-center border border-left-0">
									<div class="mb-2">
										<a
											class="badge badge-primary text-uppercase font-weight-semi-bold p-1 mr-2"
											href="">Business</a> <a class="text-body" href=""><small>Jan
												01, 2045</small></a>
									</div>
									<a
										class="h6 m-0 text-secondary text-uppercase font-weight-bold"
										href="">Lorem ipsum dolor sit amet elit...</a>
								</div>
							</div>
						</div>
					</div>
					<!-- Popular News End -->
				</div>
			</div>
		</div>
		<!-- Footer Start -->
		<%@include file="../static/footer.jsp"%>
		<!-- Footer End -->
</body>
</html>