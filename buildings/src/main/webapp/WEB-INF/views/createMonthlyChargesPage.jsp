<%-- 
    Document   : managerUstal
    Created on : May 31, 2017, 11:47:44 AM
    Author     : denovi
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<style>
body {
	background-image:
		url(http://www.photos-public-domain.com/wp-content/uploads/2012/04/coral-pink-blossoms.jpg);
	background-repeat: no-repeat;
	background-size: 100% 100vh;
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

input[type=text] {
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
<script type="text/javascript"
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>

<script type="text/javascript">
	function getObciazenie4SelectedLokator() {
		var tenant = $('#tenant').val();
		$.ajax({
			url : '../ajax/getObciazenie4SelectedLokator',
			method : 'POST',
			datatType : 'json',
			data : {
				tenant : tenant
			},
			error : function(xhr, response, errorThrown) {
				alert(errorThrown);
			},
			success : function(data) {
				if (data != null) {
					$('#price').val(data);
				}
			}
		});
	}
</script>

</head>
<body>
	<jsp:include page="commonHeader.jsp" />
	<h1>
		<b>Wyslij do managera</b>
	</h1>
	<br>
	<form:form method="post" action="createNewMonthlyCharges"
		commandName="rozliczenieModel">
		<table cellpadding="10">
			<tr>
				<th>PESEL lokatora</th>
				<th>Miesiac</th>
				<th>Rok</th>
				<th>Data rozliczenia</th>
				<th>Termin platnosci</th>
				<th>Cena</th>
			</tr>
			<tr>
				<td><form:select id="tenant" name="tenant" path="idLokat" onchange="getObciazenie4SelectedLokator()">
						<form:option value="">....</form:option>
						<c:forEach items="${lokatorList}" var="lokatorList" >
							<form:option value="${lokatorList.idKont}">${lokatorList.pesel}</form:option>
						</c:forEach>
					</form:select></td>
				<td><form:select id="month" name="month" path="okres.mies">
						<form:option value="">....</form:option>
						<c:forEach items="${monthList}" var="monthList" varStatus="loop">
							<form:option value="${loop.index + 1}">${monthList}</form:option>
						</c:forEach>
					</form:select></td>
				<td><form:select id="year" name="year" path="okres.rok">
						<form:option value="">....</form:option>
						<c:forEach items="${yearList}" var="yearList">
							<form:option value="${yearList}">${yearList}</form:option>
						</c:forEach>
					</form:select></td>
				<td><form:input type="text" id="date" name="date" path="data" /></td>
				<td><form:input type="text" id="deadline" name="deadline"
						path="terminPlat" /></td>
				<td><form:input type="text" id="price" name="price"
						path="obciazenie"  /></td>
			</tr>


		</table>

		<div class="container">
			<button type="submit">Wyslij</button>

		</div>
	</form:form>
</body>
</html>

