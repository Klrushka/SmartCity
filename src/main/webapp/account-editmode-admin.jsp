<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 12.12.2021
  Time: 14:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="style/account.css">
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

<form method="post">
    <main class="main">


        <div class="page-label">Your Account</div>

        <div class="user-info">

            <div class="user-avatar">
                <img src="img/images.png">
            </div>

            <div class="user-data">
                <fieldset>
                    <legend>YOUR DATA</legend>
                    <label>
                        <a>
                            Unique id
                        </a>
                        <input name="id" value="${user1.id}" readonly>
                    </label>

                    <label>
                        <a>
                            Name
                        </a>
                        <input name="name" value="${user1.name}" type="text" required>
                    </label>
                    <label>
                        <a>
                            Birthday
                        </a>
                        <input name="birthday" value="${user1.birthday}" type="date" required>
                    </label>
                    <label>
                        <a>
                            Phone
                        </a>
                        <input name="phone" value="${user1.phone}" type="tel" required>
                    </label>
                    <label>
                        <a>
                            Password
                        </a>
                        <input name="password" value="${user1.password}" type="text" required>
                    </label>
                    <label>
                        <a>
                            Status
                        </a>
                        <input name="status" value="${user1.status}" required>
                    </label>
                    <label>
                        <a>
                            Mail
                        </a>
                        <input name="mail" value="${user1.mail}" type="email" required>
                    </label>
                    <label>
                        <a>
                            Access
                        </a>
                        <input name="access" value="${user1.access}" type="text" required>
                    </label>


                </fieldset>

            </div>

        </div>

        <div class="submit-button">
            <input type="submit" value="Done">
        </div>

    </main>
</form>

<footer class="footer">

</footer>
</body>
</html>
