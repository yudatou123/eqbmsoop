<%@ page contentType="text/html;charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<% String message=(String)request.getAttribute("sql"); %>
<html>
<body>
<h2><%=message%></h2>
</body>
</html>
