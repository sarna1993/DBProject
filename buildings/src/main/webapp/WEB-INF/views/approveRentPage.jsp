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
        background-image: url(http://www.photos-public-domain.com/wp-content/uploads/2012/12/orange-and-blue-sunset-over-rolling-hills.jpg);
        background-repeat:no-repeat;
        background-size:100% 100vh;
        background-position: right top;
        background-attachment: fixed;
        background-color: black;
    }
    
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
    
    /*tabela*/
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
    th{
        color: #7f5dff;
        vertical-align: middle;
    }
    td{
        color: #000000;
        vertical-align: middle;
    }
    tr:nth-child(even){background-color: #f2f2f2}
    
</style> 

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="zalogowanoJako">
            Zalogowano jako: MANAGER <br> <br>
        </div> 
        
        <h1><b>Zatwierdź wynajem</b></h1>
        <br>
        <!-- TABELA !!!-->
        <table cellpadding="10">
        <tr>
          <th>Imie</th>
          <th>Nazwisko</th>
          <th>Pesel</th>
          <th>Cena aktualna</th>
          <th></th>
        </tr>
        <tr>
          <td>w1</td>
          <td>w1</td>
          <td>w1</td>
          <td>w1</td>
          <td><input type="checkbox" name="uname" required></td>
        </tr>
        <tr>
          <td>w2</td>
          <td>w2</td>
          <td>w2</td>
          <td>w2</td>
          <td><input type="checkbox" name="uname" required></td>
        </tr>
        <tr>
          <td>w3</td>
          <td>w3</td>
          <td>w3</td>
          <td>w3</td>
          <td><input type="checkbox" name="uname" required></td>
        </tr>
        <tr>
          <td>w4</td>
          <td>w4</td>
          <td>w4</td>
          <td>w4</td>
          <td><input type="checkbox" name="uname" required></td>
        </tr>
      </table>
        
        <div class="container">
            <button type="submit">Zatwierdz</button>
        </div>
         
    </body>
</html>
