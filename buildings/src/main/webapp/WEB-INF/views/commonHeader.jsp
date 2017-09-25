<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="authbar">

 	<c:url value="/j_spring_security_logout" var="logoutUrl" />
 	<!-- csrt for log out-->
	<form action="${logoutUrl}" method="post" id="logoutForm">
	  <input type="hidden"	name="${_csrf.parameterName}"
		value="${_csrf.token}" />
	</form>
	
	<script>
		function formSubmit() {
			document.getElementById("logoutForm").submit();
		}
	</script>
	
 	<% if (session.getAttribute("userData") != null) { %>
 		<span>Zalogowano jako: <strong>${sessionScope.userData}</strong></span>
 		<span class="floatRight">
		<a href="javascript:formSubmit()">Wyloguj</a>
		</span>
	<% } %>

</div>
