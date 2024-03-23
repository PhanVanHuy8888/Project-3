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
							<a href="fruitsAdd.jsp" class="btn badge badge-outline-primary">Thêm
								mới</a>
							<div class="table-responsive">
								<table class="table">
									<thead>
										<tr>
											<th>
												<div class="form-check form-check-muted m-0">
													<label class="form-check-label"> <input
														type="checkbox" class="form-check-input">
													</label>
												</div>
											</th>
											<th>Tên</th>
											<th>Ảnh</th>
											<th>Loại</th>
											<th>Xuất xứ</th>
											<th>Giá</th>
											<th>Start Date</th>
											<th>Thao tác</th>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td>
												<div class="form-check form-check-muted m-0">
													<label class="form-check-label"> <input
														type="checkbox" class="form-check-input">
													</label>
												</div>
											</td>
											<td><img src="assets/images/faces/face3.jpg" alt="image" />
												<span class="pl-2">Peter Gill</span></td>
											<td>02312</td>
											<td>$14,500</td>
											<td>Development</td>
											<td>Online Payment</td>
											<td>04 Dec 2019</td>
											<td>
												<div class="badge badge-outline-success">Sửa</div>
												<div class="badge badge-outline-danger">Xoá</div>
											</td>
										</tr>
										<tr>
											<td>
												<div class="form-check form-check-muted m-0">
													<label class="form-check-label"> <input
														type="checkbox" class="form-check-input">
													</label>
												</div>
											</td>
											<td><img src="assets/images/faces/face4.jpg" alt="image" />
												<span class="pl-2">Sallie Reyes</span></td>
											<td>02312</td>
											<td>$14,500</td>
											<td>Website</td>
											<td>Credit card</td>
											<td>04 Dec 2019</td>
											<td>
												<div class="badge badge-outline-success">Sửa</div>
												<div class="badge badge-outline-danger">Xoá</div>
											</td>
										</tr>
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