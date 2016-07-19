<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="member.MemberServiceImpl"%>
<%@ page import="member.MemberService"%>
<%@ page import="member.MemberBean"%>

<!doctype html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<title>회원가입</title>
<link rel="stylesheet" href="<%=ctx%>/css/member.css" />

<style type="text/css">
span.meta {
	width: 200px;
	background-color: yellow;
	float: left;
	text-align: left
}

div.joinDiv {
	border: 1px dotted gray;
	width: 80%;
	margin: 10px 50px 10px 50px
}
</style>
</head>
<body>
	<div class="box">
		<%
			MemberService service = MemberServiceImpl.getInstance();
			MemberBean member = new MemberBean();
			String name = "", id = "", pw = "", ssn = "";
			name = request.getParameter("name");
			id = request.getParameter("id");
			pw = request.getParameter("pw");
			ssn = request.getParameter("ssn");
			if (name.equals("") || id.equals("") || pw.equals("") || ssn.equals("")) {
		%>
		<h2>가입실패!!</h2>
		<a href="<%=ctx%>/member/service/regist.jsp"></a>
		<%
			} else {
				member.setId(id);
				member.setPw(pw);
				member.setName(name);
				member.setSsn(ssn);
				name = service.regist(member);
			}
		%>
		
				
		회원가입을 축하드립니다
		<%=request.getParameter("name")%>
		님
		
			
		
		
		
	  <span class = "meta">이름</span>   <%=request.getParameter("name") %><br />
	   <span class = "meta">ID</span>   <%=request.getParameter("id") %><br />
	   <span class = "meta">비밀번호</span> <%=request.getParameter("pw") %><br />
	  <span class = "meta">SSN</span>  <%=request.getParameter("ssn") %><br />
	 
		<% 
			String[] subjects = request.getParameterValues("subject");
			if(subjects != null){
				for(int i=0; i<subjects.length; i++){
			%>
					<%=subjects[i] %> 
			<% 
				}
			}
			%>
	


		<a href="<%=ctx%>/index.jsp"> <img
			src="<%=ctx%>/member2/img/home.png" alt="home" style="width: 30px" />
		</a> <a href="<%=ctx%>/member_controller.jsp"> <img
			src="<%=ctx%>/member2/img/member.png" alt="member"
			style="width: 60px" />
		</a>

	</div>

</body>
</html>