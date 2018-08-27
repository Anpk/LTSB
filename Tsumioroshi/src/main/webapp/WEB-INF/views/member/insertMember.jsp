<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="resources/script/jquery-3.3.1.min.js"></script>
<script>
	$(function(){
		$('#userid').on('keyup', idCheck);
		$('#create').on('click', insertMember);
		
	});
	
	function idCheck(){
		var userid = $('#userid').val();
		
		if(userid.length <= 3 || userid.length > 20){
			$('.resulttext').html('아이디는 4자리 이상 20자리 이하만 사용 가능 합니다');
		}else{
			$.ajax({
				url: 'idCheck',
				type: 'post',
				data: {
					id: userid
				},
				success: function(resp){
					if(resp == 'true'){
						$('.resulttext').html('사용 가능 합니다');
					}
					if(resp == 'false'){
						$('.resulttext').html('사용 불가능 합니다');
					}
				}
			});
		}
	}
	
	function insertMember(){
		var userid = $('#userid').val();
		var userpwd = $('#userpwd').val();
		var userauth = $('#userauth').val();
		
		$.ajax({
			url: 'insertMember',
			type: 'post',
			data: {
				id: userid,
				password: userpwd,
				authority: userauth
			},
			success: function(resp){
				
			}
		});
	}
	
</script>
</head>
<body>
<form>
	<h4>관리자 생성</h4>
	<p>ID: <input type="text" id="userid">  <span class="resulttext"></span></p>
	<p>PASSWORD: <input type="text" id="userpwd"></p>
	<p>AUTHORITY: <select id="userauth">
		<option value="OfficeWork">사무관리자</option>
		<option value="WareHouse">창고관리자</option>
		</select></p>
		<input id="create" type="button" value="생성">
		 
</form>
</body>
</html>