<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%! //자바 변수 선언 및 메소드 선언
	String id;
	String pw;
	String msg;
	public void method(){};
	
%>
<%
	//이 부분에 자바 코드 작성
	id = request.getParameter("id");
	pw = request.getParameter("pw");
	
	if(id.equals("hong")){
		msg = "홍길동 님 환영합니다.";
	}
	else
		msg = "등록된 회원이 아닙니다.";

%>

<body>
	<div align="center">
		<h1><%= msg %></h1>
	</div>
</body>
</html>