<%@page import="entity.Cart"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<%@ page import="dao.CartDaoImpl"%>
<%@ page import="conn.ConnectionUtils"%>
<%@ page import="java.util.*"%>
<%@ page import="entity.Cart"%>
<%@ page import="entity.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Giỏ hàng</title>
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

	<c:if test="${not empty user }">

	</c:if>


	<div class="container mt-4">
		<div class="row">
			<div class="col-md-6">
				<h3 class="text-center text-success">Sản phẩm của bạn</h3>
				<table class="table table-striped">
					<thead>
						<tr>
							<th scope="col">#</th>
							<th scope="col">Tên</th>
							<th scope="col">Xuất xứ</th>
							<th scope="col">Giá</th>
							<th scope="col">Thao tác</th>
						</tr>
					</thead>
					<tbody>

						<c:set var="totalPrice" value="0" />
						<c:forEach items="${cartList}" var="cart" varStatus="loop">
							<tr>
								<td>${loop.index + 1}</td>
								<th scope="row">${cart.fruitName}</th>
								<td>${cart.origin}</td>
								<td>${cart.price}</td>
								<td><a href="deleteCart?cid=${cart.cartId}&id=${user.id}"
									class="btn btn-danger"> <i class="fa-solid fa-trash-can"></i>
								</a></td>
							</tr>
							<c:set var="totalPrice" value="${totalPrice + cart.price}" />
						</c:forEach>
						<tr>
							<td colspan="4">Tổng:</td>
							<td>${totalPrice}</td>
						</tr>

					</tbody>
				</table>
			</div>
			<div class="col-md-6">
				<div class="card">
					<div class="card-body">
						<h3 class="text-center text-success">Thông tin đơn hàng</h3>
						<form class="row g-3">
							<div class="col-md-6">
								<label for="inputEmail4" class="form-label">Tên</label> <input
									type="text" class="form-control" id="inputEmail4"
									placeholder="Tên">
							</div>
							<div class="col-md-6">
								<label for="inputPassword4" class="form-label">Email</label> <input
									type="email" class="form-control" id="inputPassword4"
									placeholder="Email">
							</div>
							<div class="col-12">
								<label for="inputAddress" class="form-label">Địa chỉ</label> <input
									type="text" class="form-control" id="inputAddress"
									placeholder="Địa chỉ">
							</div>
							<div class="col-12">
								<label for="inputCity" class="form-label">Số điện thoại</label>
								<input type="text" placeholder="Số điện thoại"
									class="form-control" id="inputCity">
							</div>
							<div class="col-12">
								<label for="inputState" class="form-label">Phương thức
									thanh toán</label> <select id="inputState" class="form-select">
									<option selected>Choose...</option>
									<option>Thanh toán bằng tiền mặt</option>
								</select>
							</div>
							<div class="col-12">
								<button type="submit" class="btn btn-primary">Thanh
									toán</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

	<%@include file="../static/footer.jsp"%>



</body>
</html>