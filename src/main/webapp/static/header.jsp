<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>	
<nav
	class="navbar navbar-expand-lg bg-white navbar-light sticky-top px-4 px-lg-5 py-lg-0">
	<a href="index.html" class="navbar-brand">
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
			<a href="index.html" class="nav-item nav-link active">Trang chủ</a> <a
				href="about.html" class="nav-item nav-link">Sản phẩm</a> <a
				href="classes.html" class="nav-item nav-link">Bài viết</a> <a
				href="classes.html" class="nav-item nav-link">Liên hệ</a>
		</div>

		<div class="nav-item dropdown">
			<a href="#"
				class="nav-link me-3 btn btn-primary rounded-pill px-3 d-none d-lg-block">
				<i class="fas fa-user"></i>
			</a>
			<div class="dropdown-menu rounded-0 rounded-bottom border-0 shadow-sm m-0">
				<c:if test="${not empty user }">
					<a href="#" class="dropdown-item">${user.name}</a>
				</c:if> 
				<a href="login.jsp" class="dropdown-item">Đăng nhập</a> 
				<a href="register.jsp" class="dropdown-item">Đăng ký</a>
			</div>
		</div>
		<a href="#"
			class="btn btn-primary rounded-pill px-3 d-none d-lg-block"> <i
			class="fas fa-shopping-cart"></i>
		</a>


	</div>
</nav>