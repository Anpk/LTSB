function release_Check() {
	var product_Name = document.getElementById("product_Name");
	var order_Date = document.getElementById("order_Date");
	var destination = document.getElementById("destination");
	var delivery_Amount = document.getElementById("delivery_Amount");
	var charge1     = document.getElementById("charge1");
	
	if(product_Name.value.trim() == '') {
		alert("제품명을 입력해주세요");
		product_Name.select();
		product_Name.focus();
		
		return false;
	}
	
	if(order_Date.value.trim() == '') {
		alert("주문하신 날짜를 선택해주세요");
		order_Date.select();
		order_Date.focus();
		
		return false;
	}
	
	if(destination.value.trim() == '') {
		alert("목적지 주소를 입력해주세요");
		destination.select();
		destination.focus();
		
		return false;
	}
	
	if(delivery_Amount.value.trim() == '') {
		alert("수량을 입력해주세요");
		delivery_Amount.select();
		delivery_Amount.focus();
		
		return false;
	}
	
	if(charge1.value.trim() == '') {
		alert("로그인 해주세요");
		product_Name.select();
		product_Name.focus();
		
		return false;
	}
	
	if(product_Name.value.length < 1 || product_Name.value.length > 20) {
		alert("제품명은 0~20 글자 사이로 입력해주세요");
		product_Name.select();
		product_Name.focus();
		
		return false;
	}
	
	if(destination.value.length < 1 || destination.value.length > 100) {
		alert("주소는 0~100 글자 사이로 입력해주세요");
		destination.select();
		destination.focus();
		
		return false;
	}
 	
 	return true;
}