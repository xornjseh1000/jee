<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="member.MemberBean" %>     
<%@ page import="member.MemberService" %>     
<%@ page import="member.MemberServiceImpl" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<link rel="stylesheet" href="<%=ctx%>/css/global.css" />
</head>
<body>
<% MemberService service = MemberServiceImpl.getInstance();
MemberBean member = service.findById(request.getParameter("id"));%>
	<div class="box">
		<h1>탈퇴</h1>
			<form action="<%=ctx %>/member/result/delete_result.jsp" method="post">
			<div> 탈퇴 하려면 비번을 입력하세요	</div>
			<input type="text"name="confpw" value="" /> 
	
		<input type="hidden" name="pw" value="<%=service.show().getPw() %>" />
		<input type="hidden" name="id" value="<%=service.show().getId() %>" />
		<input type="submit" value="탈퇴" />
		<input type="reset" value="취소" /><br />
		
		</form>
		
		
		
		<a href="<%=ctx%>/index.jsp"> <img
			src="<%=ctx%>/member2/img/home.png" alt="home" style="width: 30px" />
		</a> <a href="<%=ctx%>/member/member_controller.jsp"> <img
			src="<%=ctx%>/member2/img/member.png" alt="member"
			style="width: 60px" />
		</a>
	</div>

</body>
</html>