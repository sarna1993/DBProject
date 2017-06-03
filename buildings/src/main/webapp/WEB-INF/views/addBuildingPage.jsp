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
        <form action="addBuilding" method="get">
            <label>Numer budynku</label>
            <input type="text" name="_name" required>
            <br>
            <label>Powierzchnia budynku</label>
            <input type="text" name="_area" required>
            <br>
            <label>Czy jest winda</label>
            <input type="checkbox" name="_isElevator" required>
            <br>            
            <label>Liczba pieter</label>
            <input type="text" name="_floors" required>
            <br>

            <button type="submit">Dodaj budynek</button> 
            </form>
            <br><br><br><br><br>

            <!-- wybor z tabeli DODAC !!!-->

            <label>Numer lokalu</label>
            <input type="text" name="uname" required>
            <br>
            <label>Powierzchnia lokalu</label>
            <input type="text" name="uname" required>
            <br>
            <label>Czy jest balkon</label>
            <input type="checkbox" name="uname" required>
            <br>            
            <label>Liczba pomieszczen</label>
            <input type="text" name="uname" required>
            <br>

            <button type="submit">Dodaj lokal</button>
        
        </div>
    </body>
    
</html>
