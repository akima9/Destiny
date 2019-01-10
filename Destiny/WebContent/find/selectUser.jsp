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
				
				$("a[href='#' ]:contains('ã��')").on("click", function() {
					//self.location = "/find/getUserResult"
					$("form").attr("method", "GET").attr("action", "/find/getUserResult").submit();
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
					<input type="radio" id="gender" name="man" checked>����</input>
					<input type="radio" id="gender" name="woman">����</input>
				</div>
			</div>
			
			<hr/>
			
			<div class="row">
		  		<div class="col-xs-4 col-md-2 "><strong>����</strong></div>
				<div class="col-xs-8 col-md-4">
					<select name="ageRange">
						<option value="">24�� ����</option>
						<option value="">000</option>
					</select>
				</div>
			</div>
			
			<hr/>
			
			<div class="row">
		  		<div class="col-xs-4 col-md-2 "><strong>����</strong></div>
				<div class="col-xs-8 col-md-4">
					<select name="location_city">
						<option value="">�����</option>
						<option value="">���ֽ�</option>
					</select>
					
					<select name="location_town">
						<option value="">���ʱ�</option>
						<option value="">���Ǳ�</option>
					</select>
				</div>
			</div>
			
			<hr/>
			
			<div class="row">
		  		<div class="col-xs-4 col-md-2 "><strong>���ɻ�</strong></div>
				<div class="col-xs-8 col-md-6">
					<div class="btn-group" data-toggle="buttons">
					  <label class="btn btn-primary">
					    <input type="checkbox" checked> ���ɻ�1
					  </label>
					</div>
					<div class="btn-group" data-toggle="buttons">
					  <label class="btn btn-primary">
					    <input type="checkbox" checked> ���ɻ�2
					  </label>
					</div>
					<div class="btn-group" data-toggle="buttons">
					  <label class="btn btn-primary">
					    <input type="checkbox" checked> ���ɻ�3
					  </label>
					</div>
					<div class="btn-group" data-toggle="buttons">
					  <label class="btn btn-primary">
					    <input type="checkbox" checked> ���ɻ�4
					  </label>
					</div>
					<div class="btn-group" data-toggle="buttons">
					  <label class="btn btn-primary">
					    <input type="checkbox" checked> ���ɻ�5
					  </label>
					</div>
					<br/><br/>
					<div class="btn-group" data-toggle="buttons">
					  <label class="btn btn-primary">
					    <input type="checkbox" checked> ���ɻ�1
					  </label>
					</div>
					<div class="btn-group" data-toggle="buttons">
					  <label class="btn btn-primary">
					    <input type="checkbox" checked> ���ɻ�2
					  </label>
					</div>
					<div class="btn-group" data-toggle="buttons">
					  <label class="btn btn-primary">
					    <input type="checkbox" checked> ���ɻ�3
					  </label>
					</div>
					<div class="btn-group" data-toggle="buttons">
					  <label class="btn btn-primary">
					    <input type="checkbox" checked> ���ɻ�4
					  </label>
					</div>
					<div class="btn-group" data-toggle="buttons">
					  <label class="btn btn-primary">
					    <input type="checkbox" checked> ���ɻ�5
					  </label>
					</div>
					
					<br/><br/>
					<div class="btn-group" data-toggle="buttons">
					  <label class="btn btn-primary">
					    <input type="checkbox" checked> ���ɻ�1
					  </label>
					</div>
					<div class="btn-group" data-toggle="buttons">
					  <label class="btn btn-primary">
					    <input type="checkbox" checked> ���ɻ�2
					  </label>
					</div>
					<div class="btn-group" data-toggle="buttons">
					  <label class="btn btn-primary">
					    <input type="checkbox" checked> ���ɻ�3
					  </label>
					</div>
					<div class="btn-group" data-toggle="buttons">
					  <label class="btn btn-primary">
					    <input type="checkbox" checked> ���ɻ�4
					  </label>
					</div>
					<div class="btn-group" data-toggle="buttons">
					  <label class="btn btn-primary">
					    <input type="checkbox" checked> ���ɻ�5
					  </label>
					</div>
					<br/><br/>
					<div class="btn-group" data-toggle="buttons">
					  <label class="btn btn-primary">
					    <input type="checkbox" checked> ���ɻ�1
					  </label>
					</div>
					<div class="btn-group" data-toggle="buttons">
					  <label class="btn btn-primary">
					    <input type="checkbox" checked> ���ɻ�2
					  </label>
					</div>
					<div class="btn-group" data-toggle="buttons">
					  <label class="btn btn-primary">
					    <input type="checkbox" checked> ���ɻ�3
					  </label>
					</div>
					<div class="btn-group" data-toggle="buttons">
					  <label class="btn btn-primary">
					    <input type="checkbox" checked> ���ɻ�4
					  </label>
					</div>
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