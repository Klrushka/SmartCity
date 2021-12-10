<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 05.12.2021
  Time: 15:43
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="style/data-table.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Nanum+Gothic&display=swap" rel="stylesheet">
</head>

<body>

<header class="header-menu">
    <ul>
        <li>SMART CITY</li>
        <li><a href="#about">About</a></li>
        <li><a href="#">Creator</a></li>
        <li><a href="#">Account</a></li>
    </ul>
</header>


<main class="main">

    <div class="page-label">
        <p>
            TRANSPORT
        </p>

    </div>


    <div class="info-page">


        <div class="tbl-header">
            <table cellpadding="0" cellspacing="0" border="0">
                <thead>
                <tr>
                    <th>Number</th>
                    <th>Type</th>
                    <th>Root Name</th>
                </tr>
                </thead>
            </table>
        </div>
        <div class="tbl-content">
            <table cellpadding="0" cellspacing="0" border="0">
                <tbody>
                <c:forEach var="transport" items="${transports}">
                    <tr>
                        <td><a>${transport.number}</a></td>
                        <td><a>${transport.type}</a></td>
                        <td><a>${transport.rootName}</a></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</main>

<footer class="footer">

</footer>
</body>
</html>