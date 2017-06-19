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
    </head>
    <body>
        <jsp:include page="commonHeader.jsp" />
        
        <h1><b>DODAWANIE KONTA PRACOWNIKA/LOKATORA</b></h1>
       
        <div class="container">
        <form:form method="post" action="addAccount" commandName="kontoModel">
            <label>Typ konta</label> 
            <br>
            <form:select path="typKonta">
 			<form:option value="" label="...." />
 			<form:options items="${rolesList}"/>
 			</form:select>
            <br><br>
            <form:label path="login">Login</form:label>
            <form:input path="login" required="required"/>
            <br>
            <form:label path="passw">Haslo</form:label>
            <form:input type="password" path="passw" required="required"/>
            <br>
            <form:label path="imie">Imie</form:label>
            <form:input path="imie" required="required"/>
            <br>
            <form:label path="nazwisko">Nazwisko</form:label>
            <form:input path="nazwisko" required="required"/>
            <br>
            <form:label path="pesel">Pesel</form:label>
            <form:input path="pesel" required="required"/>
            <br>
            <form:label path="telefon">Telefon</form:label>
            <form:input path="telefon" required="required"/>
            <br>
            <form:label path="email">Email</form:label>
            <form:input path="email" required="required"/>
            <br>
       
        <button type="submit">Dodaj osobe</button>
        </form:form>
        </div>
        
    </body>
</html>
