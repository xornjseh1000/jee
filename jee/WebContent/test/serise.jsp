<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<title>Document</title>
</head>
<body>
	<h2>문제1 :</h2>

	<%
		int i = 1, sum = 0;
		for (; i < 11; i++) {

			sum += i;
			if (i < 10) {
	%>
	         <%=i%>+
		<%}else{%>
			 <%=i %> 
			
	<%
		}
	%>


	<%
		}
	%>
	=<%=sum%>



	<h2>를 브라우저에 출력하시오</h2>
	
	<h2>문제2 :</h2>
		<% int a=0,j=0,b=0,c=0;
		for(a=2; a<6; a++){
		
			for(j=1; j<10; j++){
				for(b=6; b<10; b++){
					
					for(c=1; c<10; c++){
			
			%>
			
			
			<%=a %>*<%=j %>=<%=a*j %><br />
			<%=b %>*<%=c %>=<%=b*c %>
			
			
		
		
		<%	}
			
		}
			}
		}
		%>
		
	
	
	
	
	
</body>
</html>