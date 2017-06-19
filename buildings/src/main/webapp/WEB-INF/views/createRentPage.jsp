<%-- 
    Document   : managerUstal
    Created on : May 31, 2017, 11:47:44 AM
    Author     : denovi
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<style>
    body {                                                              
        background-image: url(http://www.photos-public-domain.com/wp-content/uploads/2012/04/coral-pink-blossoms.jpg);
        background-repeat:no-repeat;
        background-size:100% 100vh;
        background-position: right top;
        background-attachment: fixed;
        background-color: black;
    }
    /*button*/
    button {
        background-color: #7f5dff;
        color: white;
        padding: 10px 20px;
        margin: 8px 0;
        border: none;
        cursor: pointer;
        width: 50%;
        font-family: verdana;
        font-size: 15px;
    }
    
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
        text-transform: uppercase;
        font-size: 18px;
    }
    
            /*naglowek*/
    h1 {
        text-align: center;
        color: #7f5dff;
        font-family: verdana;
        font-weight: bold;
        font-size: 40px;
        letter-spacing: 3px;
    } 
    
    table {
        border: 7px solid #7f5dff;
        font-size: 20px;
        position: relative;
        margin-left: auto;
        margin-right: auto;
        width: 80%;
        background: #ffffff;
        text-align: center;
    }
    
    body {
        background-color: pink;
    }
    
    input[type=text]{
        width: 100%;
        padding: 12px 20px;
        margin: 8px 0;
        display: inline-block;
        border: 1px solid #ccc;
        box-sizing: border-box;
    }
    
    
</style>      
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
		<jsp:include page="commonHeader.jsp" />
        <h1><b>Wyslij do managera</b></h1>
        <br>        
        <form:form method="post" action="addTenant" commandName="tenantModel">
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
			<select id="city" name="city" onchange="getUlica4SelectedMiasto()">
				<option value="">....</option>
				<c:forEach items="${miastoList}" var="miastoList">
					<option value="${miastoList.idMiast}">${miastoList.nazwaMiast}</option>
				</c:forEach>
			</select>
		  </td>
          <td>
          	<select id="street" name="street" onchange="getBudynek4SelectedUlica()">
				<option value="">....</option>
			</select>
            </td> 
          <td><select id="building" name="building" onchange="getLokal4SelectedBudynek()">
            <option value="">....</option>
            </select></td> 
          <td><form:select id="place" name="place" path="idLokal" onchange="getStaraCena4SelectedLokal()">
            <form:option value="">....</form:option>
            </form:select></td> 
			<td><form:select id="tenant" name="tenant" path="idLokat" >
				<form:option value="">....</form:option>
				<c:forEach items="${lokatorList}" var="lokatorList">
					<form:option value="${lokatorList.idKont}">${lokatorList.pesel}</form:option>
				</c:forEach>
			</form:select></td>
          <td><form:input type="text" id="dateFrom" name="dateFrom" path="dataUmowyOd"/></td>
          <td><form:input type="text" id="dateTo" name="dateTo" path="dataUmowyDo"/></td>
          <td><form:input type="text" id="curPrice" name="curPrice" path="aktualnaCena" disabled="true"/></td>
        </tr>
        
        
      </table>
       
        <div class="container">
        <button type="submit">Wyslij</button>
        
        </div>
         </form:form>
    </body>
</html>

