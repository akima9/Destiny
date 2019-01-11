<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
		<title>selectUser</title>
		
		<!--  ///////////////////////// Bootstrap, jQuery CDN ////////////////////////// -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" >
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" >
		<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" ></script>
		
		<script type="text/javascript">
			$(function() {
				
				$("button:contains('찾기')").on("click", function() {
					//$("form").attr("method", "GET").attr("action", "/find/getUserResult").submit();
					$("form").attr("method", "POST").attr("action", "/find/getUserResult").submit();
				});		
				$( "button:contains('이전')" ).on("click" , function() {
					 history.go(-1);
				});
			});
		</script>
		
		<style>
	       body > div.container{
	        	border: 3px solid #D6CDB7;
	            margin-top: 10px;
	        }
	    </style>
	</head>
<body>
	<h1>selectUser.jsp</h1>

	<!--  화면구성 div Start /////////////////////////////////////-->
	<div class="container" >
	
		<div class="page-header">
	       <h3 class=" text-info">이상형 검색</h3>
	    </div>
	    
	    <!-- form Start /////////////////////////////////////-->
		<form class="form-horizontal">
			
		
			<div class="row">
		  		<div class="col-xs-4 col-md-2"><strong>성별</strong></div>
				<div class="col-xs-8 col-md-4">
					<input type="radio" id="selectGender" name="selectGender" value='M'>남자</input>
					<input type="radio" id="selectGender" name="selectGender" value='W'>여자</input>
				</div>
			</div>
			
			<hr/>
			
			 <div class="row">
		  		<div class="col-xs-4 col-md-2 "><strong>연령</strong></div>
				<div class="col-xs-8 col-md-4">
					<select name="selectAge">
						<option value="1">20세 ~ 24세</option>
						<option value="2">24세 ~ 29세</option>
						<option value="3">30세 ~ 34세</option>
						<option value="4">34세 ~ 49세</option>
						<option value="5">40세 ~ 44세</option>
						<option value="6">44세 ~ 59세</option>
						<option value="7">50세 ~ </option>
					</select>
				</div>
			</div>
			
			<hr/>
			
			<div class="row">
		  		<div class="col-xs-4 col-md-2 "><strong>지역</strong></div>
				<div class="col-xs-8 col-md-4">
					<select name="city">
						<option value="서울">서울</option>
						<option value="제주">제주</option>
					</select>
					
					<select name="town">
						<option value="강남">강남</option>
						<option value="관악">관악</option>
					</select>
				</div>
			</div>
			
			<hr/>

			
			<div class="row">
				<div class="col-md-12 text-center ">
					<button type="button" class="btn btn-primary">이전</button>
					<button type="button" class="btn btn-primary">찾기</button>
			  	</div>
			</div>
	
			<br/>
		</form>
	 </div>
	 
 	
</body>
</html>