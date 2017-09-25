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
    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
    <script type="text/javascript">
		function getUlica4SelectedMiasto(){
		var city = $('#city').val();
		$.ajax({
			url : '../ajax/getUlica4SelectedMiasto',
			method : 'POST',
			datatType : 'json',
			data : {
				city : city
			},
   		error: function(xhr, response, errorThrown){
       		alert(errorThrown);
    	},
			success : function(data) {
				var options = '';
				if (data != null) {
					options = options + '<option value="-1">Wybierz ulice</option>';
					$.each(data, function(key, val) {
						options = options + '<option value="' + key + '">' + val + '</option>';
					});
					$('#street').html(options);
				}
			}
		});
		}
		</script>
		<script type="text/javascript">
		function getBudynek4SelectedUlica(){
		var street = $('#street').val();
		$.ajax({
			url : '../ajax/getBudynek4SelectedUlica',
			method : 'POST',
			datatType : 'json',
			data : {
				street : street
			},
   		error: function(xhr, response, errorThrown){
       		alert(errorThrown);
    	},
			success : function(data) {
				var options = '';
				if (data != null) {
					options = options + '<option value="-1">Wybierz budynek</option>';
					$.each(data, function(key, val) {
						options = options + '<option value="' + key + '">' + val + '</option>';
					});
					$('#building').html(options);
				}
			}
		});
		}
	</script>
	<script type="text/javascript">
		function getLokal4SelectedBudynek(){
		var building = $('#building').val();
		$.ajax({
			url : '../ajax/getLokal4SelectedBudynek',
			method : 'POST',
			datatType : 'json',
			data : {
				building : building
			},
   		error: function(xhr, response, errorThrown){
       		alert(errorThrown);
    	},
			success : function(data) {
				var options = '';
				if (data != null) {
					options = options + '<option value="-1">Wybierz lokal</option>';
					$.each(data, function(key, val) {
						options = options + '<option value="' + key + '">' + val + '</option>';
					});
					$('#place').html(options);
				}
			}
		});
		}
	</script>
	<script type="text/javascript">
		function getStaraCena4SelectedLokal(){
		var place = $('#place').val();
		$.ajax({
			url : '../ajax/getStaraCena4SelectedLokal',
			method : 'POST',
			datatType : 'json',
			data : {
				place : place
			},
   		error: function(xhr, response, errorThrown){
       		alert(errorThrown);
    	},
			success : function(data) {
				if (data != null) {
					$('#curPrice').val(data);
				}
			}
		});
		}
	</script>
    </head>
	
<body>
	<div class="generic-container">
	<jsp:include page="commonHeader.jsp" />
        
		<div class="well lead">Wyślij do managera</div>
		<form:form method="post" action="addTenant" commandName="tenantModel" class="form-horizontal">
        <table cellpadding="10">
        <tr>
          <th>Miasto</th>
          <th>Ulica</th>
          <th>Nr budynku</th>
          <th>Nr lokalu</th>
          <th>PESEL lokatora</th>
          <th>Od kiedy</th>
          <th>Do kiedy</th>
          <th>Cena</th>
        </tr>
        <tr>
		  <td>
		  	<div class="form-group col-md-12">
			<div class="col-md-7">
			<select id="city" name="city" onchange="getUlica4SelectedMiasto()">
				<option value="">....</option>
				<c:forEach items="${miastoList}" var="miastoList">
					<option value="${miastoList.idMiast}">${miastoList.nazwaMiast}</option>
				</c:forEach>
			</select>
			</div>
			</div>
		  </td>
          <td>
		  	<div class="form-group col-md-12">
			<div class="col-md-7">
          	<select id="street" name="street" onchange="getBudynek4SelectedUlica()">
				<option value="">....</option>
			</select>
			</div>
			</div>
            </td> 
          <td>
		  	<div class="form-group col-md-12">
			<div class="col-md-7">
		  <select id="building" name="building" onchange="getLokal4SelectedBudynek()">
            <option value="">....</option>
            </select>
			</div>
			</div>
			</td> 
          <td>
			<div class="form-group col-md-12">
				<div class="col-md-7">
					<form:select id="place" name="place" path="idLokal" onchange="getStaraCena4SelectedLokal()">
					<form:option value="">....</form:option>
					</form:select>
					<div class="has-error">
						<form:errors path="idLokal" class="help-inline"/>
					</div>
				</div>
				</div>
		   </td> 
          <td>
			<div class="form-group col-md-12">
				<div class="col-md-7">
					<form:select id="tenant" name="tenant" path="idLokat" >
					<form:option value="">....</form:option>
					<c:forEach items="${lokatorList}" var="lokatorList">
						<form:option value="${lokatorList.idKont}">${lokatorList.pesel}</form:option>
					</c:forEach>
					</form:select>
					<div class="has-error">
						<form:errors path="idLokal" class="help-inline"/>
					</div>
				</div>
			</div>
		   </td> 
		  <td>
				<div class="form-group col-md-12">
					<div class="col-md-7">
						<form:input type="text" path="dataUmowyOd" id="dateFrom" class="form-control input-sm" />
						<div class="has-error">
							<form:errors path="dataUmowyOd" class="help-inline"/>
						</div>
					</div>
				</div>
		  </td>
		  <td>
				<div class="form-group col-md-12">
					<div class="col-md-7">
						<form:input type="text" path="dataUmowyDo" id="dateTo" class="form-control input-sm" />
						<div class="has-error">
							<form:errors path="dataUmowyDo" class="help-inline"/>
						</div>
					</div>
				</div>
		  </td>
		  <td>
				<div class="form-group col-md-12">
					<div class="col-md-7">
						<form:input type="text" path="aktualnaCena" id="curPrice" class="form-control input-sm" disabled="true"/>
						<div class="has-error">
							<form:errors path="aktualnaCena" class="help-inline"/>
						</div>
					</div>
				</div>
		  </td>
        </tr>
      </table>
       
        <div class="container">
        <button type="submit">Ustal cennik</button>
        
        </div>
         </form:form>
    </body>
</html>

