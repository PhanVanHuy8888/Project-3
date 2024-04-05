<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sửa bài viết</title>
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
<link rel="stylesheet"
	href="assets/vendors/css/vendor.bundle.base.css">
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
                <h4 class="card-title">Sửa Bài Viết</h4>
                <c:if test="${not empty fail}">
                    <p class="text-center text-success">${fail}</p>
                    <c:remove var="fail" scope="session"/>
                </c:if>

                <form action="${pageContext.request.contextPath}/editCate" method="POST" class="forms-sample">
                    <input type="hidden" name="id" value="${cate.categoryId}">
                    <div class="form-group">
                        <label for="exampleInputName1">Tiêu đề</label>
                        <input type="text" class="form-control" name="categoryName" placeholder="Name" value="${cate.categoryName}">
                    </div>
                     <div class="form-group">
                        <label for="exampleInputName1">Mô tả</label>
                        <input type="text" class="form-control" name="categoryName" placeholder="Name" value="${cate.categoryName}">
                    </div>
                    
                    <button type="submit" class="btn btn-primary mr-2">Lưu</button>
                    <a href="cateList" class="btn btn-dark">Quay lại</a>
                </form>
            </div>
        </div>
    </div>
</body>
</html>