<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<c:set var="language"
       value="${not empty param.language ? param.language : not empty language ? language : pageContext.request.locale}"
       scope="session"/>
<fmt:setLocale value="${language}"/>
<fmt:setBundle basename="com.java.task11.i18n.text"/>

<nav class="navbar navbar-inverse navbar-embossed" role="navigation">
    <div class="collapse navbar-collapse" id="navbar-collapse-01">
        <form class="navbar-form navbar-right" action="#" role="search">
            <div class="form-group">
                <div class="input-group">
                    <input class="form-control" id="navbarInput-01" type="search" placeholder="Search">
          <span class="input-group-btn">
            <button type="submit" class="btn"><span class="fui-search"></span></button>
          </span>
                </div>
            </div>
        </form>

        <% if (request.getSession().getAttribute("employee") != null) { %>
        <div class="navbar-right logged-user">
            <div class="profile-image flow-img" style="background-image:url(../img/employees/${employee.image})"></div>
            <%--link to employee info page--%>
            <p><a href="/employeeinfo?info=${employee.id}" ${employee.firstName} ${employee.lastName}></a></p>
            <ul class="nav navbar-nav navbar-right">
                <c:if test="${employee.role} eq admin">
                    <li>
                        <a href="<c:url value="/admin/employeestable"/>"><fmt:message key="nav.dropdown.admin"/></a>
                    </li>
                    <li class="divider"></li>
                </c:if>
                <c:if test="${employee.role} eq manager">
                    <li>
                        <a href="<c:url value="/manager/project"/>"><fmt:message key="nav.dropdown.manager"/></a>
                    </li>
                    <li class="divider"></li>
                </c:if>
                <li>
                    <a href="<c:url value="/login?logout=${employee.id}"/>"><fmt:message key="nav.dropdown.logout"/></a>
                </li>
                <li class="lang">
                    <a href="<%= request.getContextPath()%>?language=${language == 'uk' ? 'en' : 'uk'}">
                        ${language == 'uk' ? 'EN' : 'UKR'}
                    </a>
                </li>
            </ul>
        </div>
        <% } else {%>
        <ul class="nav navbar-nav navbar-right">
            <li>
                <a href="<c:url value="/login"/>"><fmt:message key="nav.dropdown.login"/></a>
            </li>
            <li class="divider"></li>
            <li>
                <a href="<c:url value="/registration"/>"><fmt:message key="nav.dropdown.singup"/></a>
            </li>
            <li class="lang">
                <a href="<%= request.getContextPath()%>?language=${language == 'uk' ? 'en' : 'uk'}">
                    ${language == 'uk' ? 'EN' : 'UKR'}
                </a>
            </li>
        </ul>
        <% } %>
    </div>
</nav>