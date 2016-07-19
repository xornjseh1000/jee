<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="member.MemberServiceImpl"%>
<%@ page import="member.MemberService"%>
<%@ page import="member.MemberBean"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<title>내정보보기</title>
<link rel="stylesheet" href="<%=ctx %>/css/member.css" />
	<style>
		#member_detail{border: 1px solid gray;width:90%;height: 400px;margin: 0 auto;border-collapse: collapse;}
		#member_detail tr{border: 1px solid gray;height: 20%}
		#member_detail td{border: 1px solid gray;}
		.font_bold{font-weight:bold;}
		.bg_color{background-color: yellow}
</style>
</head>
<body>
	<%
		MemberService service = MemberServiceImpl.getInstance();
		MemberBean member = service.show();
	    String id = request.getParameter("id");
	    String pw = request.getParameter("pw");
if(member.getId().equals("")){
%> 		<h2>내정보보기(detail) 실패</h2>
<%		response.sendRedirect(ctx+"/member/service/login.jsp");		
	} 
%>
		<h1>내정보보기(detail)</h1>
		<table id="member_detail">
		<tr>
			<td rowspan="4" style="width:30%">
				<img src="<%=ctx %>/member2/img/<%=member.getId()%>.jpg" alt="" width="450" height="250">
			</td>
			<td class="font_bold bg_color" style="width:20%">ID</td>
			<td style="width:40%"><%=member.getId()%></td>
		</tr>

	<tr>
		<td class="font_bold bg_color_yellow">이 름</td>
		<td><%=member.getName()%></td>
	</tr>
	<tr>
		<td class="font_bold bg_color_yellow">성 별</td>
		<td><%=member.getGender()%></td>
	</tr>
	
	<tr>
		<td class="font_bold bg_color_yellow">생년월일</td>
		<td colspan="2"><%=member.getSsn().substring(0, 6)%></td>
	</tr>
	<tr>
		<td class="font_bold bg_color_yellow">등록일</td>
		<td colspan="2"><%=member.getRegDate()%></td>
	</tr>

</table>

</body>
</html>