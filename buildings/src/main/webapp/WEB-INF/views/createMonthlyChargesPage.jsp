<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
    <script type="text/javascript">
	function getObciazenie4SelectedLokator() {
		var tenant = $('#tenant').val();
		$.ajax({
			url : '../../ajax/getObciazenie4SelectedLokator',
			method : 'POST',
			datatType : 'json',
			data : {
				tenant : tenant
			},
			error : function(xhr, response, errorThrown) {
				alert(errorThrown);
			},
			success : function(data) {
				if (data != null) {
					$('#price').val(data);
				}
			}
		});
	}
</script>

</head>
<body>
	<div class="generic-container">
	<jsp:include page="commonHeader.jsp" />
        
	<div class="well lead">Rozliczenia</div>
	<form:form method="post" action="createNewMonthlyCharges" commandName="rozliczenieModel" class="form-horizontal">
		<table cellpadding="10">
			<tr>
				<th>PESEL lokatora</th>
				<th>Miesiac</th>
				<th>Rok</th>
				<th>Data rozliczenia</th>
				<th>Termin platnosci</th>
				<th>Cena</th>
			</tr>
			<tr>
	  <td>
			<div class="form-group col-md-12">
				<div class="col-md-7">
					<form:select id="tenant" name="tenant" path="idLokat" onchange="getObciazenie4SelectedLokator()">
						<form:option value="">....</form:option>
						<c:forEach items="${lokatorList}" var="lokatorList" >
							<form:option value="${lokatorList.idKont}">${lokatorList.pesel}</form:option>
						</c:forEach>
					</form:select>
				</div>
			</div>
		  </td>
		  <td>
			<div class="form-group col-md-12">
				<div class="col-md-7">
					<form:select id="month" name="month" path="okres.mies">
						<form:option value="">....</form:option>
						<c:forEach items="${monthList}" var="monthList" varStatus="loop">
							<form:option value="${loop.index + 1}">${monthList}</form:option>
						</c:forEach>
					</form:select>
				</div>
			</div>
		  </td>
		  <td>
			<div class="form-group col-md-12">
				<div class="col-md-7">
					<form:select id="year" name="year" path="okres.rok">
						<form:option value="">....</form:option>
						<c:forEach items="${yearList}" var="yearList">
							<form:option value="${yearList}">${yearList}</form:option>
						</c:forEach>
					</form:select>
				</div>
			</div>
		  </td>
		   <td>
				<div class="form-group col-md-12">
					<div class="col-md-7">
						<form:input type="text" size="100" path="data" id="date" name="date" class="form-control input-sm"/>
						<div class="has-error">
							<form:errors path="data" class="help-inline"/>
						</div>
					</div>
				</div>
		  </td>
		   <td>
				<div class="form-group col-md-12">
					<div class="col-md-7">
						<form:input type="text" size="100" path="terminPlat" id="deadline" name="deadline" class="form-control input-sm"/>
						<div class="has-error">
							<form:errors path="terminPlat" class="help-inline"/>
						</div>
					</div>
				</div>
		  </td>
		   <td>
				<div class="form-group col-md-12">
					<div class="col-md-7">
						<form:input type="text" size="100" path="obciazenie" id="price" name="price" class="form-control input-sm"/>
						<div class="has-error">
							<form:errors path="obciazenie" class="help-inline"/>
						</div>
					</div>
				</div>
		  </td>
        </tr>
      </table>
		<div class="form-actions floatRight">
			<input type="submit" value="Wyślij" class="btn btn-primary btn-sm"/>
		</div>
        </form:form>
		</div>
    </body>
</html>

