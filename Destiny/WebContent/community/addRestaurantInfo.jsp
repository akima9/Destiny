<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>�츮���� �����</title>
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script type="text/javascript" src="../se2/js/service/HuskyEZCreator.js" charset="utf-8"></script>
<script type="text/javascript">
	$(function(){
		$("#save").on("click",function(){
			oEditors.getById["ir1"].exec("detail", []);
			$("form").attr("method","POST").attr("action","/info/addRestaurantInfo").submit();
		});
	});
</script>
</head>
<body>
	<h1>addRestaurantInfo.jsp</h1>
	<form>
		<table width="100%">
			<tr>
				<td>����</td>
				<td><input type="text"></td>
			</tr>
			<tr>
				<td>����</td>
				<td><textarea name="ir1" id="ir1" rows="10" cols="100">�����Ϳ� �⺻���� ������ ��(���� ���)�� ���ٸ� �� value ���� �������� �����ø� �˴ϴ�.</textarea></td>
			</tr>
			<tr>
				<td><input type="button"  id="save" value="Ȯ��"></td>
			</tr>
		</table>
	</form>
</body>
<script type="text/javascript">
	var oEditors = [];
	$(function(){
		nhn.husky.EZCreator.createInIFrame({
		    oAppRef: oEditors,
		    elPlaceHolder: "ir1", //textarea���� ������ id�� ��ġ�ؾ� �Ѵ�.
		    sSkinURI: "../se2/SmartEditor2Skin.html", //SmartEditor2Skin.html ������ �����ϴ� ���
		    htParams : {
		    	bUseToolbar : true, //���� ��� ����(true : ��� / false : ���X)
		    	bUseVerticalResizer : true, //�Է�â ũ�� ������ ��� ����( true : ��� / false : ���X)
		    	bUseModeChanger : true, //��� ��(Editor | HTML | TEXT) ��� ���� (true : ��� / false : ���X)
		    	fOnBeforeUnload : function(){
		    		
		    	}
		    },
		    fCreator: "createSEditor2"
		});	
	});
</script>
</html>