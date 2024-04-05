<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html lang="vi">
<head>
<meta charset="UTF-8">
<title>Chi tiết</title>
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
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css"
	rel="stylesheet">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css"
	rel="stylesheet">
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="js/lib/animate/animate.min.css" rel="stylesheet">
<link href="js/lib/owlcarousel/assets/owl.carousel.min.css"
	rel="stylesheet">

<link href="css/class.css" rel="stylesheet" type="text/css">

<link href="css/style.css" rel="stylesheet" type="text/css">

</head>
<body>

	<%@include file="../static/header.jsp"%>
	<div class="single-product mt-150 mb-150">
		<form action="${pageContext.request.contextPath}/viewFruit"
			method="POST">
			<input type="hidden" name="id" value="${fruit.fruitId }"> <input
				type="hidden" name="uid" value="${user.id }">
			<div class="container">
				<div class="row">
					<div class="col-md-5">
						<div class="single-product-img">
							<img style="width: 450px;" src="img/${fruit.photo}" alt="Ảnh">
						</div>
					</div>
					<div class="col-md-7">
						<div class="single-product-content">

							<h3>${fruit.fruitName}</h3>
							<p class="single-product-pricing">
								<span>${fruit.price}đ</span>
							</p>
							<h3>Xuất xứ: ${fruit.origin }</h3>
							<p>${fruit.description }</p>
							<div class="single-product-form">
								<input name="quantity" type="number" placeholder="1">
								<c:if test="${not empty user }">
									<a href="cart?id=${fruit.fruitId}&uid=${user.id}"
										class="cart-btn"><i class="fas fa-shopping-cart"></i> Thêm
										vào giỏ hàng</a>
								</c:if>
								<c:if test="${empty user }">
									<a href="login" class="cart-btn"><i
										class="fas fa-shopping-cart"></i> Thêm vào giỏ hàng</a>
								</c:if>
								<p>
									<strong>Loại trái cây: </strong>${categoryFruitName}
								</p>
							</div>
							<h4>Chia sẻ:</h4>
							<ul class="product-share">
								<li><a href="#"><i class="fab fa-facebook-f"></i></a></li>
								<li><a href="#"><i class="fab fa-twitter"></i></a></li>
								<li><a href="#"><i class="fab fa-google-plus-g"></i></a></li>
								<li><a href="#"><i class="fab fa-linkedin"></i></a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</form>
	</div>
	<%@include file="../static/footer.jsp"%>
</body>
</html>
