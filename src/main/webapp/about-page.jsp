<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 05.12.2021
  Time: 19:19
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="style/about.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Nanum+Gothic&display=swap" rel="stylesheet">
</head>

<body>

<header class="header-menu">
    <ul>
        <li><a href="MainServlet">SMART CITY</a></li>
        <li><a href="#about">About</a></li>
        <li><a href="#">Creator</a></li>
        <li><a href="#">Account</a></li>
    </ul>
</header>

<form method="post" >


    <main class="main">

        <div class="about-block">


            <div class="about-img">
                <img src="img/p1.jpg">
            </div>


            <div class="about-text">
                <h1>
                    ABOUT
                </h1>


                <p>
                    ${about.text}
                </p>
            </div>


        </div>


        <div class="comments">
            <c:forEach var="comment" items="${comments}">

                <p>
                        ${comment.userName} (${comment.userId})
                </p>
                <div class="comment">

                    <p>
                            ${comment.text}
                    </p>

                </div>
                <p>
                    <fmt:formatDate type="both" dateStyle="short" timeStyle="short" value="${comment.time}"/>

                </p>
            </c:forEach>


            <div class="com-t">
                Your Comment:
            </div>

            <div class="input-com">
                <textarea name="com"></textarea>
            </div>

        </div>

        <div class="start-submit-button">
            <input type="submit" value="Comment">
            <br>
        </div>

    </main>
</form>
<footer class="footer">

</footer>
</body>
</html>