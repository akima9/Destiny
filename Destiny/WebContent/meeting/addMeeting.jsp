<%@ page contentType="text/html; charset=euc-kr" %>
<%@ page pageEncoding="EUC-KR"%>

<!DOCTYPE html>
<html>

<head>
	<meta charset="EUC-KR">
	
	
	<!-- ���� : http://getbootstrap.com/css/   ���� -->
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	
	<!--  ///////////////////////// Bootstrap, jQuery CDN ////////////////////////// -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" >
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" >
	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" ></script>
	
	<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
	<!--  ///////////////////////// CSS ////////////////////////// -->
	<style>
       body > div.container{
        	border: 3px solid #D6CDB7;
            margin-top: 10px;
        }
    </style>

     <!--  ///////////////////////// JavaScript ////////////////////////// -->
	<script type="text/javascript">
	
	function fncAddProduct(){
		//Form ��ȿ�� ����

		/* 
		var metaKey=$("input[name='metaKey']").val();
		var name=$("input[name='prodName']").val();
		var detail=$("textarea[name='prodDetail']").val();
		var manuDate=$("input[name='manuDate']").val();
		var price=$("input[name='price']").val();	
		
		//var quantity = document.detailForm.quantity.value;
		
		var quantity=$("input[name='quantity']").val();
	
		
		if(metaKey == null || metaKey.length<1){
			alert("��ŸŰ�� �ݵ�� �Է��Ͽ��� �մϴ�.");
			return;
		}
		if(name == null || name.length<1){
			alert("��ǰ���� �ݵ�� �Է��Ͽ��� �մϴ�.");
			return;
		}
		if(detail == null || detail.length<1){
			alert("��ǰ�������� �ݵ�� �Է��Ͽ��� �մϴ�.");
			return;
		}
		if(manuDate == null || manuDate.length<1){
			alert("�������ڴ� �ݵ�� �Է��ϼž� �մϴ�.");
			return;
		}
		if(price == null || price.length<1){
			alert("������ �ݵ�� �Է��ϼž� �մϴ�.");
			return;
		}
		if(quantity == null || quantity.length<1){
			alert("������ �ݵ�� �Է��ϼž� �մϴ�.");
			return;
		}
		
		if($('#priceWirte').text() != "" && $('#priceWirte').text() != null){
			alert("�߸��� �����Է��Դϴ�.");
			return;
		}
		if($('#quantityWirte').text() != "" && $('#quantityWirte').text() != null){
			alert("�߸��� �����Է��Դϴ�.");
			return;
		}
		if($('#metaKeyWirte').text() != "" && $('#metaKeyWirte').text() != null){
			alert("�߸��� ��ŸŰ�Է��Դϴ�.");
			return;
		} */
		
		$("form").attr("method" , "POST").attr("enctype","multipart/form-data").attr("action" , "/meeting/addMeeting").submit();
	}
	
	$(function() {
		//==> DOM Object GET 3���� ��� ==> 1. $(tagName) : 2.(#id) : 3.$(.className)
		//==> 1 �� 3 ��� ���� : $("tagName.className:filter�Լ�") �����.	
		 $( "button.btn.btn-primary" ).on("click" , function() {
			//Debug..
			//alert(  $( "td.ct_btn01:contains('���')" ).html() );
			fncAddProduct();
		});
	});
	
	$(function() {
		//==> DOM Object GET 3���� ��� ==> 1. $(tagName) : 2.(#id) : 3.$(.className)
		//==> 1 �� 3 ��� ���� : $("tagName.className:filter�Լ�") �����.	
		 $( "a[href='#' ]" ).on("click" , function() {
				//Debug..
				//alert(  $( "a[href='#' ]" ).html() );
				//$("form")[0].reset();
				 self.location = "/product/listProduct?menu=search";
		});
	});	
	 
	//=====================================���� / ���� üũ===============================
	
	$(function() {
		
		$('input[name="price"]').on("keyup", function(){
			
			var price = $('input[name="price"]').val();
			
			if(parseInt(price) <= 0){
				//alert("�˳�");
				$('input[name="price"]').css('background-color','pink');
				$('#priceWirte').text("������ 0�����Դϴ�.");
			} else if (parseInt(price) >= 0 || price == null || price == "") {
				$('#priceWirte').text("");
				$('input[name="price"]').css('background-color','white');
			}
		});
	});
	
	$(function() {
		
		$('input[name="quantity"]').on("keyup", function(){
		
			var quantity = $('input[name="quantity"]').val();
			
			if(parseInt(quantity) <= 0){
				$('input[name="quantity"]').css('background-color','pink');
				$('#quantityWirte').text("������ 0�����Դϴ�.");
			} else if (parseInt(quantity) >= 0 || quantity == null || quantity == "") {
				$('#quantityWirte').text("");
				$('input[name="quantity"]').css('background-color','white');
			}
			
			
			
		});
	});
	
	$(function(){
		$('input[name="metaKey"]').on("keyup", function(){
			
			var metaKey = $('input[name="metaKey"]').val();
			
			metaKey = parseInt(metaKey);
			
			//String�� parseInt�Ǹ� NAN�� ������� �̿��� ���� ����
			if(metaKey != $('input[name="metaKey"]').val()){
				$('input[name="metaKey"]').css('background-color','pink');
				$('#metaKeyWirte').text("�߸��� ������ Ÿ���Դϴ�. ���ڸ� �Է��ϼ���.");
			} else if(metaKey == $('input[name="metaKey"]').val()) {
				//alert(metaKey);
				$('input[name="metaKey"]').css('background-color','white');
				$('#metaKeyWirte').text("");
				
				//������ metaKey�� �̹� �ִ��� Ȯ��
				$.ajax({
					url : "/product/json/getProductByMetaKey/"+metaKey,
					method : "GET",
					dataType : "json",
					headers :{
						"Accept" : "application/json",
						"Content-Type" : "application/json"
					},
					success : function(JSONData , status) {
						//alert(JSONData.product);
						if(JSONData.product != null){
							$('input[name="metaKey"]').css('background-color','pink');
							$('#metaKeyWirte').text("�̹� �����ϴ� ��ŸŰ�Դϴ�.");
						}
					}, 
					error : function(what){
						$('input[name="metaKey"]').css('background-color','white');
						$('#metaKeyWirte').text("");
					}
				});
			}
		});
	});
	

	 $( function() {
		    $( "#manuDate" ).datepicker();
	});
	 
	
	
	</script>
	</head>
	
	<body>
   	<!--  ȭ�鱸�� div Start /////////////////////////////////////-->
	<div class="container">
   		<h1 class="bg-primary text-center">�����ϱ�</h1>
   	
   		<!-- form Start /////////////////////////////////////-->
		<form class="form-horizontal">
		
		 <div class="form-group col-sm-4 col-md-4">
		 	<select class="form-control" name="category">
		 		<option value="">���ɻ�</option>
		 	</select>
		 </div>
		
		 <div class="form-group col-sm-8 col-md-8">
		 	<input type="text" class="form-control" placeholder="���ɻ縦 ������ �ּ���">
		 </div>
		 
		 <div class="form-group col-sm-4 col-md-4">
		 	<select class="form-control" name="category">
		 		<option value="">�߽�����</option>
		 	</select>
		 </div>
		
		 <div class="form-group col-sm-8 col-md-8">
		 	<input type="text" class="form-control" placeholder="���������� �Է����ּ���">
		 </div>
		 
		 <div class="form-group col-sm-10 col-md-10">
		 	<input type="text" class="form-control" placeholder="��ǥ�̹����� �����Ͽ� �ּ���">
		 </div>
		 
		 <div class="form-group col-sm-2 col-md-2">
		 	<button type="button" class="btn btn-warning">÷������</button>
		 </div>
		 
		 <div class="form-group col-sm-12 col-md-12">
		 	<input type="text" class="form-control" placeholder="�����̸��� �����ּ���">
		 </div>
		 
		 <div class="form-group col-sm-12 col-md-12">
		 	<textarea class="form-control" cols="100" rows="3" 
		 	placeholder="� �������� �������ּ���"></textarea>
		 </div>
		 
		 <div class="form-group col-sm-12 col-md-12">
		 	<textarea class="form-control" cols="100" rows="3" 
		 	placeholder="���ӿ� ��Ģ�� �ֳ���? �ִٸ� ������ �����ּ���"></textarea>
		 </div>
		 
		 <div class="form-group col-sm-10 col-md-10">
		 	�����ο��� �Է��Ͽ� �ּ���
		 </div>
		
		 <div class="form-group col-sm-2 col-md-2">
		 	<select class="form-control">
		 		<option value="">1</option>
		 	</select>
		 </div>
		 
		 <div class="form-group col-sm-4 col-md-4">
		 	<select class="form-control">
		 		<option value="">�ݺ�����</option>
		 		<option value="">�ݺ�</option>
		 		<option value="">�ѹ�</option>
		 	</select>
		 </div>
		 
		 <div class="form-group col-sm-4 col-md-4">
		 	<select class="form-control">
		 		<option value="">���ӳ�¥or����</option>
		 	</select>
		 </div>
		 
		 <div class="form-group col-sm-4 col-md-4">
		 	<select class="form-control">
		 		<option value="">���ӽð�</option>
		 	</select>
		 </div>
		 
		 <div class="form-group col-sm-10 col-md-10">
		 	ȸ�� �ִٸ� �Է����ּ���
		 </div>
		 
		 <div class="form-group col-sm-2 col-md-2">
		 	<input type="text" class="form-control" placeholder="$">
		 </div>
		 
		 <div class="form-group col-sm-10 col-md-10">
		 	<input type="text" class="form-control" placeholder="������Ҹ� �Է��Ͽ��ּ���.">
		 </div>
		 
		 <div class="form-group col-sm-2 col-md-2">
		 	<button type="button" class="btn btn-warning">����˻�</button>
		 </div>
		  
		 <div class="form-group">
		   <div class="col-sm-offset-4  col-sm-4 text-center">
		     <button type="button" class="btn btn-primary"  >�� &nbsp;��</button>
			 <a class="btn btn-primary btn" href="#" role="button">��&nbsp;��</a>
		   </div>
		 </div>
	</form>
 	</div>
	<!--  ȭ�鱸�� div end /////////////////////////////////////-->
	
</body>

</html>	
	