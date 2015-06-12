<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>방명록 수정</title>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<link rel="stylesheet" type="text/css" href="${root}/css/address/address.css"/>
<script type="text/javascript" src="${root}/css/address/address.js"></script>
</head>
<body>
	<jsp:include page="/index.jsp"/><br/><br/>	
	<c:if test="${check>0}">
		<script type="text/javascript">
			alert("수정 성공");
		</script>
	</c:if>
	<c:if test="${check==0}">
		<script type="text/javascript">
			alert("수정 실패");
		</script>
	</c:if>
	<c:if test="${addr==null}">
		<form action="${root}/address/update.do" method="get">
			<table border="0" align="center" cellpadding="0" cellspacing="0"
				width="300">
				<tr>
					<td colspan="2" align="center" height="30">수정하실 이름을 입력하세요.</td>
				</tr>
				<tr>
					<td height="30">이름</td>
					<td height="30"><input type="text" name="name" /> <input
						type="submit" value="검색" /></td>
				</tr>
			</table>
		</form>
	</c:if>

	<c:if test="${addr!=null}">
		<form action="${root}/address/update.do" method="post">
			<table border="0" align="center" cellpadding="0" cellspacing="0"
				width="300">
				<tr>
					<td height="30">이름</td>
					<td height="30"><input type="hidden" name="num" value="${addr.num}" /> <input
						type="text" name="name" value="${addr.name}" disabled="disabled"/></td>
				</tr>

				<tr>
					<td height="30">전화번호</td>
					<td height="30"><input type="text" name="phone" value="${addr.phone}" /></td>
				</tr>

				<tr>
					<td height="30">이메일</td>
					<td height="30"><input type="text" name="email" value="${addr.email}" /></td>
				</tr>


				<tr>
					<td colspan="2" align="center" height="30"><input
						type="submit" value="수정" /> <input type="reset" value="취소" /></td>
				</tr>
			</table>
		</form>
	</c:if>
</body>
</html>