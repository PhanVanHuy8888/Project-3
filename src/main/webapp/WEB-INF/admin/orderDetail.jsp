<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Chi tiết đơn hàng</title>
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

<link rel="stylesheet" href="assets/css/style.css">
<link rel="stylesheet"
	href="assets/vendors/flag-icon-css/css/flag-icon.min.css">
<link rel="stylesheet"
	href="assets/vendors/owl-carousel-2/owl.carousel.min.css">
<link rel="stylesheet"
	href="assets/vendors/owl-carousel-2/owl.theme.default.min.css">
<link rel="stylesheet"
	href="assets/vendors/mdi/css/materialdesignicons.min.css">
<link rel="stylesheet" href="assets/vendors/css/vendor.bundle.base.css">
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css"
	rel="stylesheet">
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css"
	rel="stylesheet">

</head>
<body>
	<form action="detailOrder" method="post">
		<div class="mt-5 container">
			<table class="table table-bordered">
			<tr>
				<th>Mã đơn hàng</th>
				<td>${order.orderId }</td>
			</tr>
			<tr>
				<th>Họ tên</th>
				<td>${order.username }</td>
			</tr>
			<tr>
				<th>Tên sản phẩm</th>
				<td>${order.fruitName }</td>
			</tr>
			<tr>
				<th>Email</th>
				<td>${order.email }</td>
			</tr>
			<tr>
				<th>Địa chỉ</th>
				<td>${order.address }</td>
			</tr>
			<tr>
				<th>Số điện thoại</th>
				<td>${order.phone }</td>
			</tr>
			<tr>
				<th>Giá</th>
				<td>${order.price }</td>
			</tr>
			<tr>
				<th>Phương thức thanh toán</th>
				<td>${order.pay }</td>
			</tr>
		</table>
		</div>
	</form>
</body>
</html>