<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Admin Page</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.2/css/all.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/styles.css"/>

</head>
<body>

<!-- jsp:include page="/WEB-INF/views/header.jsp"/ -->

<br>

<h1>Hello ADMIN!</h1></br>
<h2>Welcom back!</h2>
<a href="${pageContext.request.contextPath}/app/logout">Logout</a></br>
<a href="${pageContext.request.contextPath}/app/logout">Main Page</a>

</body>
</html>