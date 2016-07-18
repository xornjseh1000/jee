<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <%String ctx=application.getContextPath();%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>한빛 아카데미</title>
<link rel="stylesheet" href="<%=ctx%>/css/global.css" />
</head>
<body>
	<jsp:include page="header.jsp" />
	<jsp:include page="navi.jsp" />

	<div id="section">
		<h2>회원관리</h2>
		<p>London is the capital city of England. It is the most populous
			city in the United Kingdom, with a metropolitan area of over 13
			million inhabitants.</p>
		<p>Standing on the River Thames, London has been a major
			settlement for two millennia, its history going back to its founding
			by the Romans, who named it Londinium.</p>
	</div>

	<div id="footer" class="bottom">Copyright KimDDong.com</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>