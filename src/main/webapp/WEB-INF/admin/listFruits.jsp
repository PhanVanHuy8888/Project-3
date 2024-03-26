<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="container-scroller">
	<%@include file="home.jsp"%>
	<div class="main-panel">

		<div class="content-wrapper">
			<div class="">
				<div class="col-12">
					<div class="card">
						<div class="card-body">
							<h4 class="card-title">Sản phẩm</h4>
							<a href="fruitCreate" class="btn badge badge-outline-primary">Thêm
								mới</a>
							<div class="table-responsive">
								<table class="table">
									<thead>
										<tr>
											<th>#</th>
											<th>Tên</th>
											<th>Ảnh</th>
											<th>Xuất xứ</th>
											<th>Giá</th>
											<th>Thao tác</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach items="${fruitList}" var="fruit" varStatus="loop">
											<tr>
												<td>${loop.index + 1}</td>
												<td>${fruit.fruitName}</td>
												<td><img src="img/${fruit.photo}" alt="ảnh" width="200"
													height="200"></td>

												<td>${fruit.origin}</td>
												<td>${fruit.price}</td>
												<td><a href="editCate?id=${fruit.fruitId}"
													class="badge badge-outline-success">Sửa</a> <a
													href="delete?id=${fruit.fruitId}"
													class="badge badge-outline-danger">Xoá</a></td>
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
</div>