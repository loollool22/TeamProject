<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 스프링에서 %는 사라지게, %와 같은 역할인 표현언어 EL로 출력(연산자, 내장객체) 사용
<%-- 아이디 : <%//=memberDTO.getId() %><br> --%>
<!-- model.addAttribute("memberDTO", memberDTO); 형태로 담아온 것을 아래와 같이 출력-->
<img src="<%=request.getContextPath() %>/resources/img/1.jpg">
아이디 : ${memberDTO.id}<br>
비밀번호 : ${memberDTO.pass}<br>
이름 : ${memberDTO.name}<br>
가입날짜 : ${memberDTO.date}<br>
<a href="<%=request.getContextPath() %>/member/main">메인으로</a>
</body>
</html>