<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>SmartCity</title>
    <link rel="stylesheet" href="style/welcome-registration-page.css">
</head>
<body>


<form method="post">
    <div>
        <div class="star-text">
            Smart City
        </div>


        <div class="sign-up">

            <div class="star-text-registration">
                Registration
            </div>


            <div class="sign-up-input-form">

                <input name="email" type="email" required placeholder="  Your email">
                <input name="name" type="text" required placeholder="  Your name">
                <input type="date" name="birthday" placeholder="YYYY-MM-DD" required
                       id="birthday"/>
                <input type="tel" name="phone" id="phonenumber-input" placeholder="  Phone" required
                       pattern="+?[0-9]{12}">
                <input type="password" name="password" id="password-input" placeholder="  Password" required>

            </div>

            <br>

            <div class="start-submit-button">
                <input type="submit" value="Send request">
                <br>
            </div>

            <div class="login-text">
                <a href="login">Have account?</a>
            </div>


        </div>
    </div>

</form>
</body>
<script src="js/welcome-page.js"></script>
</html>