
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Liên lạc</title>
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


<link href="css/style.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div class="container-xxl bg-white p-0">

		<%@include file="../static/header.jsp"%>



		<div class="container-fluid p-0 mb-5">
			<div class="owl-carousel header-carousel position-relative">
				<div class="owl-carousel-item position-relative">
					<img class="img-fluid" src="img/slide2.jpg" alt="">
					<div
						class="position-absolute top-0 start-0 w-100 h-100 d-flex align-items-center"
						style="background: rgba(0, 0, 0, .2);">
						<div class="container py-5">

							<h1 class="display-2 text-white animated slideInDown mb-4">Liên
								hệ</h1>
							<nav aria-label="breadcrumb animated slideInDown">
								<ol class="breadcrumb">
									<li class="breadcrumb-item"><a href="#">Trang chủ</a></li>
									<li class="breadcrumb-item text-white active"
										aria-current="page">Liên hệ</li>
								</ol>
							</nav>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- Page Header End -->


		<!-- Contact Start -->
		<div class="container-xxl py-5">
			<div class="container">
				<div class="text-center mx-auto mb-5 wow fadeInUp"
					data-wow-delay="0.1s" style="max-width: 600px;">
					<h1 class="mb-3">Liên lạc</h1>
					<p>Điền thông tin để chúng tôi liên lạc với bạn sớm nhất.</p>
				</div>
				<div class="row g-4 mb-5">
					<div class="col-md-6 col-lg-4 text-center wow fadeInUp"
						data-wow-delay="0.1s">
						<div
							class="bg-light rounded-circle d-inline-flex align-items-center justify-content-center mb-4"
							style="width: 75px; height: 75px;">
							<i class="fa fa-map-marker-alt fa-2x text-primary"></i>
						</div>
						<h6>Đan Phượng, Hà Nội</h6>
					</div>
					<div class="col-md-6 col-lg-4 text-center wow fadeInUp"
						data-wow-delay="0.3s">
						<div
							class="bg-light rounded-circle d-inline-flex align-items-center justify-content-center mb-4"
							style="width: 75px; height: 75px;">
							<i class="fa fa-envelope-open fa-2x text-primary"></i>
						</div>
						<h6>hphan0859@gmail.com</h6>
					</div>
					<div class="col-md-6 col-lg-4 text-center wow fadeInUp"
						data-wow-delay="0.5s">
						<div
							class="bg-light rounded-circle d-inline-flex align-items-center justify-content-center mb-4"
							style="width: 75px; height: 75px;">
							<i class="fa fa-phone-alt fa-2x text-primary"></i>
						</div>
						<h6>0777 137 220</h6>
					</div>
				</div>
				<div class="bg-light rounded">
					<div class="row g-0">
						<div class="col-lg-6 wow fadeIn" data-wow-delay="0.1s">
							<div class="h-100 d-flex flex-column justify-content-center p-5">
								<%
								if (request.getParameter("success") != null) {
								%>
								<div class="alert alert-success" role="alert">Gửi thông
									tin thành công!</div>
								<%
								} else if (request.getParameter("fail") != null) {
								%>
								<div class="alert alert-danger" role="alert">Gửi thông tin
									thất bại!! Vui lòng kiểm tra lại</div>
								<%
								}
								%>
								<form action="contact" method="POST">
									<div class="row g-3">
										<div class="col-sm-6">
											<div class="form-floating">
												<input type="text" class="form-control border-0"
													placeholder="Your Name" name="iname"><label>Your
													Name</label>
											</div>
										</div>
										<div class="col-sm-6">
											<div class="form-floating">
												<input type="email" class="form-control border-0"
													name="email" placeholder="Your Email"> <label
													for="email">Your Email</label>
											</div>
										</div>
										<div class="col-12">
											<div class="form-floating">
												<textarea class="form-control border-0"
													placeholder="Leave a message here" name="message"
													style="height: 100px"></textarea>
												<label for="message">Message</label>
											</div>
										</div>
										<div class="col-12">
											<button class="btn btn-primary w-100 py-3" type="submit">Send
												Message</button>
										</div>
									</div>
								</form>
							</div>
						</div>
						<div class="col-lg-6 wow fadeIn" data-wow-delay="0.5s"
							style="min-height: 400px;">
							<div class="position-relative h-100">
								<iframe class="position-relative rounded w-100 h-100"
									src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d59555.35918977367!2d105.6565613184845!3d21.104194337507387!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3134561ad82ec115%3A0x20f4b80b82f13c4d!2zVGjGsOG7o25nIE3hu5csIMSQYW4gUGjGsOG7o25nLCBIw6AgTuG7mWksIFZp4buHdCBOYW0!5e0!3m2!1svi!2s!4v1710939997625!5m2!1svi!2s"
									frameborder="0" style="min-height: 400px; border: 0;"
									allowfullscreen="" aria-hidden="false" tabindex="0"></iframe>
							</div>

						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- Contact End -->

		<!-- Footer Start -->
		<%@include file="../static/footer.jsp"%>
		<!-- Footer End -->


		<!-- Back to Top -->
		<a href="#" class="btn btn-lg btn-primary btn-lg-square back-to-top"><i
			class="bi bi-arrow-up"></i></a>
	</div>
</body>
</html>