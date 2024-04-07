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


<link href="css/style.css" rel="stylesheet" type="text/css">

</head>
<body>
	<input type="hidden" name="uid" value="${user.id }">
	<div class="container-xxl bg-white p-0">
		<%@include file="../static/header.jsp"%>
		<div class="container-fluid p-0 mb-5">
			<div class="owl-carousel header-carousel position-relative">
				<div class="owl-carousel-item position-relative">
					<img class="img-fluid" src="img/slide1.jpg" alt="">
					
				</div>
			</div>
		</div>



	
					<div class="row g-4">
						<c:forEach items="${fruitList}" var="fruit">
							<div class="col-lg-4 col-md-6 wow fadeInUp" data-wow-delay="0.3s">
								<div class="classes-item">
									<div class="bg-light rounded w-75 mx-auto p-3"
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
					</div>
		


		<!-- Footer Start -->
		<%@include file="../static/footer.jsp"%>
		<!-- Footer End -->
	</div>
</body>
</html>