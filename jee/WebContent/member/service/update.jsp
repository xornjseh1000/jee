<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="member.MemberServiceImpl"%>
<%@ page import="member.MemberService"%>
<%@ page import="member.MemberBean"%>
        <%String ctx = application.getContextPath(); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보 수정</title>
<link rel="stylesheet" href="<%=ctx%>/css/member.css" />

<style type="text/css">
span.meta{width: 200px;background-color:yellow;float: left}
div.joinDiv{border:1px dotted gray;width: 80%;margin:10px 50px 10px 50px}	
</style>
</head>
<body>
<% MemberService service = MemberServiceImpl.getInstance();
MemberBean member = service.findById(request.getParameter("id"));%>
	<div class="box">
		<h1>회원정보 변경 (비번)</h1> 
		<form action="<%=ctx %>/member/result/update_result.jsp" method = "post">
	  	 	
			<table id="member_detail">
		<tr>
			<td rowspan="3" style="width:60%">
				<img src="<%=ctx %>/img/<%=member.getId()%>.jpg" alt="W3Schools.com" width="400" height="350">
			</td>
			<td class="font_bold bg_color" style="width:20%">ID</td>
			<td style="width:40%"><%=member.getId()%></td>
		</tr>
		<tr>
			<td class="font_bold bg_color">비밀번호</td>
			<td>
			<input type="text" name="pw" value="<%=member.getPw()%>" />
			</td>
		</tr>
		<tr>
			<td class="font_bold bg_color">이 름</td>
			<td><%=member.getName()%></td>
		</tr>
		<tr>
			<td class="font_bold bg_color">성 별</td>
			<td colspan="2"><%=member.getGender()%></td>
		</tr>
		<tr>
			<td class="font_bold bg_color">email</td>
			<td colspan="2">
			<input type="text" name="email" value="<%=member.getEmail()%>" />
			</td>
		</tr>
		<tr>
			<td class="font_bold bg_color">생년월일</td>
			<td colspan="2"><%=member.getSsn().substring(0,6)%></td>
		</tr>
		<tr>
			<td class="font_bold bg_color">등록일</td>
			<td colspan="2"><%=member.getRegDate()%></td>
		</tr>
	</table>
	
		<input type="hidden" name="id" value="<%=service.show().getId() %>" />
		<input type="submit" value="확인" />
		
		<input type="reset" value="취소" />
			</form>
	</div>

</body>
</html>