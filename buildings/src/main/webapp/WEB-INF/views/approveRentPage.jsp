<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Lista wynajmów</title>
	<link href="<c:url value='/static/css/bootstrap.css' />" rel="stylesheet"></link>
	<link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
</head>
 
<body>
	<div class="generic-container">
		<jsp:include page="commonHeader.jsp" />
		<div class="panel panel-default">
			  <!-- Default panel contents -->
		  	<div class="panel-heading"><span class="lead">Lista umów wynajmu</span></div>
			<table class="table table-hover">
	    		<thead>
		      		<tr>
				        <th>Id lokatora</th>
						<th>Id lokalu</th>
				        <th>Numer umowy</th>
				        <th>Cena</th>
						<th>Data od</th>
						<th>Data do</th>
					</tr>
		    	</thead>
	    		<tbody>
				<c:forEach items="${rents}" var="rent">
					<tr>
                        <td>${rent.idLokator}</td>
						<td>${rent.idLokal}</td>
                        <td>${user.nrUmowy}</td>
                        <td>${user.cenaWynaj}</td>
                        <td>${user.dtUmowyOd}</td>
						<td>${user.dtUmowyDo}</td>
					</tr>
				</c:forEach>
	    		</tbody>
	    	</table>
		</div>
   	</div>
</body>
</html>
