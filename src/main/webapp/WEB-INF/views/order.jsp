<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
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
	<input type="hidden" name="email" value="${user.email }" >
	<div class="container mt-5 mb-5">
		<table class="table table-striped">
			<thead>
				<tr>
					<th scope="col">Mã đơn hàng</th>
					<th scope="col">Tên sản phẩm</th>
					<th scope="col">Giá</th>
					<th scope="col">Hình thức thanh toán</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${orderList}" var="order">
					<tr>
						<td>${order.orderId}</td>
						<td>${order.fruitName}</td>
						<td><fmt:formatNumber pattern="#,##0 đ" value="${order.price}" /></td>
						<td>${order.pay}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<%@include file="../static/footer.jsp"%>



</body>
</html>