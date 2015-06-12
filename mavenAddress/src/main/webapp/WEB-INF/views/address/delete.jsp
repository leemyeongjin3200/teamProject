<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>주소록 삭제</title>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<link rel="stylesheet" type="text/css" href="${root}/css/address/address.css"/>
<script type="text/javascript" src="${root}/css/address/address.js"></script>
<script type="text/javascript" src="${root}/css/jquery.js"></script>
</head>
<body>	
	<jsp:include page="/index.jsp"/><br/><br/>
	
	<c:if test="${check>0}">
		<script type="text/javascript">
			alert("삭제 되었습니다.");
			$(location).attr("href", "${root}/address/write.do");
		</script>
	</c:if>
	<c:if test="${check==0}">
		<script type="text/javascript">
			alert("삭제 실패");
			$(location).attr("href", "${root}/address/delete.do");
		</script>
	</c:if>
	
	<form name="addrForm">
		<table border="0" align="center" cellpadding="0" cellspacing="0" 
					width="300">
			<tr>
				<td colspan="2" align="center" height="30">
					삭제하실 이름을 입력하세요.
				</td>
			</tr>
			
			<tr>
				<td height="30">수정 이름</td>
				<td height="30">
					<input type="text" name="name"/>
					<input type="button" value="검색" onclick="deleteCheck(addrForm, '${pageContext.request.contextPath}')"/>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>