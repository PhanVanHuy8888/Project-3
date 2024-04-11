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
							<h4 class="card-title">Account</h4>
							<div class="table-responsive">
								<table class="table">
									<thead>
										<tr>
											<th>#</th>
											<th>Tên</th>
											<th>Email</th>

											<th>Thao tác</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach items="${userList}" var="user" varStatus="loop">
											<tr>
												<td>${loop.index + 1}</td>
												<td>${user.name}</td>
												<td>${user.email}</td>
												<td><a href="deleteUser?id=${user.id}"
													class="badge badge-outline-danger"><i
														class="fa-solid fa-trash-can"></i></a></td>
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