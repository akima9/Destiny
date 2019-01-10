<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>우리들의 연결고리</title>
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script type="text/javascript">
	$(function() {
		
		$("a[href='#' ]:contains('맛집정보')").on("click", function() {
			alert("눌림~")
			self.location = "/info/listRestaurantInfo"
		});
		
	});
</script>
</head>
<body>
	<h1>우리들의 연결고리</h1>
	<ul>
		<li><a href="#">모임</a></li>
		<li><a href="#">채팅</a></li>
		<li><a href="#">내주변</a></li>
		<li><a href="#">스토리</a></li>
		<li><a href="#">정보</a></li>
		<li><a href="#">맛집정보</a></li>
		<li><a href="#">연애조언</a></li>
		<li><a href="#">공지사항</a></li>
	</ul>
</body>
</html>