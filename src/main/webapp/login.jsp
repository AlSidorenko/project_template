<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>

<fmt:setBundle var="link" basename="lang" scope="session"/>


<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Login Page</title>

</head>
<body>

<div class=" text-center col-lg-12 my-12  ml-12">

    <h1>Login</h1><br/>

</div>

<div class=" text-center col-lg-3 my-5  ml-5">

    <form method="post" action="${pageContext.request.contextPath}/app/login" class="form-sigin">
        <table>
            <tbody>
            <tr>
                <td><label>Login:</label></td>
                <td><input type="text" class="form-control" name="login"/></td>
            </tr>

            <tr>
                <td><label>Password:</label></td>
                <td><input type="password" class="form-control" name="pass"/></td>
            </tr>

            <tr>
                <td><label></label></td>
                <td><input type="submit" value="Enter" class="submit"/></td>
            </tr>

            </tbody>
        </table>
    </form>

</div>

<br/>
<a href="${pageContext.request.contextPath}/app/main">Main Page</a>

</body>
</html>