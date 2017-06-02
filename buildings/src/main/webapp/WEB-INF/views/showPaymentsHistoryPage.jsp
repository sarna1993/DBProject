<%-- 
    Document   : lokatorWplaty
    Created on : 2017-05-21, 20:57:40
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
            Zalogowano jako: LOKATOR <br> <br>
        </div> 
        
        <h1><b>ZESTAWIENIE DOKONANYCH WPLAT</b></h1>
        <br>
        <!-- TABELA !!!-->
        <table cellpadding="10">
        <tr>
          <th>Kolumna 1</th>
          <th>Kolumna 2</th>
          <th>Kolumna 3</th>
          <th>Kolumna 4</th>
        </tr>
        <tr>
          <td>w1</td>
          <td>w1</td>
          <td>w1</td>
          <td>w1</td>
        </tr>
        <tr>
          <td>w2</td>
          <td>w2</td>
          <td>w2</td>
          <td>w2</td>
        </tr>
        <tr>
          <td>w3</td>
          <td>w3</td>
          <td>w3</td>
          <td>w3</td>
        </tr>
        <tr>
          <td>w4</td>
          <td>w4</td>
          <td>w4</td>
          <td>w4</td>
        </tr>
      </table>
        
    </body>
</html>
