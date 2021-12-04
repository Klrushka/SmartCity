<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 02.12.2021
  Time: 18:19
  To change this template use File | Settings | File Templates.
--%>
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
        Sign in
      </div>


      <div class="sign-up-input-form">

        <input name="email" type="email" required placeholder="  Your email">
        <input type="password" name="password" id="password-input" placeholder="  Password" required>

      </div>

      <br>

      <div class="start-submit-button">
        <input type="submit" value="Enter">
      </div>

    </div>
  </div>

</form>
</body>
<script src="js/welcome-page.js"></script>
</html>