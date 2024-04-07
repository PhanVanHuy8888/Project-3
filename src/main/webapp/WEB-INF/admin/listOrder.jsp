<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<div class="container-scroller">
	<%@include file="home.jsp"%>
	<div class="main-panel">

		<div class="content-wrapper">
			<div class="col-12">
				<div class="card">
					<div class="card-body">
						<h4 class="card-title">Đơn hàng</h4>
						<div class="table-responsive">
							<table class="table">
								<thead>
									<tr>
										<th scope="col">Mã đơn hàng</th>
										<th>Tên</th>
										<th scope="col">Địa chỉ</th>
										
										<th>Số điện thoại</th>
										<th>Tên sản phẩm</th>
										<th scope="col">Giá</th>
										<th scope="col">Hình thức thanh toán</th>
										<th>Thao tác</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${orderList}" var="order">
										<tr>
											<td>${order.orderId}</td>
											<td>${order.username}</td>
											<td
												style="max-width: 150px; overflow: hidden; text-overflow: ellipsis;"
												title="${order.address}">${order.address}</td>
											<td>${order.phone}</td>
											<td>${order.fruitName}</td>
											<td><fmt:formatNumber pattern="#,##0 đ"
													value="${order.price}" /></td>
											<td>${order.pay}</td>
											<td><a class="btn btn-success"> <i class="fa-solid fa-eye"></i>
											</a></td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>