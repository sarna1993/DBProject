<%-- 
    Document   : lokator
    Created on : 2017-05-21, 20:54:10
    Author     : Klaudia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <style>
        
    body {                                                              
        background-image: url(http://azuretwilight.org/images/themes/azure_twilight/background_space_purple.png);
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
        padding: 20px 20px;
        margin: 8px 0;
        border: none;
        cursor: pointer;
        width: 60%;
        font-family: verdana;
        font-size: 20px;
    }
    
    .container {                                
        padding: 16px;
        width: 100%;
        position: absolute;
        margin-left: auto;
        margin-right: auto;
        left: 0;
        right: 0;
        color: white;
        text-transform: uppercase;
    }
    
</style> 
    
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
		<jsp:include page="commonHeader.jsp" />
        
        <div class="container" align="center">
            <form action="/buildings/defect/report">
                <button>Zglos usterke</button><br>
            </form>    
            <form action="/buildings/charges/monthly">    
                <button>Pokaz miesieczne zestawienia</button>
            </form>  
            <form action="/buildings/payments/history">    
                <button>Pokaz zestawienie dokonanych wplat</button>
            </form> 
        </div>
        
    </body>
</html>
