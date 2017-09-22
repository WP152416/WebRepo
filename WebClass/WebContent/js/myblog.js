/**
 * 
 */
  $(document).ready(function() {
	 $('#loginForm').submit(function (event) {
		 //submit 되는 것을 막기
		 event.preventDefault();	
		 
		//id,pw 값 가져오기 
		var id = $("#id").val();
		var pw = $("#pw").val();
		console.log(id,pw);
	 
	 //서버 post방식 전송
	 $.post("http://httpbin.org/post", 
				{id : id, pw : pw},
				function(data){
					//서버로부터 응답을 받으면
					//alert(data.form.id + '님 로그인되었습니다.');
					var myModal = $('#myModal');
					myModal.modal();
					myModal.find('.modal-body').text(data.form.id + '님 로그인되었습니다.')
				});
	 });
  });