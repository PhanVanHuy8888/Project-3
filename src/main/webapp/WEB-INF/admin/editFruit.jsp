<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sửa sản phẩm</title>
<link
	href="https://fonts.googleapis.com/css2?family=Heebo:wght@400;500;600&family=Inter:wght@600&family=Lobster+Two:wght@700&display=swap"
	rel="stylesheet">

<!-- Icon Font Stylesheet -->
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css"
	rel="stylesheet">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css"
	rel="stylesheet">

<link rel="stylesheet" href="assets/css/style.css">
<link rel="stylesheet"
	href="assets/vendors/flag-icon-css/css/flag-icon.min.css">
<link rel="stylesheet"
	href="assets/vendors/owl-carousel-2/owl.carousel.min.css">
<link rel="stylesheet"
	href="assets/vendors/owl-carousel-2/owl.theme.default.min.css">
<link rel="stylesheet"
	href="assets/vendors/mdi/css/materialdesignicons.min.css">
<link rel="stylesheet" href="assets/vendors/css/vendor.bundle.base.css">
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css"
	rel="stylesheet">
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css"
	rel="stylesheet">

</head>
<body>
	<div class="col-12 grid-margin stretch-card">
		<div class="card">
			<div class="card-body">
				<h4 class="card-title">Sửa trái cây</h4>
				<c:if test="${not empty fail}">
					<p class="text-center text-success">${fail}</p>
					<c:remove var="fail" scope="session" />
				</c:if>
				<form action="fruitEdit"
					method="post" enctype="multipart/form-data" class="forms-sample">
					<input type="hidden" name="id" value="${fruit.fruitId}">
					<div class="form-group">
						<label for="exampleInputName1">Tên</label> <input type="text"
							class="form-control" name="fruitName" id="exampleInputName1"
							placeholder="Name" value="${fruit.fruitName}">
					</div>
					<div class="form-group">
						<label for="exampleInputEmail3">Xuất xứ</label> <input type="text"
							name="origin" class="form-control" id="exampleInputEmail3"
							placeholder="Xuất xứ" value="${fruit.origin}">
					</div>
					<div class="form-group">
						<label for="exampleInputPassword4">Giá</label> <input
							type="number" name="price" class="form-control"
							id="exampleInputPassword4" placeholder="Giá"
							value="${fruit.price}">
					</div>
					<div class="form-group">
						<label for="inputState">Loại trái cây</label> <select
							id="inputState" name="categoryFruitName" class="form-control">
							<option>--Chọn--</option>
							<!-- Sử dụng forEach để lặp qua danh sách loại trái cây và hiển thị chúng -->
							<c:forEach items="${fruitCategories}" var="cateFruit">
								<option>${cateFruit.categoryFruitName}</option>
							</c:forEach>
						</select>

					</div>

					<div class="form-group">
						<label for="exampleInputPassword4">Mô tả</label> <input
							type="text" name="description" class="form-control"
							id="exampleInputPassword4" placeholder="Mô tả"
							value="${fruit.description}">
					</div>
					<div class="form-group">
						<label for="exampleFormControlFile1">Upload Photo</label> <input
							name="photo" type="file" class="form-control-file"
							id="exampleFormControlFile1" value="${fruit.photo}">

					</div>
					<button type="submit" class="btn btn-primary mr-2">Lưu</button>
					<a href="fruitList" class="btn btn-dark">Quay lại</a>
				</form>
			</div>
		</div>
	</div>
</body>
</html>
