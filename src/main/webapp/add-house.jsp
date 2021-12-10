<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 08.12.2021
  Time: 19:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="style/add-data.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Nanum+Gothic&display=swap" rel="stylesheet">
</head>

<body>
<form method="post" action="AddHouseServlet">
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
                HOUSE
            </p>

        </div>


        <div class="input-block">
            <fieldset>
                <legend>ENTER DATA</legend>

                <a>
                    Address
                </a>
                <input name="address" type="text" required>
                <a>
                    Rating
                </a>
                <input name="rating" type="number" max="5" step="1" required>
                <a>
                    Floors
                </a>
                <input name="floors" type="number" step="1" required>
                <a>
                    Flats
                </a>
                <input name="flats" type="number" step="1" required>
            </fieldset>
        </div>

        <div class="input-block-about">
            <fieldset>
                <legend>ABOUT TEXT</legend>
                <textarea name="about">

            </textarea>
            </fieldset>

        </div>

        <div class="input-button">
            <input type="submit" value="Add">
        </div>

    </main>


    <footer class="footer">

    </footer>
</form>
</body>
</html>
