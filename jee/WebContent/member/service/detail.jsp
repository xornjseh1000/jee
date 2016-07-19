<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 상세정보</title>
<link rel="stylesheet" href="<%=ctx %>/css/member.css" />
<style>
	#member_detail{border: 1px solid gray;width:90%;height: 400px;margin:0 auto;border-collapse: collapse;}
	#member_detail tr{border: 1px solid gray;height: 20%}
	#member_detail tr td{border: 1px solid gray;}
	.font_bold{font-weight: bold;}
	.bg_color_yellow{background-color: yellow}
</style>
</head>
<body>
 <!-- id,birth,name,regDate,gender,profileImg -->
	<div class="box">
		<h1>회원 상세정보</h1> <br>
		
				<table id="member_detail">
			<tr>
				<td rowspan="3" style="width:30%">
					<img src="<%=ctx %>/member2/img/bbo.jpg" alt="bbo.com" width="250" 
			height="300">
				</td>
				<td style="width:20%" class="font_bold bg_color_yellow">ID</td>
				<td style="width:40%"></td>
			</tr>
			<tr>
				<td class="font_bold bg_color_yellow">이 름</td>
				<td></td>
			</tr>
			<tr>
				<td class="font_bold bg_color_yellow">성 별</td>
				<td></td>
			</tr>
			<tr>
				<td class="font_bold bg_color_yellow">생년월일</td>
				<td colspan="2"></td>
			</tr>
			<tr>
				<td class="font_bold bg_color_yellow">등록일</td>
				<td colspan="2"></td>
			</tr>
		</table>
		
		
		<a href="<%=ctx %>/index.jsp">
		<img src="<%=ctx %>/member2/img/home.png" alt="home" style="width: 30px"/>
	</a>
	<a href="<%=ctx %>/member/member_controller.jsp">
		<img src="<%=ctx %>/member2/img/member.png" alt="member" style="width: 60px"/>
	</a>
	</div>
</body>
</html>