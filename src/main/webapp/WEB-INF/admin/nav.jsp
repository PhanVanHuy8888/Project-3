<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<nav class="sidebar sidebar-offcanvas" id="sidebar">
	<div
		class="sidebar-brand-wrapper d-none d-lg-flex align-items-center justify-content-center fixed-top">
		<a class="sidebar-brand brand-logo" href="cateList">
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
						<img class="img-xs rounded-circle" src="img/2.jpg" alt="">
					</div>
					<div class="profile-name">
						<c:if test="${not empty user }">
							<h4 class="mb-0 font-weight-normal" href="#"
								class="dropdown-item">${user.name}</h4>
						</c:if>
					</div>
				</div>
			</div>
		</li>

		<li class="nav-item menu-items"><a class="nav-link"
			href="userList"> <span class="menu-icon"><i
					class="mdi mdi-security"></i> </span> <span class="menu-title">Tài
					khoản</span>
		</a></li>

		<li class="nav-item menu-items"><a class="nav-link"
			href="cateList"> <span class="menu-icon"> <i
					class="mdi mdi-table-large"></i>
			</span> <span class="menu-title">Danh mục</span>
		</a></li>
		<li class="nav-item menu-items"><a class="nav-link"
			href="fruitList"> <span class="menu-icon"> <i
					class="mdi mdi-speedometer"></i>
			</span> <span class="menu-title">Sản phẩm</span>
		</a></li>
		<li class="nav-item menu-items"><a class="nav-link"
			href="cateFruitList"> <span class="menu-icon"> <i
					class="mdi mdi-contacts"></i>
			</span> <span class="menu-title">Loại sản phẩm</span>
		</a></li>
		<li class="nav-item menu-items"><a class="nav-link"
			href="blogList"> <span class="menu-icon"> <i
					class="mdi mdi-chart-bar"></i>
			</span> <span class="menu-title">Bài viết</span>
		</a></li>
		<li class="nav-item menu-items"><a class="nav-link"
			href="orderAdmin"> <span class="menu-icon"> <i
					class="mdi mdi-playlist-play"></i>
			</span> <span class="menu-title">Đơn hàng</span>
		</a></li>
		<li class="nav-item menu-items"><a class="nav-link"
			href="postList"> <span class="menu-icon"> <i
					class="mdi mdi-file-document-box"></i>
			</span> <span class="menu-title">Bài viết Trending</span>
		</a></li>
	</ul>
</nav>
