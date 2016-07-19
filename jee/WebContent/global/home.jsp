<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="<%=ctx %>/global/top.jsp" />
<jsp:include page="<%=ctx %>/global/header.jsp" />


<div class="box">
	<h2>서비스를 이용하시려면 회원가입을 하셔야 합니다.</h2>
	<a href="<%=ctx %>/member/service/regist.jsp">회원가입 하러 가기</a> <br /> <a
		href="<%=ctx %>/member/service/login.jsp">로그인 하러 가기</a> <a
		href="<%=ctx %>/global/main.jsp">메인화면 가기</a>
		
</div>
 <jsp:include page="<%=ctx %>/global/footer.jsp" />
<jsp:include page="<%=ctx %>/global/end.jsp" />