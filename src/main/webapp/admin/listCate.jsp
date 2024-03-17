<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="container-scroller">
	<%@include file="home.jsp"%>
	<div class="main-panel">

		<div class="content-wrapper">
			<div class="">
				<div class="col-12">
					<div class="card">
						<div class="card-body">
							<h4 class="card-title">Danh mục</h4>
							<a href="cateAdd.jsp" class="btn badge badge-outline-primary">Thêm
								mới</a>
							<div class="table-responsive">
								<table class="table">
									<thead>
										<tr>
											<th>#</th>
											<th>Tên danh mục</th>
											<th>Thao tác</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach items="${category}" var="category"
											varStatus="status">
											<tr>
												<td>${status.index + 1}</td>
												<!-- Số thứ tự -->
												<td>${category.categoryName}</td>
												<!-- Tên danh mục -->
												<td>
													<div class="badge badge-outline-success">Sửa</div>
													<div class="badge badge-outline-danger">Xoá</div>
												</td>
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
