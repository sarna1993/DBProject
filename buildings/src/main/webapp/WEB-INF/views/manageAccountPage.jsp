<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<html>
<style>
    .container {                                
        text-align: center;
        width: 20%;
        line-height: 1.0;  
        padding: 16px;
        position: absolute;
        margin-left: auto;
        margin-right: auto;
        left: 0;
        right: 0;
        color: white;
        font-size: 18px;
    }
</style>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>JSP Page</title>
</head>
 
<body>
<jsp:include page="commonHeader.jsp" />
    <div class="container">
        <div class="panel panel-default">
              <!-- Default panel contents -->
            <div class="panel-heading"><span class="lead">Lista uzytkownikow</span></div>
            <table class="table table-hover">
                <thead>
                    <tr>
                        <th>Imie</th>
                        <th>Nazwisko</th>
                        <th>Email</th>
                        <th>Rola</th>
                        <th width="100"></th>
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
                    	<td><a href="<c:url value='/account/delete-${user.login}' />">Usun</a></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</body>
</html>