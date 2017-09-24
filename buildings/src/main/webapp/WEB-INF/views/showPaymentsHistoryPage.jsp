<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
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
        <title>Pokaż rozliczenia</title>
    </head>
 <body>
<jsp:include page="commonHeader.jsp" />
    <div class="container">
        <div class="panel panel-default">
              <!-- Default panel contents -->
            <div class="panel-heading"><span class="lead">Miesięczne zestawienie</span></div>
            <table class="table table-hover">
                <thead>
                    <tr>
                        <th>Data wystawienia</th>
                        <th>Termin płatności</th>
                        <th>Saldo miesięczne</th>
                        <th>Obciążenie</th>
                    </tr>
                </thead>
                <tbody>
                <c:forEach items="${payments}" var="p">
                    <tr>
                        <td>${p.data}</td>
                        <td>${p.terminPlat}</td>
                        <td>${p.saldoMies}</td>
                        <td>1500</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</body>
</html>
