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
		<nav class="sidebar sidebar-offcanvas" id="sidebar">
			<div
				class="me-5 sidebar-brand-wrapper d-none d-lg-flex align-items-center justify-content-center fixed-top">
				<a href="#" class="navbar-brand">
					<h1 class="m-0 text-primary">
						<i class="fas fa-seedling"></i>Fruit
					</h1>
				</a>
			</div>
			<div
				class="sidebar-brand-wrapper d-none d-lg-flex align-items-center justify-content-center fixed-top">
				<a class="sidebar-brand brand-logo" href="#">
					<h1 class="m-0 text-primary">
						<i class="fas fa-seedling"></i>Fruit
					</h1>
				</a>
			</div>

			<ul class="nav">
				<li class="nav-item profile">
					<div class="profile-desc">
						<div class="profile-pic">
							<div class="count-indicator">
								<img class="img-xs rounded-circle" src="../img/2.jpg" alt="">
							</div>
							<div class="profile-name">
								<c:if test="${not empty user }">
									<h4 class="mb-0 font-weight-normal" href="#"
										class="dropdown-item">${user.name}</h4>
								</c:if>
							</div>
						</div>
						<a href="#" id="profile-dropdown" data-toggle="dropdown"><i
							class="mdi mdi-dots-vertical"></i></a>
						<div
							class="dropdown-menu dropdown-menu-right sidebar-dropdown preview-list"
							aria-labelledby="profile-dropdown">
							<a href="#" class="dropdown-item preview-item">
								<div class="preview-thumbnail">
									<div class="preview-icon bg-dark rounded-circle">
										<i class="mdi mdi-settings text-primary"></i>
									</div>
								</div>
								<div class="preview-item-content">
									<p class="preview-subject ellipsis mb-1 text-small">Account
										settings</p>
								</div>
							</a>
							<div class="dropdown-divider"></div>
							<a href="#" class="dropdown-item preview-item">
								<div class="preview-thumbnail">
									<div class="preview-icon bg-dark rounded-circle">
										<i class="mdi mdi-onepassword  text-info"></i>
									</div>
								</div>
								<div class="preview-item-content">
									<p class="preview-subject ellipsis mb-1 text-small">Change
										Password</p>
								</div>
							</a>
							<div class="dropdown-divider"></div>
							<a href="#" class="dropdown-item preview-item">
								<div class="preview-thumbnail">
									<div class="preview-icon bg-dark rounded-circle">
										<i class="mdi mdi-calendar-today text-success"></i>
									</div>
								</div>
								<div class="preview-item-content">
									<p class="preview-subject ellipsis mb-1 text-small">To-do
										list</p>
								</div>
							</a>
						</div>
					</div>
				</li>

				<li class="nav-item menu-items"><a class="nav-link"
					href="index.html"> <span class="menu-icon"> <i
							class="mdi mdi-speedometer"></i>
					</span> <span class="menu-title">Danh mục</span>
				</a></li>
				<li class="nav-item menu-items"><a class="nav-link"
					href="index.html"> <span class="menu-icon"> <i
							class="mdi mdi-speedometer"></i>
					</span> <span class="menu-title">Sản phẩm</span>
				</a></li>
				<li class="nav-item menu-items"><a class="nav-link"
					href="pages/forms/basic_elements.html"> <span class="menu-icon">
							<i class="mdi mdi-playlist-play"></i>
					</span> <span class="menu-title">Bài viết</span>
				</a></li>
			</ul>
		</nav>
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
			<!-- partial -->
			<div class="main-panel">
				<div class="content-wrapper"></div>
				<!-- content-wrapper ends -->
				<!-- partial:partials/_footer.html -->
				<footer class="footer">
					<div
						class="d-sm-flex justify-content-center justify-content-sm-between">
						<span
							class="text-muted d-block text-center text-sm-left d-sm-inline-block">Copyright
							© bootstrapdash.com 2020</span> <span
							class="float-none float-sm-right d-block mt-1 mt-sm-0 text-center">
							Free <a
							href="https://www.bootstrapdash.com/bootstrap-admin-template/"
							target="_blank">Bootstrap admin templates</a> from
							Bootstrapdash.com
						</span>
					</div>
				</footer>
				<!-- partial -->
			</div>
			<!-- main-panel ends -->
		</div>
		<!-- page-body-wrapper ends -->
	</div>
	
</script>
</body>
</html>