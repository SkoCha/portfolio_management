<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="./commons/header.jsp" %>

<div>
	<h1>메인 페이지</h1>
</div>
<div>
	<p>메인 페이지 입니다.</p>
</div>
<c:if test="${member == null}">
	<div>
		<p><a href="/member/register">회원가입</a></p>
	</div>
	<div>
		<p><a href="/member/login">로그인</a></p>
	</div>
</c:if>

<c:if test="${member != null}">
	<div>
		<p>${member.userId}님 환영합니다.</p>
	</div>
	<c:if test="${member.enabled == 1}">
		<div>
			<p><a href="/admin/index">관리자 화면</a></p>
		</div>
	</c:if>
	<a href="/member/logout">로그아웃</a>
</c:if>
<%@ include file="./commons/footer.jsp" %>