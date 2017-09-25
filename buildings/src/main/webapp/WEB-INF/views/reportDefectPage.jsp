<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Zgłoszenie usterki</title>
	<link href="<c:url value='/static/css/bootstrap.css' />" rel="stylesheet"></link>
	<link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
</head>

<body>
	<div class="generic-container">
	<jsp:include page="commonHeader.jsp" />
        
		<div class="well lead">Zgłoszenie usterki</div>
		<form:form method="post" action="addDefect" commandName="ustModel" class="form-horizontal">
			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="lokalna">Czy usterka lokalna?</label>
					<div class="col-md-7">
						<form:checkbox path="lokalna" id="lokalna" class="form-control input-sm" />
						<div class="has-error">
							<form:errors path="lokalna" class="help-inline"/>
						</div>
					</div>
				</div>
			</div>
			
			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="opis">Opis usterki</label>
					<div class="col-md-7">
						<form:input type="text" path="opis" id="opis" size="100" class="form-control input-sm" />
						<div class="has-error">
							<form:errors path="opis" class="help-inline"/>
						</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="form-actions floatRight">
					<input type="submit" value="Zgłoś" class="btn btn-primary btn-sm"/>
				</div>
			</div>
		</form:form>
</div>
</body>
</html>
