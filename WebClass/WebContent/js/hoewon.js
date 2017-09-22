$(document).ready(function() {
	 $('#Form').submit(function (event) {
		 //submit 되는 것을 막기
		 event.preventDefault();	
		 
		var name = $("#name").val();
		console.log(name);
	 
	 //서버 post방식 전송
	 $.post("http://httpbin.org/post", 
				{name : name},
				function(data){
					//서버로부터 응답을 받으면
					var myModal = $('#myModal');
					myModal.modal();
					myModal.find('.modal-body').text(data.form.name + '님 회원가입 되었습니다.')
				});
	 });
  });