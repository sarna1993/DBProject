<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Panel admina</title>
	<link href="<c:url value='/static/css/bootstrap.css' />" rel="stylesheet"></link>
	<link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
</head>
    
    <body>
    	<jsp:include page="commonHeader.jsp" />
		<div class="generic-container" align="center">
            <form action="/buildings/defect/report">
                <button>Zglos usterke</button><br>
            </form>    
            <form action="/buildings/charges/monthly">    
                <button>Pokaz miesieczne zestawienia</button>
            </form>  
            <form action="/buildings/payments/history">    
                <button>Pokaz zestawienie dokonanych wplat</button>
            </form> 
        </div>
        
    </body>
</html>
