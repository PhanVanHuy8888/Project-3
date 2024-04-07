<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile</title>
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
	<%@include file="../static/header.jsp"%>
	<div class="container mt-4">
		<div class="container-scroller">
			<div class="card col-lg-4 mx-auto">
				<div class="card-body px-5 py-5">
					
					<c:if test="${not empty fail }">
						<p class="text-center text-success">${fail }</p>
						<c:remove var="msg" scope="session" />
					</c:if>
					<h3 class="text-center text-success">Thông tin cá nhân</h3>
					<form action="editUser" method="POST" class="row g-3">
						<input type="hidden" name="id" value="${user.id}">
						<div class="col-md-12">
							<label for="inputEmail4" class="form-label">Tên</label> <input
								type="text" class="form-control" id="inputEmail4"
								name="username" value="${user.name}" placeholder="Tên">
						</div>
						<div class="col-md-12">
							<label for="inputPassword4" class="form-label">Email</label> <input
								type="email" class="form-control" id="inputPassword4"
								name="email" value="${user.email}" placeholder="Email">
						</div>
						<div class="col-12">
							<label for="inputAddress" class="form-label">Địa chỉ</label> <input
								type="text" class="form-control" id="inputAddress"
								name="address" value="${user.address}" placeholder="Địa chỉ">
						</div>

						<div class="col-12">
							<label for="inputCity" class="form-label">Số điện thoại</label> <input
								type="text" placeholder="Số điện thoại" name="phone"
								value="${user.phone}" class="form-control" id="inputCity">
						</div>
						<div class="col-12">
							<button type="submit" class="btn btn-primary">Cập nhật</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>

	<%@include file="../static/footer.jsp"%>

</body>
</html>