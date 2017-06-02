
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
        <div class="zalogowanoJako">
            Zalogowano jako: ADMIN <br> <br>
        </div> 
        
        <h1><b>DODAWANIE KONTA PRACOWNIKA/LOKATORA</b></h1>
       
        <div class="container">
            <label>Typ konta</label> 
            <br>
            <select name="typKonta" >
                 <option value="lokator" size="60">Lokator</option>
                 <option value="manager">Manager</option>
                 <option value="basia">Basia</option>
                 <option value="admin">Admin</option>
            </select> 
            <br><br>
            <label>Imie</label>
            <input type="text" name="uname" required>
            <br>
            <label>Nazwisko</label>
            <input type="text" name="uname" required>
            <br>
            <label>Pesel</label>
            <input type="text" name="uname" required>
            <br>
            <label>Telefon</label>
            <input type="text" name="uname" required>
            <br>
            <label>E-mail</label>
            <input type="text" align="left" name="uname" required>
            <br> <br>
       
        <button type="submit">Dodaj osobe</button>
        
        </div>
        
    </body>
</html>
