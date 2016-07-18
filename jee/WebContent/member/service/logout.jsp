<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="member.MemberServiceImpl"%>
<%@ page import="member.MemberService"%>
<%@ page import="member.MemberBean"%>
<%String ctx = application.getContextPath();%>
<!doctype html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<title>Document</title>
</head>
<body>
<%
MemberService service = MemberServiceImpl.getInstance();
MemberBean member = new MemberBean();%>
	<form action="<%=ctx%>/logout.jsp" method="post">
		<input type="hidden" name="id" value="<%service.show().getId(); %>" /> 
		<input type="hidden"name="pw" value="<%service.show().getPw(); %>" /> 
		<input type="submit" value="로그아웃" />
	</form>
</body>
</html>