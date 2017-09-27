<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; ccharset=UTF-8"">
	<title>Dodawanie budynkow/lokali</title>
	<link href="<c:url value='/static/css/bootstrap.css' />" rel="stylesheet"></link>
	<link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
	<title>Księgowanie płatności</title>
    </head>
	
	<body>
	<div class="generic-container">
	<jsp:include page="commonHeader.jsp" />
        
	<div class="well lead">Księguj wpłaty</div>
	<form:form method="post" action="bookNewPayment" commandName="histPlatModel" class="form-horizontal">
       <table cellpadding="10">
        <tr>
          <th>PESEL lokatora</th>
          <th>Kwota platnosci</th>
          <th>Data operacji</th>
        </tr>
        <tr>
		  <td>
		  	<div class="form-group col-md-12">
			<div class="col-md-7">
			<form:select id="tenant" name="tenant" path="idLokat" >
				<form:option value="">....</form:option>
				<c:forEach items="${lokatorList}" var="lokatorList">
					<form:option value="${lokatorList.idKont}">${lokatorList.pesel}</form:option>
				</c:forEach>
			</form:select>
			</div>
			</div>
		  </td>
		  <td>
				<div class="form-group col-md-12">
					<div class="col-md-7">
						<form:input type="text" size="100" path="kwotaPlat" id="paymAmount" class="form-control input-sm" />
						<div class="has-error">
							<form:errors path="kwotaPlat" class="help-inline"/>
						</div>
					</div>
				</div>
		  </td>
		  <td>
				<div class="form-group col-md-12">
					<div class="col-md-7">
						<form:input type="text" size="100" path="dtOperacji" id="date" class="form-control input-sm" />
						<div class="has-error">
							<form:errors path="dtOperacji" class="help-inline"/>
						</div>
					</div>
				</div>
		  </td>
	    </tr>
      </table>
        <div class="container">
        <button type="submit">Księguj</button>
        
        </div>
         </form:form>
		 </div>
    </body>
</html>

