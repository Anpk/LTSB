<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>출고 기록 작성 Form</title>
</head>

<script src="script/release_Log_Validation.js"></script>

<body>

<h2>[ 출고 기록 작성 Form ]</h2>
<form id="form" action="release_Log_Form_1" method="post" >
	<table border="1">
		<tr>
			<th>product_Name</th>
			<td>
				<input id="product_Name" type="text" name="product_Name"/>
			</td>
		</tr>
		<tr>
			<th>order_Date</th>
			<td>
			<input id="order_Date" type="date" name="order_Date" />
			</td>
		</tr>
		<tr>
			<th>destination</th>
			<td>
				<input id="destination" type="text" name="destination" />
			</td>
		</tr>
		<tr>
			<th>delivery_Amount</th>
			<td>
				<input id="delivery_Amount" type="number" name="delivery_Amount" />
			</td>
		</tr>
		<tr>
			<th>charge1</th>
			<td>
				<input id="charge1" type="text" name="charge1">
				<!-- 로그인 한 사람의 정보가 넘어가도록 변경해야함 + readonly="readonly" 추가 -->
			</td>
		</tr>
		<tr>
			<th colspan="2">
				<input type="submit" value="다음 단계" onclick="return release_Check()" />
				<input type="reset" value="지우기" />
			</th>
		</tr>
	</table>
</form>

</body>
</html>