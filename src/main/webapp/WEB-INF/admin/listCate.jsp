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
							<a href="cateCreate" class="btn badge badge-outline-primary">Thêm
								mới</a>
								<p>${errorString}</p>
							<c:if test="${not empty fail }">
								<p class="text-center text-success">${fail }</p>
								<c:remove var="msg" scope="session" />
							</c:if>
							<div class="table-responsive">
								<table class="table">
									<thead>
										<tr>
											<th>#</th>
											<th>Tên loại sản phẩm</th>
											<th>Thao tác</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach items="${cateList}" var="cate" varStatus="loop">
											<tr>
												<td>${loop.index + 1}</td>
												<td>${cate.categoryName}</td>
												<td><a href="editCate?id=${cate.categoryId }"
													class="badge badge-outline-success">Sửa</a> <a
													href="delete?id=${cate.categoryId}"
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
