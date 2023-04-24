<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %><!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<%=request.getContextPath() %>/inc/style.css" type="text/css"/>
<script>
	function delQna(){
		
		if(confirm('해당글을 삭제할까요?')){
			location.href ="<%=request.getContextPath()%>/board/boardDelOk.do?no=${boardDTO.no}";
		}
	}
</script>
</head>
<body>
<div class="container">
	<h1>글내용보기</h1>
		<c:if test="${boardDTO.no==0 }">
			<p> 해당글이 존재하지 않습니다.</p>
	</c:if>
	<c:if test="${boardDTO.no>0 }"><!-- 선택한 글이 있을때 -->
	
		<ul>
			<li>번호</li>
			<li>${boardDTO.no }</li>
			<li>작성자</li>
			<li>${boardDTO.userid }</li>
			<li>조회수</li>
			<li>${boardDTO.hit }</li>
			<li>등록일</li>
			<li>${boardDTO.writedate }</li>
			<li>제목</li>
			<li>${boardDTO.subject }</li>
			<li>글내용</li>
			<li>${boardDTO.content }</li>
		</ul>
		<p>
			<c:if test="${logId == boardDTO.userid}">
				<a href="<%=request.getContextPath() %>/board/boardEdit.do?no=${boardDTO.no}" >수정</a>
				<a href="javascript:delQna()" >삭제</a>
			</c:if>
	
		</p>
	</c:if>
</div>
</body>
</html>