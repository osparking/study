<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학습 일기 목록</title>
<link rel="stylesheet" href="/study/styles/style.css" />
</head>
<body>
	<h2>학습 일기 목록</h2>
	<a href="/study">홈으로</a>
	<table>
		<tr>
			<th>번호</th>
			<th>학습일</th>
			<th>제목</th>
			<th>시간(분)</th>
		</tr>
		<c:forEach items="${diaries}" var="diary" varStatus="stat">
			<tr>
				<td>${fn:length(diaries) - stat.index}</td>
				<td>${diary.studyDate}</td>
				<td><a href="view?sno=${diary.sno}">${diary.title}</a></td>
				<td>${diary.durationMin}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>