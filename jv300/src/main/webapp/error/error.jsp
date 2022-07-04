<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="wrapper">
   <div id="header">
   		<jsp:include page="/incl/banner.jsp">
   			<jsp:param name="subtitle" value="mode008 : Java Beans and include" />
   		</jsp:include>
   </div>
   <div id="content-wrapper">
   		<h3>오류</h3>
   		<c:forEach var="message" items="${errorMsgs}">
			<li><c:out value="${message}"/></li>
		</c:forEach>
   </div>
   <div id="footer">
   		<%@ include file="/incl/footer.jsp" %>
   </div>
  </div>
</body>
</html>