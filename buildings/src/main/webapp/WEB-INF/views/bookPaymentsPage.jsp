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
        <title>JSP Page</title>s
    </head>
    <body>
		<jsp:include page="commonHeader.jsp" />
        <h1><b>Ksieguj wplaty</b></h1>
        <br>        
        <form:form method="post" action="bookNewPayment" commandName="histPlatModel">
        <table cellpadding="10">
        <tr>
          <th>PESEL lokatora</th>
          <th>Kwota platnosci</th>
          <th>Data operacji</th>
        </tr>
        <tr>
			<td><form:select id="tenant" name="tenant" path="idLokat" >
				<form:option value="">....</form:option>
				<c:forEach items="${lokatorList}" var="lokatorList">
					<form:option value="${lokatorList.idKont}">${lokatorList.pesel}</form:option>
				</c:forEach>
			</form:select></td>
          <td><form:input type="text" id="paymAmount" name="paymAmount" path="kwotaPlat"/></td>
          <td><form:input type="text" id="date" name="date" path="dtOperacji"/></td>
        </tr>
        
        
      </table>
       
        <div class="container">
        <button type="submit">Ksieguj</button>
        
        </div>
         </form:form>
    </body>
</html>

