<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bài viết chi tiết</title>
<link href="img/favicon.ico" rel="icon">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Heebo:wght@400;500;600&family=Inter:wght@600&family=Lobster+Two:wght@700&display=swap"
	rel="stylesheet">
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css"
	rel="stylesheet">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css"
	rel="stylesheet">
<link href="css/bootstrap.min.css" rel="stylesheet">


<link href="css/style.css" rel="stylesheet" type="text/css">
</head>
<body>
	<%@include file="../static/header.jsp"%>

	<div class="mt-4 container">
		<form action="postDetail" method="POST">
			<input type="hidden" name="id" value="${post.id}">
			<h3>${post.title}</h3>
			<hr />
			<img style="width: 560px;" src="img/${post.img }">
			<hr />
			<p>${post.description}</p>
		</form>

	</div>
	<%@include file="../static/footer.jsp"%>
	<!-- Footer End -->

</body>
</html>