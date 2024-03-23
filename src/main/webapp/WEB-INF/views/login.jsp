<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Đăng nhập</title>
<link href="img/favicon.ico" rel="icon">

<!-- Google Web Fonts -->
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Heebo:wght@400;500;600&family=Inter:wght@600&family=Lobster+Two:wght@700&display=swap"
	rel="stylesheet">

<!-- Icon Font Stylesheet -->
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css"
	rel="stylesheet">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css"
	rel="stylesheet">

<!-- Customized Bootstrap Stylesheet -->
<link href="css/bootstrap.min.css" rel="stylesheet">

<!-- Template Stylesheet -->
<link href="css/style.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div class="container-xxl py-5">
		<div class="container">
			<div class="bg-light rounded">
				<div class="row g-0">
					<div class="col-lg-6 wow fadeIn" data-wow-delay="0.1s">
						<div class="h-100 d-flex flex-column justify-content-center p-5">
							<h1 class="mb-4 text-center">Đăng nhập</h1>
							<c:if test="${not empty fail }">
								<h4 class="text-center text-danger">${fail }</h4>
								<c:remove var="fail" scope="session" />
							</c:if>
							<form action="login" method="post">
								<div class="row g-3">
									<div class="col-12">
										<div class="form-floating">
											<input type="text" class="form-control border-0" id="name"
												placeholder=" Name" name="email"> <label for="gname"> Tài khoản</label>
										</div>
									</div>
									<div class="col-12">
										<div class="form-floating">
											<input type="password" class="form-control border-0" 
												placeholder=" Email" name="password"> <label for="gmail">
												Mật khẩu</label>
										</div>
									</div>
									<div class="col-12">
										<button class="btn btn-primary w-100 py-3" type="submit">Đăng nhập</button>
									</div>
									<div class="text-center">
										<a href="register">Đăng ký |</a>
										<a href="index">Back home</a>
									</div>
								</div>
							</form>
						</div>
					</div>
					<div class="col-lg-6 wow fadeIn" data-wow-delay="0.5s"
						style="min-height: 400px;">
						<div class="position-relative h-100">
							<img class="position-absolute w-100 h-100 rounded"
								src="img/7.jpg" style="object-fit: cover;">
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>