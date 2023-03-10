<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/study/styles/style.css" />
</head>
<body>
	<h2>학습 일기 작성</h2>
	<form action="save" method="post">
		<table>
			<tr>
				<td style="text-align: right" colspan="2"><a href="/study">홈으로</a></td>
			</tr>
			<tr>
				<td><label for="studyDate">학습일</label></td>
				<td><input type="date" id="studyDate" name="studyDate"
					<c:if test="${diary != null}"> readonly value="${diary.studyDate}"</c:if>></td>
			</tr>
			<tr>
				<td><label for="title">제목</label></td>
				<td><input type="text" id="title" name="title"
					placeholder="(50자 이내)" maxlength="50"
					<c:if test="${diary != null}"> readonly value="${diary.title}"</c:if>></td>
			</tr>
			<tr>
				<td><label for="content">내용</label></td>
				<td><textarea id="content" name="content" rows="5" cols="50"
						placeholder="(상세한 학습 내용 - 2,000자 이내)" maxlength="2000"
						<c:if test="${diary != null}"> readonly</c:if>>${diary.content}</textarea></td>
			</tr>
			<tr>
				<td></td>
				<td class="submit"><c:choose>
						<c:when test="${diary == null}">
							<input type="submit" value="저장">
						</c:when>
						<c:otherwise>
							<a href="listing">목록으로</a>
						</c:otherwise>
					</c:choose></td>
			</tr>
		</table>
	</form>

</body>
</html>