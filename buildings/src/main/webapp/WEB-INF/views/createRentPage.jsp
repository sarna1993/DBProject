<%-- 
    Document   : managerUstal
    Created on : May 31, 2017, 11:47:44 AM
    Author     : denovi
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
    </head>
    <body>
        <div class="zalogowanoJako">
            Zalogowano jako: BASIA <br> <br>
       </div>
        
       
        <h1><b>Wyslij do managera</b></h1>
        <br>        
        <table cellpadding="10">
        <tr>
          <th>Miasto</th>
          <th>Ulica</th>
          <th>Nr budynku</th>
          <th>Nr lokalu</th>
          <th>Pesel wynajmującego</th>
          <th>Od kiedy</th>
          <th>Do kiedy</th>
          <th>Cena</th>
        </tr>
        <tr>
          <td><select name="nazwa">
            <option>Miasto 1</option>
            <option selected="selected">Miasto 2<option>
            </select></td>
          <td><select name="nazwa">
            <option>Tu wpisz pierwszą możliwość</option>
            <option selected="selected">Tu wpisz drugą możliwość<option>
            </select></td> 
          <td><select name="nazwa">
            <option>Tu wpisz pierwszą możliwość</option>
            <option selected="selected">Tu wpisz drugą możliwość<option>
            </select></td> 
          <td><select name="nazwa">
            <option>Tu wpisz pierwszą możliwość</option>
            <option selected="selected">Tu wpisz drugą możliwość<option>
            </select></td> 
          <td><select name="nazwa">
            <option>Tu wpisz pierwszą możliwość</option>
            <option selected="selected">Tu wpisz drugą możliwość<option>
            </select></td>
          <td><input type="text" name="uname" required></td>
          <td><input type="text" name="uname" required></td>
          <td><input type="text" name="uname" required></td>
        </tr>
        
        
      </table>
       
        <div class="container">
        <button type="submit">Wyslij</button>
        
        </div>
        
    </body>
</html>

