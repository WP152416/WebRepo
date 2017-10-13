<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "org.dimigo.vo.UserVO" %>
<!DOCTYPE html>
<html lang="ko">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<title>MyBlog</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
  
  
  <script>
  function menu_over(e){
	  e.setAttribute("class", "nav-item active");  // <li class="nav-item">
  }
  function menu_out(e){
	  e.setAttribute("class", "nav-item");  // <li class="nav-item">
  }
  </script>
  
  </head>
  <body>
      <script type="text/javascript" src="myblog.js"></script>
  <nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#" >MyBlog</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item" onmouseover="menu_over(this);" onmouseout="menu_out(this);">
        <a class="nav-link" href="iam.html">I am... <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item" onmouseover="menu_over(this);" onmouseout="menu_out(this);">
        <a class="nav-link" href="dream.html">Dream</a>
      </li>
      <li class="nav-item" onmouseover="menu_over(this);" onmouseout="menu_out(this);">
        <a class="nav-link" href="like.html">Like</a>
      </li>
    </ul>
    
    <%-- 세션이 없는 경우 --%>
    <%
    	UserVO user = (UserVO) session.getAttribute("user");
    	if(user == null){
    	
    	
    %>	
    <a class="text-bold text-black" style="text-decoration: none" href="/WebClass/bloglogin">Sign in</a>
    	<span class="text-bold text-black">&nbsp; or &nbsp;</span>
   	<a class="text-bold text-black" style="text-decoration: none" href="/WebClass/signup">Sign up</a>	
    <% } else{ %>
    <%-- 세션이 있는 경우 --%>
	    <ul class="navbar-nav flex-row ml-md-auto d-none d-md-flex">
	    <li class="nav-item dropdown"> 
	      <a class="nav-item nav-link dropdown-toggle mr-md-2" href="#" id="bd-versions" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
	    	이부경님
	      </a>
	      <div class="dropdown-menu dropdown-menu-right" aria-labelledby="bd-versions">
	      	<form action = "/WebClass/bloglogout" method = "post">
	      	<button type="submit" class="dropdown-item" href = "/WebClass/bloglogout">Sign out</button>
	      	</form>
	    </li>
	    </ul>
	    <% } %>
    
  </div>
  	
</nav>
<div class="container" style = "color : black; padding : 30px;">
<blockquote class="blockquote text-right">
  <p class="mb-0">
  <h1>Hello!</h1>
    <p>
   My name is Lee Bugyeong and  Welcome to my blog.<br>
    <br>
    </p>
</blockquote>
</div>
   
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.min.js" ></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
  
  <script src="../js/myblog.js"></script>

  </body>
</html>