<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="default.css">
<link rel="stylesheet" href="main.css">
</head>
<body>
	<div id="wrap">
		<jsp:include page="header.jsp" />
		
		<div id="main">
			<jsp:include page="main.jsp" />
		</div>
		
		<jsp:include page="footer.jsp" />
	</div>
</body>
</html>