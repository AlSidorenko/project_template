<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isELIgnored="false" %>

<fmt:setBundle var="link" basename="lang" scope="session" />



<html>
<head>
    <title></title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.2/css/all.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/styles.css"/>

    <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
    <script src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
    <link rel="stylesheet" type="text/css" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">

</head>

<nav class="navbar navbar-expand-lg sticky-top navbar-default">

    <div class="collapse navbar-collapse ml-4">
        <ul class="navbar-nav">
            <li class="nav-item active">
                <a href="${pageContext.request.contextPath}/app/main"><img src="${pageContext.request.contextPath}\pic\bg\logo.png" width="30" border="0"/></a>
            </li>
        </ul>
    </div>


    <div class="collapse navbar-collapse justify-content-end">
        <a class="nav-link" href="${pageContext.request.contextPath}/app/logout"><fmt:message key="log.out" bundle="${link}"/></a>
    </div>

    <ul class="navbar-nav ml-auto">
        <li class="nav-item dropdown mybutton">
            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
                <fmt:message key="language" bundle="${link}"/>
            </a>
            <div class="crystal shadow-c dropdown-menu dropdown-menu-right animate slideIn" aria-labelledby="navbarDropdown">
                <a class="dropdown-item" href="${pageContext.request.contextPath}?lang=en">
                    <img src="${pageContext.request.contextPath}/pic/langs/usa.svg" style="width: 50%"/>
                    <fmt:message key="lang.eng" bundle="${link}"/>
                </a>
                <a class="dropdown-item" href="${pageContext.request.contextPath}?lang=uk">
                    <img src="${pageContext.request.contextPath}/pic/langs/ua.svg" style="width: 50%"/>
                    <fmt:message key="lang.ukr" bundle="${link}"/>
                </a>
            </div>
        </li>
    </ul>


</nav>

