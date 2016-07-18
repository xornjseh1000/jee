<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%String ctx=application.getContextPath();%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<link rel="stylesheet" href="<%=ctx %>/css/member.css" />

</head>
<body>
	<div class="box">
		<h1>내 정보 보기</h1> <br>
		
		<img src="<%=ctx %>/member2/img/bbo.jpg" alt="bbo.com" width="250" 
			height="300">
			<br />
	<a href="<%=ctx %>/index.jsp">
		<img src="<%=ctx %>/member2/img/home.png" alt="home" style="width: 30px"/>
	</a>
	<a href="<%=ctx %>/member/member_controller.jsp">
		<img src="<%=ctx %>/member2/img/member.png" alt="member" style="width: 60px"/>
	</a>
		
	</div>
</body>
</html>