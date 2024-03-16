<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fruit</title>
<link href="../img/favicon.ico" rel="icon">
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
<link href="../css/bootstrap.min.css" rel="stylesheet">


<link href="../css/style.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div class="container-xxl bg-white p-0">
		<!-- nav -->
		<%@include file="../static/header.jsp" %>
		
		<!-- slide -->
		<div class="container-fluid p-0 mb-5">
			<div class="owl-carousel header-carousel position-relative">
				<div class="owl-carousel-item position-relative">
					<img class="img-fluid" src="../img/1.jpg" alt="">
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
									src="../img/5.jpg" style="object-fit: cover;">
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
									src="../img/4.jpg" style="object-fit: cover;">
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
									src="../img/3.jpg" style="object-fit: cover;">
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
					<div class="col-lg-4 col-md-6 wow fadeInUp" data-wow-delay="0.1s">
						<div class="classes-item">
							<div class="bg-light rounded-circle w-75 mx-auto p-3">
								<img class="img-fluid rounded-circle" src="../img/classes-1.jpg"
									alt="">
							</div>
							<div class="bg-light rounded p-4 pt-5 mt-n5">
								<a class="d-block text-center h3 mt-3 mb-4" href="">Art &
									Drawing</a>
								<div
									class="d-flex align-items-center justify-content-between mb-4">
									<div class="d-flex align-items-center">
										<img class="rounded-circle flex-shrink-0"
											src="../img/user.jpg" alt=""
											style="width: 45px; height: 45px;">
										<div class="ms-3">
											<h6 class="text-primary mb-1">Jhon Doe</h6>
											<small>Teacher</small>
										</div>
									</div>
									<span class="bg-primary text-white rounded-pill py-2 px-3"
										href="">$99</span>
								</div>
								<div class="row g-1">
									<div class="col-4">
										<div class="border-top border-3 border-primary pt-2">
											<h6 class="text-primary mb-1">Age:</h6>
											<small>3-5 Years</small>
										</div>
									</div>
									<div class="col-4">
										<div class="border-top border-3 border-success pt-2">
											<h6 class="text-success mb-1">Time:</h6>
											<small>9-10 AM</small>
										</div>
									</div>
									<div class="col-4">
										<div class="border-top border-3 border-warning pt-2">
											<h6 class="text-warning mb-1">Capacity:</h6>
											<small>30 Kids</small>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="col-lg-4 col-md-6 wow fadeInUp" data-wow-delay="0.3s">
						<div class="classes-item">
							<div class="bg-light rounded-circle w-75 mx-auto p-3">
								<img class="img-fluid rounded-circle" src="../img/classes-2.jpg"
									alt="">
							</div>
							<div class="bg-light rounded p-4 pt-5 mt-n5">
								<a class="d-block text-center h3 mt-3 mb-4" href="">Color
									Management</a>
								<div
									class="d-flex align-items-center justify-content-between mb-4">
									<div class="d-flex align-items-center">
										<img class="rounded-circle flex-shrink-0"
											src="../img/user.jpg" alt=""
											style="width: 45px; height: 45px;">
										<div class="ms-3">
											<h6 class="text-primary mb-1">Jhon Doe</h6>
											<small>Teacher</small>
										</div>
									</div>
									<span class="bg-primary text-white rounded-pill py-2 px-3"
										href="">$99</span>
								</div>
								<div class="row g-1">
									<div class="col-4">
										<div class="border-top border-3 border-primary pt-2">
											<h6 class="text-primary mb-1">Age:</h6>
											<small>3-5 Years</small>
										</div>
									</div>
									<div class="col-4">
										<div class="border-top border-3 border-success pt-2">
											<h6 class="text-success mb-1">Time:</h6>
											<small>9-10 AM</small>
										</div>
									</div>
									<div class="col-4">
										<div class="border-top border-3 border-warning pt-2">
											<h6 class="text-warning mb-1">Capacity:</h6>
											<small>30 Kids</small>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="col-lg-4 col-md-6 wow fadeInUp" data-wow-delay="0.5s">
						<div class="classes-item">
							<div class="bg-light rounded-circle w-75 mx-auto p-3">
								<img class="img-fluid rounded-circle" src="../img/classes-3.jpg"
									alt="">
							</div>
							<div class="bg-light rounded p-4 pt-5 mt-n5">
								<a class="d-block text-center h3 mt-3 mb-4" href="">Athletic
									& Dance</a>
								<div
									class="d-flex align-items-center justify-content-between mb-4">
									<div class="d-flex align-items-center">
										<img class="rounded-circle flex-shrink-0"
											src="../img/user.jpg" alt=""
											style="width: 45px; height: 45px;">
										<div class="ms-3">
											<h6 class="text-primary mb-1">Jhon Doe</h6>
											<small>Teacher</small>
										</div>
									</div>
									<span class="bg-primary text-white rounded-pill py-2 px-3"
										href="">$99</span>
								</div>
								<div class="row g-1">
									<div class="col-4">
										<div class="border-top border-3 border-primary pt-2">
											<h6 class="text-primary mb-1">Age:</h6>
											<small>3-5 Years</small>
										</div>
									</div>
									<div class="col-4">
										<div class="border-top border-3 border-success pt-2">
											<h6 class="text-success mb-1">Time:</h6>
											<small>9-10 AM</small>
										</div>
									</div>
									<div class="col-4">
										<div class="border-top border-3 border-warning pt-2">
											<h6 class="text-warning mb-1">Capacity:</h6>
											<small>30 Kids</small>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="col-lg-4 col-md-6 wow fadeInUp" data-wow-delay="0.1s">
						<div class="classes-item">
							<div class="bg-light rounded-circle w-75 mx-auto p-3">
								<img class="img-fluid rounded-circle" src="../img/classes-4.jpg"
									alt="">
							</div>
							<div class="bg-light rounded p-4 pt-5 mt-n5">
								<a class="d-block text-center h3 mt-3 mb-4" href="">Language
									& Speaking</a>
								<div
									class="d-flex align-items-center justify-content-between mb-4">
									<div class="d-flex align-items-center">
										<img class="rounded-circle flex-shrink-0"
											src="../img/user.jpg" alt=""
											style="width: 45px; height: 45px;">
										<div class="ms-3">
											<h6 class="text-primary mb-1">Jhon Doe</h6>
											<small>Teacher</small>
										</div>
									</div>
									<span class="bg-primary text-white rounded-pill py-2 px-3"
										href="">$99</span>
								</div>
								<div class="row g-1">
									<div class="col-4">
										<div class="border-top border-3 border-primary pt-2">
											<h6 class="text-primary mb-1">Age:</h6>
											<small>3-5 Years</small>
										</div>
									</div>
									<div class="col-4">
										<div class="border-top border-3 border-success pt-2">
											<h6 class="text-success mb-1">Time:</h6>
											<small>9-10 AM</small>
										</div>
									</div>
									<div class="col-4">
										<div class="border-top border-3 border-warning pt-2">
											<h6 class="text-warning mb-1">Capacity:</h6>
											<small>30 Kids</small>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="col-lg-4 col-md-6 wow fadeInUp" data-wow-delay="0.3s">
						<div class="classes-item">
							<div class="bg-light rounded-circle w-75 mx-auto p-3">
								<img class="img-fluid rounded-circle" src="../img/classes-5.jpg"
									alt="">
							</div>
							<div class="bg-light rounded p-4 pt-5 mt-n5">
								<a class="d-block text-center h3 mt-3 mb-4" href="">Religion
									& History</a>
								<div
									class="d-flex align-items-center justify-content-between mb-4">
									<div class="d-flex align-items-center">
										<img class="rounded-circle flex-shrink-0"
											src="../img/user.jpg" alt=""
											style="width: 45px; height: 45px;">
										<div class="ms-3">
											<h6 class="text-primary mb-1">Jhon Doe</h6>
											<small>Teacher</small>
										</div>
									</div>
									<span class="bg-primary text-white rounded-pill py-2 px-3"
										href="">$99</span>
								</div>
								<div class="row g-1">
									<div class="col-4">
										<div class="border-top border-3 border-primary pt-2">
											<h6 class="text-primary mb-1">Age:</h6>
											<small>3-5 Years</small>
										</div>
									</div>
									<div class="col-4">
										<div class="border-top border-3 border-success pt-2">
											<h6 class="text-success mb-1">Time:</h6>
											<small>9-10 AM</small>
										</div>
									</div>
									<div class="col-4">
										<div class="border-top border-3 border-warning pt-2">
											<h6 class="text-warning mb-1">Capacity:</h6>
											<small>30 Kids</small>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="col-lg-4 col-md-6 wow fadeInUp" data-wow-delay="0.5s">
						<div class="classes-item">
							<div class="bg-light rounded-circle w-75 mx-auto p-3">
								<img class="img-fluid rounded-circle" src="../img/classes-6.jpg"
									alt="">
							</div>
							<div class="bg-light rounded p-4 pt-5 mt-n5">
								<a class="d-block text-center h3 mt-3 mb-4" href="">General
									Knowledge</a>
								<div
									class="d-flex align-items-center justify-content-between mb-4">
									<div class="d-flex align-items-center">
										<img class="rounded-circle flex-shrink-0"
											src="../img/user.jpg" alt=""
											style="width: 45px; height: 45px;">
										<div class="ms-3">
											<h6 class="text-primary mb-1">Jhon Doe</h6>
											<small>Teacher</small>
										</div>
									</div>
									<span class="bg-primary text-white rounded-pill py-2 px-3"
										href="">$99</span>
								</div>
								<div class="row g-1">
									<div class="col-4">
										<div class="border-top border-3 border-primary pt-2">
											<h6 class="text-primary mb-1">Age:</h6>
											<small>3-5 Years</small>
										</div>
									</div>
									<div class="col-4">
										<div class="border-top border-3 border-success pt-2">
											<h6 class="text-success mb-1">Time:</h6>
											<small>9-10 AM</small>
										</div>
									</div>
									<div class="col-4">
										<div class="border-top border-3 border-warning pt-2">
											<h6 class="text-warning mb-1">Capacity:</h6>
											<small>30 Kids</small>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
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

</body>
</html>