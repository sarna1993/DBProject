<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<style>
    body {                                                              
        background-image: url(http://www.photos-public-domain.com/wp-content/uploads/2011/02/purple-leather-texture.jpg);
        background-repeat:no-repeat;
        background-size:100% 100vh;
        background-position: right top;
        background-attachment: fixed;
        background-color: black;
    }
    
    /*button*/
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
    
    .zalogowanoJako {
        text-align: right;
        color: black;
        font-family: verdana;
        font-size: 20px;
        color: #7f5dff;
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
    </head>
    
    <body>
        <div class="zalogowanoJako">
            Zalogowano jako: ADMIN 
        </div> 
        
        <h1><b>DODAWANIE BUDYNKOW I LOKALI</b></h1>
        
        <div class="container">
		<form:form method="post" action="addBuilding" commandName="budModel">
 		<table>
 		<tr>
 		<td>Ulica</td>
 		</tr>
 		<tr>
 		<td>
 		<form:select path="idUlica">
 		<form:option value="" label="...." />
 		<form:options items="${ulicaList}"/>
 		</form:select>
 		</td>
 		</tr>
 		<tr>
        <td><form:label path="nrBud">Numer budynku</form:label></td>
        </tr>
        <tr>
        <td><form:input path="nrBud" /></td>
 		</tr>
 		<tr>
        <td><form:label path="powBud">Powierzchnia budynku</form:label></td>
        </tr>
        <tr>
        <td><form:input path="powBud" /></td>
      	</tr>
      	 <tr>
        <td><form:label path="czyWinda">Czy jest winda</form:label></td>
        </tr>
        <tr>
        <td><form:checkbox path="czyWinda" /></td>
      	</tr>
      	<tr>
        <td><form:label path="liczbaPieter">Liczba pieter</form:label></td>
        </tr>
        <tr>
        <td><form:input path="liczbaPieter" /></td>
      	</tr>
 		</table>
 		<button type="submit">Dodaj budynek</button> 
 		</form:form>
		<br>
		<hr>
		<br>
            <!-- wybor z tabeli DODAC !!!-->
		<form:form method="post" action="addPlace" commandName="lokModel">
		<table style=margin-left:50px;">
		<tr>
 		<td>Budynek</td>
 		</tr>
 		<tr>
 		<td>
 		<form:select path="idBud">
 		<form:option value="" label="...." />
 		<form:options items="${budynekList}"/>
 		</form:select>
 		</td>
 		</tr>
 		<tr> 
 		<td><form:label path="nrLok">Numer lokalu</form:label></td>
		</tr>
		<tr>
		<td><form:input path="nrLok" /></td>
		</tr>
		<tr>
		<td><form:label path="powLok">Powierzchnia lokalu</form:label></td>
		</tr>
		<tr>
		<td><form:input path="powLok" /></td>
		</tr>
		<tr>
		<td><form:label path="isBalkon">Czy jest balkon</form:label></td>
		</tr>
		<tr>
		<td><form:checkbox path="isBalkon" /></td>
		</tr>
		<tr>
		<td><form:label path="liczbaPom">Liczba pomieszczen</form:label></td>
		</tr>
		<tr>
		<td><form:input path="liczbaPom" /></td>
		</tr>
 		</table>
 		<button type="submit">Dodaj lokal</button>
 		</form:form>
        </div>
    </body>
    
</html>
