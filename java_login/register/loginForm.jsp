<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<style>
	.login{
		width:500px;
		padding:50px;
		margin:0 auto;
	}
	.login input{width:100%; height:40px;}
	.login li{padding:10px 0;}
</style>
<div class="container">
	<div class="login">
		<h1>로그인 폼</h1>
		<form method="post" action="/webMVC/loginOk.do">
		<ul>
			<li>아이디</li>
			<li><input type="text" name="userid"/></li>
			<li>비밀번호</li>
			<li><input type="password" name="userpwd"/></li>
			<li><input type="submit" name="LOGIN"/></li>
		
		</ul>
		</form>
	
	</div>
</div>
