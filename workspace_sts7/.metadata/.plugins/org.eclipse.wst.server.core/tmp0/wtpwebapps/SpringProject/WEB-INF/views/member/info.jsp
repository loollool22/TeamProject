<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
//이름이 id인 session값 가져오기
//String id = session.getAttribute("id");
//세션을 저장할 때 stirng형태로 저장했지만, 
//어떤 형이든 통일되게 저장하기 위해 string형태로 저장되는 것이 아니라 오브젝트형으로 저장된다.
//그래서 Type mismatch: cannot convert from Object to String 에러 발생
// String id = (String)session.getAttribute("id");

//MemberDAO 객체생성 => 기억장소 할당
// MemberDAO memberDAO = new MemberDAO();

//리턴할형 MemberDTO getMember(String id) 메서드 정의
//MemeberDTO memberDTO = 주소.getMember(id) 메서드 호출
//세션값 id를 getMember 매개변수에 넣고, 메개변수가 들어온 getMember 메서드의 실행 결과 값의 주소를 memberDTO에 넣는다
// MemberDTO memberDTO = memberDAO.getMember(id);
%>
아이디 : <%//=memberDTO.getId() %><br>
비밀번호 : <%//=memberDTO.getPass() %><br>
이름 : <%//=memberDTO.getName() %> <br>
가입날짜 : <%//=memberDTO.getDate() %> <br>

<!-- 페이지는 항상 연결연결 -->
<a href="main.jsp">메인으로</a>
</body>
</html>