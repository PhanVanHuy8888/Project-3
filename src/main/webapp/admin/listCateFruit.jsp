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
							<div class="table-responsive">
								<table class="table">
									<thead>
										<tr>
											<th>#</th>
											<th>Mã</th>
											<th>Tên</th>
											<th>Thao tác</th>
										</tr>
									</thead>
									<tbody>
										<%
										int count = 1;
										CateFruitDaoImpl dao = new CateFruitDaoImpl(ConnectionUtils.getMSSQLConnection());
										List<CategoryFruit> list = dao.getAllCateFruit();
										for (CategoryFruit cateFruit : list) {
										%>
										<tr>
											<td><%=count++%></td>
											<td><%=cateFruit.getCategoryFruitId() %></td>
											<td><%=cateFruit.getCategoryFruitName() %></td>
											
											<td><a href="cateFruitEdit.jsp?id=<%=cateFruit.getCategoryFruitId()%>"
												class="badge badge-outline-success">Sửa</a> <a
												href="../deleteCateFruit?id=<%=cateFruit.getCategoryFruitId()%>"
												class="badge badge-outline-danger">Xoá</a></td>
										</tr>
										<%
										}
										%>
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