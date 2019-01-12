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
			$( "#city" ).on("change" , function() {
				var idx = $("#city").index(this);
				var city = $(this).val();
				
				alert(city + idx);
				
				$.ajax( 
						{
							url : "/user/json/getLocationList/"+city ,
							method : "GET" ,
							dataType : "json" ,
							headers : {
								"Accept" : "application/json",
								"Content-Type" : "application/json"
							},
							success : function(JSONData , status) {
								alert("����?");
								var list="";
								for(i in JSONData.list){
									var town = JSONData.list[i].townName;
									list+="<option value='"+town+"'>"+town+"</option>";
							}
								$( "#town:eq("+idx+")" ).empty().append(list);
							},
							error : function(what){
								alert("town ERROR" + what);
							}
						});
				});
			
			});
		
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
					<select class="form-control" id="city">
						<option value="">��/�ø� ������ �ּ���</option>
				      	<option value="����">����</option>
				      	<option value="���">���</option>
				      	<option value="��õ">��õ</option>
				      	<option value="�λ�">�λ�</option>
				      	<option value="�뱸">�뱸</option>
				      	<option value="����">����</option>
				      	<option value="����">����</option>
				      	<option value="���">���</option>
				      	<option value="����">����</option>
				      	<option value="����">����</option>
				      	<option value="�泲">�泲</option>
				      	<option value="���">���</option>
				      	<option value="����">����</option>
				      	<option value="����">����</option>
				      	<option value="�泲">�泲</option>
				      	<option value="���">���</option>
				      	<option value="����">����</option>
				      </select>
				      
					<select class="form-control" id="town" name="town">
		      	<c:forEach var="location" items="${list}">
					<option value="${location.townName}">${location.townName}</option>
				</c:forEach>
		      </select>
				</div>
			</div>
			
			<hr/>
			
			<div class="row">
		  		<div class="col-xs-4 col-md-2"><strong>���ɻ�</strong></div>
				<div class="col-xs-8 col-md-4">
					<input type="checkbox" name="selectInterest" value="10000">�ƿ�����/����
					<input type="checkbox" name="selectInterest" value="10001">�/������
					<input type="checkbox" name="selectInterest" value="10002">�ι���/å/��
					<br/><br/>
					<input type="checkbox" name="selectInterest" value="10003">����/����
					<input type="checkbox" name="selectInterest" value="10004">�ܱ�/���
					<input type="checkbox" name="selectInterest" value="10005">��ȭ/����/����
					<br/><br/>
					<input type="checkbox" name="selectInterest" value="10006">����/�Ǳ�
					<input type="checkbox" name="selectInterest" value="10007">����/�����
					<input type="checkbox" name="selectInterest" value="10008">��/����
					<br/><br/>
					<input type="checkbox" name="selectInterest" value="10009">����Ȱ��
					<input type="checkbox" name="selectInterest" value="10010">�米/�θ�
					<input type="checkbox" name="selectInterest" value="10011">��/�������
					<br/><br/>
					<input type="checkbox" name="selectInterest" value="10012">����/����
					<input type="checkbox" name="selectInterest" value="10013">�߱�����
					<input type="checkbox" name="selectInterest" value="10014">����/����
					<br/><br/>
					<input type="checkbox" name="selectInterest" value="10015">�丮/����
					<input type="checkbox" name="selectInterest" value="10016">�ݷ�����
					<input type="checkbox" name="selectInterest" value="10017">����/��ȥ
					<br/><br/>
					<input type="checkbox" name="selectInterest" value="10018">�Բ��ؿ�
					<br/><br/>
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