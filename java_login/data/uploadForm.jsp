<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<style>
	#title, #memo{width:90%;}
	#memo{height:200px;}
	#fileFrm{padding:5px; 0px;}


</style>
<<script>
	function frmCheck(){
		if(document.getElementById("title").value==""){
			alert("제목을 입력하세요..");
			return false;
		}
		if(document.getElementById("memo").value==""){
			alert("글애용을 입력하세요..");
			return false;
		}
		
		var cnt=0;
		if(document.getElementById("filename1").value!=""){
			cnt++;
		}
		
		if(document.getElementById("filename2").value!=""){
			cnt++;
		}
		
		if(cnt<1){
			alert("첨부파일은 1개이상 선택하여야 합니다.");
			return false;
		}
		
		return true;
	};
</script>

<div class="container">
	<h1>파일업로드</h1>
	<p>
		1. 서버에 업로드할 위치를 만들기</br>
		   뷰영역에 폴더 upload를 생성한다.
		2. 파일업로드를 구현해주는 프레임워크 설정하기<br/>
		   servlets.com에서 다운로드
		   Cors file upload -> 화면하단의 cors-22.05.jar다운로드
		   
		   압축을 푼후 cors.jar을 이클립스의 /WEB-INF/lib에 복사한다.<br/>
		   
		3. 폼에서 파일업로드시 반드시 enctype속성을 표시하여야 한다.
	</p>
	<h1>파일업로드 폼</h1>
	<form method="post" action="<%=request.getContextPath() %>/data/fileuploadOk.do" enctype="multipart/form-data" 
	id="fileFrm" onsubmit="return frmCheck()">
		<ul>
			<li>제목</li>
			<li><input type="text" name="title" id="title"/></li>
			<li>글내용</li>
			<li><textarea name="memo" id="memo"></textarea></li>
			<li>첨부파일</li>
			<li>
				<input type="file" name="filename1" id="filename1"/><br/>
				<input type="file" name="filename2" id="filename2"/><br/>
			</li>
			<li>
				<input type="submit" value="파일올리기"/>
				<input type="reset" value="다시쓰기"/>
			
			</li>
			
		</ul>
	</form>
</div>
