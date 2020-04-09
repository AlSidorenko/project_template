<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Registration Page</title>

    <!--link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.2/css/all.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/styles.css"/ -->

</head>
<body>

<!-- jsp:include page="WEB-INF/views/header.jsp"/ -->

<h2>
    This is registration form<br/>
</h2>

<!-- form method="post" action="${pageContext.request.contextPath}/app/registration">

    <label>
        <h6>Please enter first name</h6>
        <input type="text" name="first_name">
    </label>
    <label>
        <h6>Please enter last name</h6>
        <input type="text" name="last_name">
    </label>
    <label>
        <h6>Please enter login</h6>
        <input type="text" name="login">
    </label>
    <label>
        <h6>Please enter your password</h6>
        <input type="text" name="password">
    </label><br/>
    <input class="button" type="submit" value="Register">
</form -->

<form method="post" action="${pageContext.request.contextPath}/app/registration" class="form-sigin">
    <table>
        <tbody>
        <tr>
            <td><label>Please enter first name:</label></td>
            <td><input type="text" class="form-control" name="first_name"/></td>
        </tr>

        <tr>
            <td><label>Please enter last name:</label></td>
            <td><input type="text" class="form-control" name="last_name"/></td>
        </tr>

        <tr>
            <td><label>Please enter login:</label></td>
            <td><input type="text" class="form-control" name="login"/></td>
        </tr>

        <tr>
            <td><label>Please enter your password:</label></td>
            <td><input type="password" class="form-control" name="password"/></td>
        </tr>

        <tr>
            <td><label></label></td>
            <td><input type="submit" value="Enter" class="submit"/></td>
        </tr>

        </tbody>
    </table>
</form>

<a href="${pageContext.request.contextPath}/app/logout">Main Page</a>
</body>
</html>