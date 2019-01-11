<%@ page contentType="text/html; charset=euc-kr" %>
<%@ page pageEncoding="EUC-KR"%>

<!DOCTYPE html>
<html>

<head>
	<meta charset="EUC-KR">
	
	
	<!-- 참조 : http://getbootstrap.com/css/   참조 -->
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
		//Form 유효성 검증

		/* 
		var metaKey=$("input[name='metaKey']").val();
		var name=$("input[name='prodName']").val();
		var detail=$("textarea[name='prodDetail']").val();
		var manuDate=$("input[name='manuDate']").val();
		var price=$("input[name='price']").val();	
		
		//var quantity = document.detailForm.quantity.value;
		
		var quantity=$("input[name='quantity']").val();
	
		
		if(metaKey == null || metaKey.length<1){
			alert("메타키는 반드시 입력하여야 합니다.");
			return;
		}
		if(name == null || name.length<1){
			alert("상품명은 반드시 입력하여야 합니다.");
			return;
		}
		if(detail == null || detail.length<1){
			alert("상품상세정보는 반드시 입력하여야 합니다.");
			return;
		}
		if(manuDate == null || manuDate.length<1){
			alert("제조일자는 반드시 입력하셔야 합니다.");
			return;
		}
		if(price == null || price.length<1){
			alert("가격은 반드시 입력하셔야 합니다.");
			return;
		}
		if(quantity == null || quantity.length<1){
			alert("수량은 반드시 입력하셔야 합니다.");
			return;
		}
		
		if($('#priceWirte').text() != "" && $('#priceWirte').text() != null){
			alert("잘못된 가격입력입니다.");
			return;
		}
		if($('#quantityWirte').text() != "" && $('#quantityWirte').text() != null){
			alert("잘못된 수량입력입니다.");
			return;
		}
		if($('#metaKeyWirte').text() != "" && $('#metaKeyWirte').text() != null){
			alert("잘못된 메타키입력입니다.");
			return;
		} */
		
		$("form").attr("method" , "POST").attr("enctype","multipart/form-data").attr("action" , "/meeting/addMeeting").submit();
	}
	
	$(function() {
		//==> DOM Object GET 3가지 방법 ==> 1. $(tagName) : 2.(#id) : 3.$(.className)
		//==> 1 과 3 방법 조합 : $("tagName.className:filter함수") 사용함.	
		 $( "button.btn.btn-primary" ).on("click" , function() {
			//Debug..
			//alert(  $( "td.ct_btn01:contains('등록')" ).html() );
			fncAddProduct();
		});
	});
	
	$(function() {
		//==> DOM Object GET 3가지 방법 ==> 1. $(tagName) : 2.(#id) : 3.$(.className)
		//==> 1 과 3 방법 조합 : $("tagName.className:filter함수") 사용함.	
		 $( "a[href='#' ]" ).on("click" , function() {
				//Debug..
				//alert(  $( "a[href='#' ]" ).html() );
				//$("form")[0].reset();
				 self.location = "/product/listProduct?menu=search";
		});
	});	
	 
	//=====================================수량 / 가격 체크===============================
	
	$(function() {
		
		$('input[name="price"]').on("keyup", function(){
			
			var price = $('input[name="price"]').val();
			
			if(parseInt(price) <= 0){
				//alert("옹냥");
				$('input[name="price"]').css('background-color','pink');
				$('#priceWirte').text("가격이 0이하입니다.");
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
				$('#quantityWirte').text("수량이 0이하입니다.");
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
			
			//String은 parseInt되면 NAN을 출력함을 이용한 로직 구축
			if(metaKey != $('input[name="metaKey"]').val()){
				$('input[name="metaKey"]').css('background-color','pink');
				$('#metaKeyWirte').text("잘못된 데이터 타입입니다. 숫자만 입력하세요.");
			} else if(metaKey == $('input[name="metaKey"]').val()) {
				//alert(metaKey);
				$('input[name="metaKey"]').css('background-color','white');
				$('#metaKeyWirte').text("");
				
				//동일한 metaKey가 이미 있는지 확인
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
							$('#metaKeyWirte').text("이미 존재하는 메타키입니다.");
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
   	<!--  화면구성 div Start /////////////////////////////////////-->
	<div class="container">
   		<h1 class="bg-primary text-center">개설하기</h1>
   	
   		<!-- form Start /////////////////////////////////////-->
		<form class="form-horizontal">
		
		 <div class="form-group col-sm-4 col-md-4">
		 	<select class="form-control" name="category">
		 		<option value="">관심사</option>
		 	</select>
		 </div>
		
		 <div class="form-group col-sm-8 col-md-8">
		 	<input type="text" class="form-control" placeholder="관심사를 선택해 주세요">
		 </div>
		 
		 <div class="form-group col-sm-4 col-md-4">
		 	<select class="form-control" name="category">
		 		<option value="">중심지역</option>
		 	</select>
		 </div>
		
		 <div class="form-group col-sm-8 col-md-8">
		 	<input type="text" class="form-control" placeholder="모임지역을 입력해주세요">
		 </div>
		 
		 <div class="form-group col-sm-10 col-md-10">
		 	<input type="text" class="form-control" placeholder="대표이미지를 설정하여 주세요">
		 </div>
		 
		 <div class="form-group col-sm-2 col-md-2">
		 	<button type="button" class="btn btn-warning">첨부파일</button>
		 </div>
		 
		 <div class="form-group col-sm-12 col-md-12">
		 	<input type="text" class="form-control" placeholder="모임이름을 적어주세요">
		 </div>
		 
		 <div class="form-group col-sm-12 col-md-12">
		 	<textarea class="form-control" cols="100" rows="3" 
		 	placeholder="어떤 모임인지 설명해주세요"></textarea>
		 </div>
		 
		 <div class="form-group col-sm-12 col-md-12">
		 	<textarea class="form-control" cols="100" rows="3" 
		 	placeholder="모임에 규칙이 있나요? 있다면 간략히 적어주세요"></textarea>
		 </div>
		 
		 <div class="form-group col-sm-10 col-md-10">
		 	모임인원을 입력하여 주세요
		 </div>
		
		 <div class="form-group col-sm-2 col-md-2">
		 	<select class="form-control">
		 		<option value="">1</option>
		 	</select>
		 </div>
		 
		 <div class="form-group col-sm-4 col-md-4">
		 	<select class="form-control">
		 		<option value="">반복여부</option>
		 		<option value="">반복</option>
		 		<option value="">한번</option>
		 	</select>
		 </div>
		 
		 <div class="form-group col-sm-4 col-md-4">
		 	<select class="form-control">
		 		<option value="">모임날짜or요일</option>
		 	</select>
		 </div>
		 
		 <div class="form-group col-sm-4 col-md-4">
		 	<select class="form-control">
		 		<option value="">모임시간</option>
		 	</select>
		 </div>
		 
		 <div class="form-group col-sm-10 col-md-10">
		 	회비가 있다면 입력해주세요
		 </div>
		 
		 <div class="form-group col-sm-2 col-md-2">
		 	<input type="text" class="form-control" placeholder="$">
		 </div>
		 
		 <div class="form-group col-sm-10 col-md-10">
		 	<input type="text" class="form-control" placeholder="모임장소를 입력하여주세요.">
		 </div>
		 
		 <div class="form-group col-sm-2 col-md-2">
		 	<button type="button" class="btn btn-warning">우편검색</button>
		 </div>
		  
		 <div class="form-group">
		   <div class="col-sm-offset-4  col-sm-4 text-center">
		     <button type="button" class="btn btn-primary"  >등 &nbsp;록</button>
			 <a class="btn btn-primary btn" href="#" role="button">취&nbsp;소</a>
		   </div>
		 </div>
	</form>
 	</div>
	<!--  화면구성 div end /////////////////////////////////////-->
	
</body>

</html>	
	