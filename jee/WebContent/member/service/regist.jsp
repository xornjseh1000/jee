<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%String ctx = application.getContextPath();%>
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
<jsp:include page="global/top.jsp" />
<jsp:include page="global/header.jsp" />

<div class="box">
	<div>
		<form action="<%=ctx %>/result/regist_result.jsp" method="post">
			<span class="meta">이름</span> <input type="text" name="name" /> <br />
			<span class="meta">ID</span><input type="text" name="id" /> <br />
			<span class="meta">비밀번호</span><input type="text" name="pw" /> <br />
			<span class="meta">SSN</span><input type="text" name="ssn" /><br />




			<input type="submit" value="회원가입" /> <input type="reset" value="취소" />
		</form>


	</div>
</div>
<jsp:include page="global/footer.jsp" />
<jsp:include page="global/end.jsp" />




