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
							<h4 class="card-title">Bài viết</h4>
							<a href="blogCreate" class="btn badge badge-outline-primary">Thêm
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
											<th>Tiêu đề</th>
											<th>Hình ảnh</th>
											<th>Mô tả</th>
											<th>Thao tác</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach items="${blogList}" var="blog" varStatus="loop">
											<tr>
												<td>${loop.index + 1}</td>
												<td
													style="max-width: 150px; overflow: hidden; text-overflow: ellipsis;">${blog.title}</td>
												<td><img src="img/${blog.image}" alt="ảnh" width="200"
													height="200"></td>
												<td
													style="max-width: 150px; overflow: hidden; text-overflow: ellipsis;">${blog.description}</td>
												<td><a href="editBlog?id=${blog.id}"
													class="badge badge-outline-success">Sửa</a> <a
													href="delete?id=${blog.id}"
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
