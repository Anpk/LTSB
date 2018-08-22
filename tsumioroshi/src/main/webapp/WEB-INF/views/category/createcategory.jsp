<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<style type="text/css">
.left-div{
	float:left;
	width: 50%;
}

.right-div{
	float: right;
	width: 50%;
}
</style>
<script src="resources/script/jquery-3.3.1.min.js"></script>
<script>
	$(function(){
		init();
		$('#createfirst').on('click', selectByNameFirst);
		$('#createsecond').on('click', selectByNameSecond);
		$('#search').on('click', selectByFcCodeSecond);
		
	});
	
	
function init(){
	$.ajax({
		url: 'selectAllFirst',
		type: 'post',
		success: function(resp){
			listFirst(resp);
		}
	});
}
	
function selectByNameFirst(){
	var first = $('#first').val();
	
	$.ajax({
		url: 'selectByNameFirst',
		type: 'post',
		data: {
			fc_name: first
		},
		success: function(resp){
			
			if(!resp){
				createFirst();
			}
		}
	})
}

function selectByNameSecond(){
	var second = $('#second').val();
	var firstoption = $("#firstoption option:selected").val();
	
	$.ajax({
		url: 'selectByNameSecond',
		type: 'post',
		data: {
			fc_code: firstoption,
			sc_name: second
		},
		success: function(resp){
			
			if(!resp){
				createSecond();
			}
		}
	})
}

function selectByFcCodeSecond(){
	var firstoption = $('#firstoption option:selected').val();
	
	$.ajax({
		url: 'selectByFcCodeSecond',
		type: 'post',
		data: {
			fc_code: firstoption
		},
		success: function(resp){
			listSecond(resp);
		}
	});
}

function createFirst(){
	var first = $('#first').val();
	
	$.ajax({
		url: 'createFirst',
		type: 'post',
		data: {
			fc_name: first
		},
		success: function(resp){
			init();
		}
	});
}

function createSecond(){
	var second = $('#second').val();
	var firstoption = $("#firstoption option:selected").val();
	
	$.ajax({
		url: 'createSecond',
		type: 'post',
		data: {
			fc_code: firstoption,
			sc_name: second
		},
		success: function(resp){
			$.ajax({
				url: 'selectSecond',
				type: 'post',
				data: {
					fc_code: firstoption
				},
				success: function(resp2){
					listSecond(resp2);
				}
			});
		}
	})
}

function listFirst(resp){
	var result ='';
	var options ='';
	
	result += '<h4>[��з�]</h2>';
	result += '<table border="1"';
	result += '<tr>';
	result += '<th>��з� ��</th>';
	result += '<th>��з� �ڵ�</th>';
	result += '</tr>';
	
	for(var i in resp){
		result += '<tr>';
		result += '<td>'+resp[i].fc_name+'</td>';
		result += '<td>'+resp[i].fc_code+'</td>';
		result += '</tr>';
		
		options += '<option value="'+resp[i].fc_code+'">'+resp[i].fc_name+'</option>';
		
	}
	
	result += '</table>';
	
	$('#firstlist').html(result);
	$('#firstoption').html(options);
}

function listSecond(resp){
	var result = '';
	result += '<h4>[�Һз�]</h2>';
	result += '<table border="1"';
	result += '<tr>';
	result += '<th>�Һз� ��</th>';
	result += '<th>�Һз� �ڵ�</th>';
	result += '</tr>';
	
	for(var i in resp){
		result += '<tr>';
		result += '<td>'+resp[i].sc_name+'</td>';
		result += '<td>'+resp[i].sc_code+'</td>';
		result += '</tr>';
	}
	$('#secondlist').html(result);
}


</script>
</head>
<body>
<div class="left-div">
	<div>
		<h2>first_category</h2>
		<form>
			<p>������ ��з���: <input id="first" type="text"></p>
			<input type="button" id="createfirst" value="����"></input>
		</form>
	</div>
	<div id="firstlist">
	</div>
</div>
<div class="right-div">
	<div>
		<h2>second_category</h2>
		<form>
		<p>��з� ����: <select id="firstoption"></select><input id="search" type="button" value="��ȸ"> </p>
			<p>������ �Һз���: <input id="second" type=text></p>
			<input id="createsecond" type="button" value="����">
		</form>
	</div>
	<div id="secondlist">
	</div>
</div>
</body>
</html>