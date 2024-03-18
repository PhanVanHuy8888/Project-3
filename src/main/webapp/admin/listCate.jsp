<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="dao.CategoryDaoImpl"%>
<%@ page import="conn.ConnectionUtils"%>
<%@ page import="java.util.*"%>
<%@ page import="entity.Category"%>
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
							<c:if test="${not empty fail }">
								<p class="text-center text-success">${fail }</p>
								<c:remove var="msg" scope="session" />
							</c:if>
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
										<%
										int count = 1;
										CategoryDaoImpl dao = new CategoryDaoImpl(ConnectionUtils.getMSSQLConnection());
										List<Category> list = dao.getAllCate();
										for (Category cate : list) {
										%>
										<tr>
											<td><%=count++%></td>
											<td><%=cate.getCategoryName()%></td>
											<td><a href="editCate.jsp?id=<%=cate.getCategoryId()%>"
												class="badge badge-outline-success">Sửa</a> <a
												href="../delete?id=<%=cate.getCategoryId()%>"
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
