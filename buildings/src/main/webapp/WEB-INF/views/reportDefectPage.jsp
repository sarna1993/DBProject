<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<style>
    body {                                                              
        position: relative;
        background-image: url(http://azuretwilight.org/images/themes/azure_twilight/background_space_purple.png);
        /* background-image: url(http://www.intrawallpaper.com/static/images/New-York-City-Desktop-Wallpaper.jpg); */
        background-repeat:no-repeat;
        background-size:100% 100vh;
        margin : 0;
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
    
    .container {                                
        text-align: center;
        width: 100%;
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
    
    .field{
        height:300px;
    }

        /*button*/
    button {
        background-color: #7f5dff;
        color: white;
        padding: 10px 20px;
        margin: 8px 0;
        border: none;
        cursor: pointer;
        width: 20%;
        font-family: verdana;
        font-size: 15px;
    }
    
</style> 

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
		<jsp:include page="commonHeader.jsp" />
        
        <h1><b>ZGŁOSZENIE USTERKI</b></h1>
        
        <div class="container">
        <form:form method="post" action="addDefect" commandName="ustModel">
        	<form:label path="lokalna">Czy to usterka lokalna?</form:label>
            <form:checkbox path="lokalna" />
            <br> <br>
            <form:label path="opis">Opis usterki</form:label>
            <br>
            <td><form:input path="opis" size="100"/></td>
            <br>
        
            <button type="submit">Zglos</button>
            </form:form>
        </div>
        
    </body>
</html>
