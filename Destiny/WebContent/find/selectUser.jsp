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
				
				$("button:contains('ã��')").on("click", function() {
					//$("form").attr("method", "GET").attr("action", "/find/getUserResult").submit();
					$("form").attr("method", "POST").attr("action", "/find/getUserResult").submit();
				});		
				$( "button:contains('����')" ).on("click" , function() {
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

	<!--  ȭ�鱸�� div Start /////////////////////////////////////-->
	<div class="container" >
	
		<div class="page-header">
	       <h3 class=" text-info">�̻��� �˻�</h3>
	    </div>
	    
	    <!-- form Start /////////////////////////////////////-->
		<form class="form-horizontal">
			
		
			<div class="row">
		  		<div class="col-xs-4 col-md-2"><strong>����</strong></div>
				<div class="col-xs-8 col-md-4">
					<input type="radio" id="selectGender" name="selectGender" value='M'>����</input>
					<input type="radio" id="selectGender" name="selectGender" value='W'>����</input>
				</div>
			</div>
			
			<hr/>
			
			 <div class="row">
		  		<div class="col-xs-4 col-md-2 "><strong>����</strong></div>
				<div class="col-xs-8 col-md-4">
					<select name="selectAge">
						<option value="1">20�� ~ 24��</option>
						<option value="2">24�� ~ 29��</option>
						<option value="3">30�� ~ 34��</option>
						<option value="4">34�� ~ 49��</option>
						<option value="5">40�� ~ 44��</option>
						<option value="6">44�� ~ 59��</option>
						<option value="7">50�� ~ </option>
					</select>
				</div>
			</div>
			
			<hr/>
			
			<div class="row">
		  		<div class="col-xs-4 col-md-2 "><strong>����</strong></div>
				<div class="col-xs-8 col-md-4">
					<select name="city">
						<option value="����">����</option>
						<option value="����">����</option>
					</select>
					
					<select name="town">
						<option value="����">����</option>
						<option value="����">����</option>
					</select>
				</div>
			</div>
			
			<hr/>

			
			<div class="row">
				<div class="col-md-12 text-center ">
					<button type="button" class="btn btn-primary">����</button>
					<button type="button" class="btn btn-primary">ã��</button>
			  	</div>
			</div>
	
			<br/>
		</form>
	 </div>
	 
 	
</body>
</html>