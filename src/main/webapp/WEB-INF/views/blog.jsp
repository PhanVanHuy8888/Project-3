<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
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
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css"
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
									href="">${post.title}</a>
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

					<c:forEach items="${blogList}" var="blog">
						<div class="position-relative mb-3">
							<img class="img-fluid w-100" src="img/blog-3.jpg"
								style="object-fit: cover;">
							<div class=" border border-top-0 p-4">
								<h2 class="mb-3 text-secondary text-uppercase font-weight-bold">${blog.title }</h1>
									<img class="img-fluid w-50 float-left mr-4 mb-2"
										src="img/${blog.image }">
									<p>${blog.description}</p>
							</div>

						</div>
					</c:forEach>

					<!-- News Detail End -->


				</div>
				<div class="col-lg-4">
					<!-- Ads Start -->
					<div class="mb-3">
						<div class="section-title mb-0">
							<h4 class="m-0 text-uppercase font-weight-bold">Quảng cáo</h4>
						</div>
						<div class=" text-center border border-top-0 p-3">
							<a href=""><img class="img-fluid" src="img/blog-2.jpg" alt=""></a>
						</div>
					</div>
					<!-- Ads End -->

					<!-- Popular News Start -->

					<div class="mb-3">
						<div class="section-title mb-0">
							<h4 class="m-0 text-uppercase font-weight-bold">Tin hot</h4>
						</div>
						<c:forEach items="${postList}" var="post">
							<div class=" border border-top-0 p-3">
								<div class="d-flex align-items-center  mb-3"
									style="height: 110px;">
									<img class="img-fluid" src="img/news-110x110-2.jpg" alt="">
									<div
										class="w-100 h-100 px-3 d-flex flex-column justify-content-center border border-left-0">
										<a
											style="overflow: hidden; text-overflow: ellipsis;"
											class="h6 m-0 text-secondary text-uppercase font-weight-bold"
											href="postDetail?id=${post.id}">${post.title}</a>
									</div>
								</div>

							</div>
						</c:forEach>
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