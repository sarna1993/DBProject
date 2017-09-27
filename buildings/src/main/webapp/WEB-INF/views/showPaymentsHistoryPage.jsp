<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Zaestawienia miesięczne</title>
	<link href="<c:url value='/static/css/bootstrap.css' />" rel="stylesheet"></link>
	<link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
</head>

<body>
	<div class="generic-container">
		<jsp:include page="commonHeader.jsp" />
		<div class="panel panel-default">
			  <!-- Default panel contents -->
		  	<div class="panel-heading"><span class="lead">Zestawienia miesięczne</span></div>
			<table class="table table-hover">
	    		<thead>
		      		<tr>
                        <th>Data wystawienia</th>
                        <th>Termin płatności</th>
                        <th>Saldo miesięczne</th>
                        <th>Obciążenie</th>
					</tr>
		    	</thead>
	    		<tbody>
				<c:forEach items="${payments}" var="p">
					<tr>
                        <td>${p.data}</td>
                        <td>${p.terminPlat}</td>
                        <td>${p.saldoMies}</td>
                        <td>${p.obciazenie}</td>
					</tr>
				</c:forEach>
	    		</tbody>
	    	</table>
		</div>
   	</div>
</body>
</html>
