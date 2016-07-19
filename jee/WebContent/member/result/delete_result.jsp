<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="member.MemberServiceImpl"%>
<%@ page import="member.MemberService"%>
<%@ page import="member.MemberBean"%>

<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
</head>
<body>
	<%
		MemberService service = MemberServiceImpl.getInstance();
		MemberBean member = new MemberBean();
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		application.log("넘어온ID:"+id);
		application.log("넘어온PW:"+pw);
		response.sendRedirect(ctx+"/member/index.jsp");
		if(pw==""){
			%>
			<h2>로그인실패!</h2>
			<a href="<%=ctx %>/member/service/delete.jsp">다시 시도하기</a>
	<%
		}else{
			
			member.setPw(pw);
			String name = service.delete(id);
			application.log("DB다녀온 이름:"+name);
		}
	%>
</body>
</html>