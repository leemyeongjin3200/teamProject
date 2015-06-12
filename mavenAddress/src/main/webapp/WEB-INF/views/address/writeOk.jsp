<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>주소록 작성</title>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<link rel="stylesheet" type="text/css" href="${root}/css/address/address.css"/>
<script type="text/javascript" src="${root}/css/address/address.js"></script>
<script type="text/javascript" src="${root}/css/jquery.js"></script>
</head>
<body>
	<c:if test="${check > 0}">
		<script type="text/javascript">
			alert("주소록 작성이 완료 되었습니다.");
			$(location).attr("href", "${root}/address/write.do");
		</script>
	</c:if>
	
	<c:if test="${check == 0}">
		<script type="text/javascript">
			alert("주소록 작성이 실패했습니다.");
			$(location).attr("href", "${root}/address/write.do");
		</script>
	</c:if>
</body>
</html>