<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Rejestracja</title>
	<link href="<c:url value='/static/css/bootstrap.css' />" rel="stylesheet"></link>
	<link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
</head>
    <body>
 	<div class="generic-container">
        <jsp:include page="commonHeader.jsp" />
        
		<div class="well lead">Rejestracja konta nowego uzytkownika</div>
		<form:form method="POST" action="addAccount" commandName="kontoModel" class="form-horizontal">
			
			<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="typKonta">Typ Konta</label>
				<div class="col-md-7">
            		<form:select path="typKonta">
 					<form:option value="" label="...." />
 					<form:options items="${rolesList}"/>
					</form:select>
					<div class="has-error">
						<form:errors path="typKonta" class="help-inline"/>
					</div>
				</div>
				</div>
			</div>
			
			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="login">Login</label>
					<div class="col-md-7">
						<form:input type="text" path="login" id="login" class="form-control input-sm" />
						<div class="has-error">
							<form:errors path="login" class="help-inline"/>
						</div>
					</div>
				</div>
			</div>
			
			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="passw">Haslo</label>
					<div class="col-md-7">
						<form:input type="password" path="passw" id="passw" class="form-control input-sm" />
						<div class="has-error">
							<form:errors path="passw" class="help-inline"/>
						</div>
					</div>
				</div>
			</div>
			
			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="imie">Imie</label>
					<div class="col-md-7">
						<form:input type="text" path="imie" id="imie" class="form-control input-sm" />
						<div class="has-error">
							<form:errors path="imie" class="help-inline"/>
						</div>
					</div>
				</div>
			</div>
	
			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="nazwisko">Nazwisko</label>
					<div class="col-md-7">
						<form:input type="text" path="nazwisko" id="nazwisko" class="form-control input-sm" />
						<div class="has-error">
							<form:errors path="nazwisko" class="help-inline"/>
						</div>
					</div>
				</div>
			</div>
			
			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="pesel">Pesel</label>
					<div class="col-md-7">
						<form:input type="text" path="pesel" id="pesel" class="form-control input-sm" />
						<div class="has-error">
							<form:errors path="pesel" class="help-inline"/>
						</div>
					</div>
				</div>
			</div>
			
			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="telefon">Telefon</label>
					<div class="col-md-7">
						<form:input type="text" path="telefon" id="telefon" class="form-control input-sm" />
						<div class="has-error">
							<form:errors path="telefon" class="help-inline"/>
						</div>
					</div>
				</div>
			</div>
			
			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="email">Email</label>
					<div class="col-md-7">
						<form:input type="text" path="email" id="email" class="form-control input-sm" />
						<div class="has-error">
							<form:errors path="email" class="help-inline"/>
						</div>
					</div>
				</div>
			</div>
	
			<div class="row">
				<div class="form-actions floatRight">
					<input type="submit" value="Dodaj osobe" class="btn btn-primary btn-sm"/>
				</div>
			</div>
		</form:form>
	</div>
</body>
</html>
