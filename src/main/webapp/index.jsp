<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core_1_1" %>
<%@ page contentType="text/html" pageEncoding="utf-8" language="java" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Main Page</title>
</head>
<body>

<h1>Main Page</h1><br/>

<br/>
<a href="${pageContext.request.contextPath}/app/login">Login</a>
<br/>
<a href="${pageContext.request.contextPath}/app/registration">Registration form</a>
<br/>
<a href="${pageContext.request.contextPath}/app/main">Main Page</a>

</body>
</html>