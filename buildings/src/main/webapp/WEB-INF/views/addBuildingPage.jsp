<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Dodawanie budynkow/lokali</title>
	<link href="<c:url value='/static/css/bootstrap.css' />" rel="stylesheet"></link>
	<link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
</head>
    
<body>
	<div class="generic-container">
	<jsp:include page="commonHeader.jsp" />
        
		<div class="well lead">Rejestracja nowych budynkow/lokali</div>
		<form:form method="post" action="addBuilding" commandName="budModel" class="form-horizontal">
		
			<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="idUlica">Ulica</label>
				<div class="col-md-7">
					<form:select path="idUlica">
					<form:option value="" label="...." />
					<form:options items="${ulicaList}"/>
					</form:select>
					<div class="has-error">
						<form:errors path="idUlica" class="help-inline"/>
					</div>
				</div>
				</div>
			</div>
			
			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="nrBud">Numer budynku</label>
					<div class="col-md-7">
						<form:input type="text" path="nrBud" id="nrBud" class="form-control input-sm"/>
						<div class="has-error">
							<form:errors path="nrBud" class="help-inline"/>
						</div>
					</div>
				</div>
			</div>
	
			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="powBud">Powierzchnia budynku</label>
					<div class="col-md-7">
						<form:input type="text" path="powBud" id="powBud" class="form-control input-sm" />
						<div class="has-error">
							<form:errors path="powBud" class="help-inline"/>
						</div>
					</div>
				</div>
			</div>
			
			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="czyWinda">Czy jest winda?</label>
					<div class="col-md-7">
						<form:checkbox path="czyWinda" id="czyWinda" class="form-control input-sm" />
						<div class="has-error">
							<form:errors path="czyWinda" class="help-inline"/>
						</div>
					</div>
				</div>
			</div>
			
			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="liczbaPieter">Liczba pieter</label>
					<div class="col-md-7">
						<form:input type="text" path="liczbaPieter" id="liczbaPieter" class="form-control input-sm" />
						<div class="has-error">
							<form:errors path="liczbaPieter" class="help-inline"/>
						</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="form-actions floatRight">
					<input type="submit" value="Dodaj budynek" class="btn btn-primary btn-sm"/>
				</div>
			</div>
		</form:form>
			
		<form:form method="post" action="addPlace" commandName="lokModel" class="form-horizontal">
			<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="idBud">Budynek</label>
				<div class="col-md-7">
					<form:select path="idBud">
					<form:option value="" label="...." />
					<form:options items="${budynekList}"/>
					</form:select>
					<div class="has-error">
						<form:errors path="idBud" class="help-inline"/>
					</div>
				</div>
				</div>
			</div>
			
			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="nrLok">Numer lokalu</label>
					<div class="col-md-7">
						<form:input type="text" path="nrLok" id="nrLok" class="form-control input-sm"/>
						<div class="has-error">
							<form:errors path="nrLok" class="help-inline"/>
						</div>
					</div>
				</div>
			</div>
			
			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="powLok">Powierzchnia lokalu</label>
					<div class="col-md-7">
						<form:input type="text" path="powLok" id="powLok" class="form-control input-sm"/>
						<div class="has-error">
							<form:errors path="powLok" class="help-inline"/>
						</div>
					</div>
				</div>
			</div>
			
			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="isBalkon">Czy jest balkon?</label>
					<div class="col-md-7">
						<form:checkbox path="isBalkon" id="isBalkon" class="form-control input-sm" />
						<div class="has-error">
							<form:errors path="isBalkon" class="help-inline"/>
						</div>
					</div>
				</div>
			</div>
			
			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="liczbaPom">Liczba pomieszczen</label>
					<div class="col-md-7">
						<form:input type="text" path="liczbaPom" id="liczbaPom" class="form-control input-sm"/>
						<div class="has-error">
							<form:errors path="liczbaPom" class="help-inline"/>
						</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="form-actions floatRight">
					<input type="submit" value="Dodaj lokal" class="btn btn-primary btn-sm"/>
				</div>
			</div>
		</form:form>
	</div>
</body>
    
</html>
