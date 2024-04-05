<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<nav
	class="navbar navbar-expand-lg bg-white navbar-light sticky-top px-4 px-lg-5 py-lg-0">
	<a href="index" class="navbar-brand">
		<h1 class="m-0 text-primary">
			<i class="fas fa-seedling"></i>Fruit
		</h1>
	</a>
	<button type="button" class="navbar-toggler" data-bs-toggle="collapse"
		data-bs-target="#navbarCollapse">
		<span class="navbar-toggler-icon"></span>
	</button>
	<div class="collapse navbar-collapse" id="navbarCollapse">
		<div class="navbar-nav mx-auto">
			<c:forEach items="${cateList}" var="cate">
				<a href="${cate.link}" class="nav-item nav-link">${cate.categoryName}</a>
			</c:forEach>
		</div>

		<div class="nav-item dropdown">
			<a href="#"
				class="nav-link me-3 btn btn-primary rounded-pill px-3 d-none d-lg-block">
				<i class="fas fa-user"></i>
			</a>
			<div
				class="dropdown-menu rounded-0 rounded-bottom border-0 shadow-sm m-0">
				<c:if test="${not empty user }">
					<a href="#" class="dropdown-item">${user.name}</a>
					<a href="logout" class="dropdown-item">Đăng xuất</a>
				</c:if>
				<c:if test="${empty user }">
					<a href="login" class="dropdown-item">Đăng nhập</a>
					<a href="register" class="dropdown-item">Đăng ký</a>
				</c:if>
			</div>
		</div>
		<c:if test="${not empty user }">
			<a href="checkout?id=${user.id }"
				class="btn btn-primary rounded-pill px-3 d-none d-lg-block"> <i
				class="fas fa-shopping-cart"></i>
			</a>
		</c:if>
		<c:if test="${empty user }">
			<a href="login"
				class="btn btn-primary rounded-pill px-3 d-none d-lg-block"> <i
				class="fas fa-shopping-cart"></i>
			</a>
		</c:if>



	</div>
</nav>