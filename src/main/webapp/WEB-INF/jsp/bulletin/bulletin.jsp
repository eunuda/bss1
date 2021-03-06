<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<script>
    function deleteFunc(id) {
    	document.form.delFrm.id.value=id;
    	document.form.delFrm.submit();
    }
</script>

<form name="delFrm" action="${pageContext.request.contextPath}/bulletinDelete.do" method="post">
<input type="hidden" name="id">
</form>

<form name="updateFrm" action="${pageContext.request.contextPath}/bulletinUpdate.do" method="post">
<input type="hidden" name="id">
</form>

<form action="${pageContext.request.contextPath}" method="post">
	<input type="hidden" name="id" value="${bulletin.bbsId}">
	<table border="1">
		<tbody>

			<tr>
				<th>글번호</th>
				<td>${bulletin.bbsId}</td>
			</tr>
			<tr>
				<th>제목</th>
				<td><input type="text" name="title" value="${bulletin.bbsTitle }"></td>
			</tr>
			<tr>
				<th>내용</th>
				<td><textarea name="content" cols="20" rows="3">${bulletin.bbsContent}</textarea>
				</td>
			</tr>
			<tr>
				<th>작성일시</th>
				<td>${bulletin.bbsCreateDate}</td>
			</tr>
			<tr>
				<th>조회수</th>
				<td>${bulletin.bbsHit}</td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="수정"> 
				   <input type="reset" value="초기화">
				    <input type="button" value="삭제" onclick="deleteFunction(${bulletin.bbsId})">
				 </td>
			</tr>
		</tbody>
	</table>
</form>