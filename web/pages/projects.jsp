<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<c:set var="language"
       value="${not empty param.language ? param.language : not empty language ? language : pageContext.request.locale}"
       scope="session"/>
<fmt:setLocale value="${language}"/>
<fmt:setBundle basename="com.java.task11.i18n.text"/>

<html lang="${language}">
<head>
    <title>Projects</title>
    <jsp:include page="parts/header.jsp"/>
</head>

<body>
<div class="container projects">
    <div class="col-md-10 col-xs-12 col-md-offset-1">
        <jsp:include page="parts/navbar.jsp"/>
    </div>

</div>
</body>
</html>
