<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Thêm mới sản phẩm</title>
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
	<div class="col-12 grid-margin stretch-card">
		<div class="card">
			<div class="card-body">
				<h4 class="card-title">Thêm mới Fruit</h4>			
				<form class="forms-sample">
					<div class="form-group">
						<label for="exampleInputName1">Tên</label> <input type="text"
							class="form-control" name="fruitName" id="exampleInputName1" placeholder="Name">
					</div>
					<div class="form-group">
						<label for="exampleInputEmail3">Xuất xứ</label> <input
							type="text" name="origin" class="form-control" id="exampleInputEmail3"
							placeholder="Email">
					</div>
					<div class="form-group">
						<label for="exampleInputPassword4">Giá</label> <input
							type="number" name="price" class="form-control" id="exampleInputPassword4"
							placeholder="Password">
					</div>
					<div class="form-group">
						<label for="inputState">Loại trái cây</label> <select
							id="inputState" name="categoryFruitId" class="form-control">
							<option>--Chọn--</option>
							<option>Female</option>
						</select>
					</div>
					<div class="form-group">
						<label>File upload</label> <input type="file" name="img[]"
							class="file-upload-default">
						<div class="input-group col-xs-12">
							<input type="text" name="photo" class="form-control file-upload-info" disabled
								placeholder="Upload Image"> <span
								class="input-group-append">
								<button class="file-upload-browse btn btn-primary" type="button">Upload</button>
							</span>
						</div>
					</div>	
					<a type="submit" class="btn btn-primary mr-2">Lưu</a>
					<a href="listProduct.jsp" class="btn btn-dark">Quay lại</a>
				</form>
			</div>
		</div>
	</div>
</body>
</html>