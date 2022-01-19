 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script></script>
<body>
** 글쓰기 **
<form action="${pageContext.request.contextPath}/blletinAdd.do" method="post">
   </form>

글제목: <input type="text" name="reTitle"><br>
작성자: <input type="text" name="reUser"><br>
글내용: <textarea rows="5" cols="30" name="reContent"></textarea>
<br><br>
<input type="submit" value="저장">

</body>
</html>