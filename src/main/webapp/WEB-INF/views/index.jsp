<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fruit</title>
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
<link href="js/lib/animate/animate.min.css" rel="stylesheet">
<link href="js/lib/owlcarousel/assets/owl.carousel.min.css"
	rel="stylesheet">


<link href="css/style.css" rel="stylesheet" type="text/css">

</head>
<body>
	<div class="container-xxl bg-white p-0">
		<!-- nav -->
		<%@include file="../static/header.jsp"%>

		<!-- slide -->
		<div class="container-fluid p-0 mb-5">
			<div class="owl-carousel header-carousel position-relative">
				<div class="owl-carousel-item position-relative">
					<img class="img-fluid" src="img/1.jpg" alt="">
					<div
						class="position-absolute top-0 start-0 w-100 h-100 d-flex align-items-center"
						style="background: rgba(0, 0, 0, .2);">
						<div class="container">
							<div class="row justify-content-start">
								<div class="col-10 col-lg-8">
									<h1 class="display-2 text-white animated slideInDown mb-4">Fruit</h1>
									<p class="fs-5 fw-medium text-white mb-4 pb-2">Chúng tôi
										mang đến nguồn thực phẩm tốt, sạch, phong phú và nhiều dinh
										dưỡng, thân thiện với môi trường nhằm chia sẻ những lo lắng
										của khách hàng khi chọn mua thực phẩm hàng ngày cho gia đình.</p>
									<a href=""
										class="btn btn-primary rounded-pill py-sm-3 px-sm-5 me-3 animated slideInLeft">Xem
										thêm</a> <a href=""
										class="btn btn-dark rounded-pill py-sm-3 px-sm-5 animated slideInRight">Về
										chúng tôi</a>
								</div>
							</div>
						</div>
					</div>
				</div>

			</div>
		</div>

		<div class="container-xxl ">
			<div class="container">
				<div class="text-center mx-auto wow fadeInUp" data-wow-delay="0.1s"
					style="max-width: 600px;">
					<h1 class="mb-3">Các loại trái cây</h1>
				</div>
			</div>
		</div>

		<div class="container-xxl py-5">
			<div class="container">
				<div class="bg-light rounded">
					<div class="row g-0">
						<div class="col-lg-6 order-lg-2 wow fadeIn" data-wow-delay="0.1s"
							style="min-height: 400px;">
							<div class="position-relative h-100">
								<img class="position-absolute w-100 h-100 rounded"
									src="img/5.jpg" style="object-fit: cover;">
							</div>
						</div>
						<div class="col-lg-6 order-lg-1 wow fadeIn" data-wow-delay="0.5s">
							<div class="h-100 d-flex flex-column justify-content-center p-5">
								<h1 class="mb-4">Trái cây Việt Nam</h1>
								<p class="mb-4">Ngành công nghiệp trái cây của Việt Nam đang
									phát triển mạnh mẽ, với sự chú trọng vào chất lượng, an toàn
									sinh học và tiêu chuẩn xuất khẩu để tạo dựng uy tín trên thị
									trường quốc tế.</p>
								<div class="row g-4 align-items-center">
									<div class="col-sm-6">
										<a class="btn btn-primary rounded-pill py-3 px-5" href="">Chi
											tiết</a>
									</div>

								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>


		<div class="container-xxl py-5">
			<div class="container">
				<div class="bg-light rounded">
					<div class="row g-0">
						<div class="col-lg-6 wow fadeIn" data-wow-delay="0.1s"
							style="min-height: 400px;">
							<div class="position-relative h-100">
								<img class="position-absolute w-100 h-100 rounded"
									src="img/4.jpg" style="object-fit: cover;">
							</div>
						</div>
						<div class="col-lg-6 wow fadeIn" data-wow-delay="0.5s">
							<div class="h-100 d-flex flex-column justify-content-center p-5">
								<h1 class="mb-4">Trái cây Nhập khẩu</h1>
								<p class="mb-4">Trái cây nhập khẩu thường được chọn lựa từ
									các quốc gia có điều kiện khí hậu và đất đai thuận lợi, mang
									lại sự đa dạng về loại hình và hương vị cho người tiêu dùng
									trên toàn thế giới.</p>
								<a class="btn btn-primary py-3 px-5" href="">Chi tiết<i
									class="fa fa-arrow-right ms-2"></i></a>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="container-xxl py-5">
			<div class="container">
				<div class="bg-light rounded">
					<div class="row g-0">
						<div class="col-lg-6 order-lg-2 wow fadeIn" data-wow-delay="0.1s"
							style="min-height: 400px;">
							<div class="position-relative h-100">
								<img class="position-absolute w-100 h-100 rounded"
									src="img/3.jpg" style="object-fit: cover;">
							</div>
						</div>
						<div class="col-lg-6 order-lg-1 wow fadeIn" data-wow-delay="0.5s">
							<div class="h-100 d-flex flex-column justify-content-center p-5">
								<h1 class="mb-4">Trái cây Cắt sẵn</h1>
								<p class="mb-4">Trái cây cắt sẵn không chỉ tiết kiệm thời
									gian chuẩn bị mà còn giúp người tiêu dùng tiếp cận dễ dàng hơn
									với các loại trái cây tươi ngon, đặc biệt là trong các mùa
									không có hoặc ít có trái cây.</p>
								<div class="row g-4 align-items-center">
									<div class="col-sm-6">
										<a class="btn btn-primary rounded-pill py-3 px-5" href="">Chi
											tiết</a>
									</div>

								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>


		<div class="container-xxl">
			<div class="container">
				<div class="text-center mx-auto mb-5 wow fadeInUp"
					data-wow-delay="0.1s" style="max-width: 600px;">
					<h1 class="mb-3">Trái cây phổ biến</h1>
				</div>
				<div class="row g-4">
					<form action="${pageContext.request.contextPath}/cart"
						method="POST" class="row g-4">
						<input type="hidden" name="uid" value="${user.id}"> <input
							type="hidden" name="quantity" value="1"> <input
							type="hidden" name="id" value="${fruit.fruitId}">
						<c:forEach items="${fruitList}" var="fruit">
							<div class="col-lg-4 col-md-6 col-sm-6 col-xs-12 wow fadeInUp"
								data-wow-delay="0.3s">
								<div class="classes-item">
									<div class="bg-light rounded mx-auto p-3"
										style="background-color: #cfe2f3;">
										<img class="img-fluid rounded" src="img/${fruit.photo}"
											alt="Your Image" style="width: 100%; height: auto;">
									</div>
									<div class="bg-light rounded p-4 pt-5 mt-n5"
										style="background-color: #cfe2f3;">
										<a class="d-block text-center h3 mt-3 mb-4" href="">${fruit.fruitName}</a>
										<div class="d-flex align-items-center justify-content-center">
											<span class="text-black rounded-pill font-weight-bold"
												href="">Xuất xứ: ${fruit.origin}</span>
										</div>
										<div
											class="d-flex align-items-center justify-content-center mb-4">
											<span
												class="text-black rounded-pill py-2 px-3 font-weight-bold">
												<fmt:formatNumber pattern="#,##0 đ" value="${fruit.price}" />
											</span>
										</div>
										<div class="row g-1">
											<div class="col-6 text-center">
												<a href="viewFruit?id=${fruit.fruitId}"
													class="btn btn-success">Xem Chi Tiết</a>
											</div>
											<div class="col-6 text-center">
												<a href="viewFruit?id=${fruit.fruitId}"
													class="btn btn-primary">Thêm vào giỏ</a>
											</div>
										</div>
									</div>
								</div>
							</div>
						</c:forEach>
					</form>
				</div>

			</div>
		</div>

		<!-- Classes End -->

		<!-- Footer Start -->
		<%@include file="../static/footer.jsp"%>
		<!-- Footer End -->


		<!-- Back to Top -->
		<a href="#" class="btn btn-lg btn-primary btn-lg-square back-to-top"><i
			class="bi bi-arrow-up"></i></a>
	</div>
	<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
	<script src="js/lib/wow/wow.min.js"></script>
	<script src="js/lib/easing/easing.min.js"></script>
	<script src="js/lib/waypoints/waypoints.min.js"></script>
	<script src="js/lib/owlcarousel/owl.carousel.min.js"></script>

	<!-- Template Javascript -->
	<script src="js/main.js"></script>



</body>
</html>