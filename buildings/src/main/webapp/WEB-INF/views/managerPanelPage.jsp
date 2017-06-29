<%-- 
    Document   : manager
    Created on : May 31, 2017, 11:41:25 AM
    Author     : denovi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<style>
    body {                                                              
        background-image: url(http://www.photos-public-domain.com/wp-content/uploads/2012/12/orange-and-blue-sunset-over-rolling-hills.jpg);
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
        
        transform: translateY(50%);
        /* margin-top: 300px;/* half of #content height*/
    }
</style>    

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <body>
        <jsp:include page="commonHeader.jsp" />
        <div class="container" align="center">
            <form action="/buildings/rent/price/set">
                <button>Ustal cennik</button><br>
            </form>    
            <form action="/buildings/rent/approve">    
                <button>Zatwierdź wynajem</button>
            </form>    
        </div>
        
    </body>
</html>
