<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="/inc/loginCheck.jspf" %>
<script>
	function boardChk(){
		if(document.getElementById("subject").value==""){
			alert("제목을 입력하세요..");
			return false;
		}
		if(document.getElementById("content").value==""){
			alert("글내용을 입력하세요...");
			return false;
		}
		
		var dom = document.getElementById("boardFrm")
		dom.action = "/webMVC/board/boardWriteOk.do";
		dom.submit();
		
	}
</script>
<div class="container">
	<h1>글등록 폼</h1>
	<form method="post" id="boardFrm">
		<ul>
			<li>제목</li>
			<li><input type="text" name="subject" id="subject" style="width:90%"></li>
			<li>글내용</li>
			<li>	
				<textarea name="content" id="content" style="width:90%; height:300px;"></textarea>
			</li>
			<li>
				<input type="button" value="글등록" onclick="boardChk()"/>
				<input type="reset" value="다시쓰기"/>
			</li>
		</ul>
	</form>
</div>