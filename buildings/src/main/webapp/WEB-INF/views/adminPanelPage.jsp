<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
    
    .zalogowanoJako {
        text-align: right;
        color: black;
        font-family: verdana;
        font-size: 20px;
        color: #7f5dff;
    }
    
</style>    

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <body>
        <div class="zalogowanoJako">
            Zalogowano jako: ADMIN <br> <br>
        </div> 
        
        <div class="container" align="center">
            <form action="/buildings/account/add">
                <button>Dodaj konto pracownika/lokatora</button><br>
            </form>    
            <form action="/buildings/building/add">    
                <button>Rejestruj budynki i lokale</button>
            </form>    
        </div>
        
    </body>
</html>
