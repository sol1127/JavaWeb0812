<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- jstl 라이브러리 추가 코드 --%>
<html>
<head>
    <title>List</title>
</head>
<body>
  <h1>List Page</h1>
  <ul>
      <%-- c:forEach : 반복문, var:list 안의 데이터를 한개씩 꺼낼 때 사용할 변수이름, items : 반복할 리스트 --%>
      <c:forEach var="dto" items="${list}">
          <li>글 번호: ${dto.getTno()}, 제목: ${dto.getTitle()}, 날짜: ${dto.getDueDate()}. 완료: ${dto.isFinished()} </li>
      </c:forEach>
  </ul>
<%--  ${list}--%>
</body>
</html>
