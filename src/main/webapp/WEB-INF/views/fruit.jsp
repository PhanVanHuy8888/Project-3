<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css"
	rel="stylesheet">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css"
	rel="stylesheet">
<link href="css/bootstrap.min.css" rel="stylesheet">


<link href="css/style.css" rel="stylesheet" type="text/css">

<style>
#toast {
	min-width: 300px;
	position: fixed;
	bottom: 30px;
	left: 50%;
	margin-left: -125px;
	background: #333333;
	padding: 10px;
	color: white;
	text-align: center;
	z-index: 1;
	font-size: 18px;
	visibility: hidden;
	box-shadow: 0px 0px 100px #000;
	border-radius: 15px;
}

#toast.display {
	visibility: visible;
	animation: fadeIn 0.5s, fadeOut 0.5s 2.5s;
}

@
keyframes fadeIn {from { bottom:0;
	opacity: 0;
}

to {
	bottom: 30px;
	opacity: 1;
}

}
@
keyframes fadeOut {from { bottom:30px;
	opacity: 1;
}

to {
	bottom: 0;
	opacity: 0;
}
}
</style>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript">
	function showToast(content) {
		$('#toast').addClass("display");
		$('#toast').html(content);
		setTimeout(function() {
			$("#toast").removeClass("display");
		}, 2000);
	}
</script>

</head>
<body>
	<div id="toast"></div>
	<c:if test="${not empty addCart}">
		<script type="text/javascript">
			showToast("${addCart}");
		</script>
	</c:if>
	<input type="hidden" name="uid" value="${user.id }">
	<div class="container-xxl bg-white p-0">
		<%@include file="../static/header.jsp"%>
		<div class="container-fluid p-0 mb-5">
			<div class="owl-carousel header-carousel position-relative">
				<div class="owl-carousel-item position-relative">
					<img class="img-fluid" src="img/slide1.jpg" alt="">
					<div
						class="position-absolute top-0 start-0 w-100 h-100 d-flex align-items-center"
						style="background: rgba(0, 0, 0, .2);">
						<div class="container py-5">

							<h1 class="display-2 text-white animated slideInDown mb-4">Fruit</h1>
							<a href=""
								class="btn btn-primary rounded-pill me-3 animated slideInLeft">Trang
								chủ</a>/ <a href=""
								class="btn btn-dark rounded-pill animated slideInRight">Sản
								phẩm</a>
						</div>
					</div>
				</div>
			</div>
		</div>

		<div class="row row-mg-parent collection-wraper">
			<div class="col-lg-3 bg-light rounded">
				<div class="filter_group" aria-expanded="false">
					<div class="group-menu filter_group_block">
						<div class="filter_group-subtitle mt-3">
							<h3 class="text-center">Danh mục sản phẩm</h3>
							<div class="ms-3 mt-4">
								<h6 class="text-left">
									<c:forEach items="${cateFruitList}" var="cateFruit">
										<i id="icon-${cateFruit.categoryFruitId}"
											class="fas fa-check-circle d-none"></i>
										<a href="fruit?categoryId=${cateFruit.categoryFruitId}"
											class="nav-item nav-link" id="${cateFruit.categoryFruitId}"
											onclick="selectCategory('${cateFruit.categoryFruitId}')">${cateFruit.categoryFruitName}</a>
									</c:forEach>
								</h6>
							</div>
						</div>

					</div>
				</div>
			</div>
			<div class="col-lg-9 wow fadeIn">
				<div class="container-xxl">
					<div class="container">
						<div class="row g-2">
							<c:forEach items="${fruitList}" var="fruit">
								<div class="col-lg-4 col-md-6 wow fadeInUp"
									data-wow-delay="0.3s">
									<div class="classes-item">
										<div class="bg-light rounded w-75 mx-auto p-3"
											style="background-color: #cfe2f3;">
											<img class="img-fluid rounded" src="img/${fruit.photo}"
												alt="Your Image" style="width: 100%; height: auto;">
										</div>
										<div class="bg-light rounded p-4 pt-5 mt-n5"
											style="background-color: #cfe2f3;">
											<a class="d-block text-center h3 mt-3 mb-4" href="">${fruit.fruitName}</a>
											<div
												class="d-flex align-items-center justify-content-center mb-4">
												<span
													class="text-black rounded-pill py-2 px-3 font-weight-bold"
													href="">${fruit.price}đ</span>
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
					</div>
				</div>
			</div>

			<!-- Footer Start -->
			<%@include file="../static/footer.jsp"%>
			<!-- Footer End -->
		</div>
</body>
</html>