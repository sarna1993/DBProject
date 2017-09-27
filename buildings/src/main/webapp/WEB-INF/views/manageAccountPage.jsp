<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Zarzadzaj kontami</title>
	<link href="<c:url value='/static/css/bootstrap.css' />" rel="stylesheet"></link>
	<link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
</head>
 
<body>
	<div class="generic-container">
		<jsp:include page="commonHeader.jsp" />
		<div class="panel panel-default">
			  <!-- Default panel contents -->
		  	<div class="panel-heading"><span class="lead">Lista użytkowników</span></div>
			<table class="table table-hover">
	    		<thead>
		      		<tr>
				        <th>Imie</th>
				        <th>Nazwisko</th>
				        <th>Email</th>
				        <th>Rola</th>
						<th width="100"></th>
					</tr>
		    	</thead>
	    		<tbody>
				<c:forEach items="${users}" var="user">
					<tr>
                        <td>${user.imie}</td>
                        <td>${user.nazwisko}</td>
                        <td>${user.email}</td>
                        <td>${user.rola}</td>
						<c:if test = "${user.aktywny == 1}">
						<td><a href="<c:url value='/account/disable-${user.login}' />">Blokuj</a></td>
						</c:if>
						<c:if test = "${user.aktywny != 1}">
						<td><a href="<c:url value='/account/enable-${user.login}' />">Aktywuj</a></td>
						</c:if>
					</tr>
				</c:forEach>
	    		</tbody>
	    	</table>
		</div>
   	</div>
</body>
</html>