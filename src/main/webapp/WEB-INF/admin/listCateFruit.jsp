<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="dao.CateFruitDaoImpl"%>
<%@ page import="conn.ConnectionUtils"%>
<%@ page import="java.util.*"%>
<%@ page import="entity.CategoryFruit"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="container-scroller">
	<%@include file="home.jsp"%>
	<div class="main-panel">

		<div class="content-wrapper">
			<div class="">
				<div class="col-12">
					<div class="card">
						<div class="card-body">
							<h4 class="card-title">Loại sản phẩm</h4>
							<a href="cateFruitAdd.jsp"
								class="btn badge badge-outline-primary">Thêm mới</a>
								<p>${errorString}</p>
							<div class="table-responsive">
								<table class="table">
									<thead>
										<tr>
											<th>#</th>										
											<th>Tên</th>
											<th>Thao tác</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach items="${fruitCategories}" var="cateFruit" varStatus="loop">
											<tr>
												<td>${loop.index + 1}</td>
												<td>${cateFruit.categoryFruitName}</td>
												<td><a href="editCate.jsp?id=${cate.categoryFruitId}"
													class="badge badge-outline-success">Sửa</a> <a
													href="../delete?id=${cate.categoryFruitId}"
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