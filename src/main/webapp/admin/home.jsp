<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin</title>
<link rel="stylesheet" href="../assets/css/style.css">
<link rel="stylesheet"
	href="../assets/vendors/flag-icon-css/css/flag-icon.min.css">
<link rel="stylesheet"
	href="../assets/vendors/owl-carousel-2/owl.carousel.min.css">
<link rel="stylesheet"
	href="../assets/vendors/owl-carousel-2/owl.theme.default.min.css">
<link rel="stylesheet"
	href="../assets/vendors/mdi/css/materialdesignicons.min.css">
<link rel="stylesheet"
	href="../assets/vendors/css/vendor.bundle.base.css">
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css"
	rel="stylesheet">
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css"
	rel="stylesheet">
</head>
<body>

	<div class="container-scroller">
		<!-- partial:partials/_sidebar.html -->
		<%@include file="nav.jsp" %>
		<!-- partial -->
		<div class="container-fluid page-body-wrapper">
			<!-- partial:partials/_navbar.html -->
			<nav class="navbar p-0 fixed-top d-flex flex-row">
				<div
					class="navbar-brand-wrapper d-flex d-lg-none align-items-center justify-content-center">
					<a class="navbar-brand brand-	-mini" href="index.html"><img
						src="../img/1.jpg" alt="logo" /></a>
				</div>
				<div
					class="navbar-menu-wrapper flex-grow d-flex align-items-stretch">

					<ul class="navbar-nav w-100">
						<li class="nav-item w-100">
							<form class="nav-link mt-2 mt-md-0 d-none d-lg-flex search">
								<input type="text" class="form-control"
									placeholder="Search products">
							</form>
						</li>
					</ul>
					<ul class="navbar-nav navbar-nav-right">
						<li class="nav-item">
							<button
								class="btn btn-primary px-4 py-2 d-flex align-items-center">
								<i class="fas fa-sign-out-alt mr-2"></i>
								<!-- Icon with margin-right -->
								<span class="d-inline font-weight-bold">Log</span><span
									class="d-inline font-weight-bold">out</span>
							</button>
						</li>
					</ul>

					<button
						class="navbar-toggler navbar-toggler-right d-lg-none align-self-center"
						type="button" data-toggle="offcanvas">
						<span class="mdi mdi-format-line-spacing"></span>
					</button>
				</div>
			</nav>
		</div>
	</div>

</body>
</html>