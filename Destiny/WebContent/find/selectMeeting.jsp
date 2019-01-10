<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
		<title>selectMeeting</title>

		<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
		<script type="text/javascript">
			$(function() {
				
				$("a[href='#' ]:contains('이상형 찾기')").on("click", function() {
					self.location = "/find/selectUser"
				});
				$("a[href='#' ]:contains('모임찾기')").on("click", function() {
					self.location = "/find/selectMeeting"
				});			
			});
		</script>
	</head>
<body>
	<h1>selectMeeting.jsp</h1>

</body>
</html>