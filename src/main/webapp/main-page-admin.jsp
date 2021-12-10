<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 08.12.2021
  Time: 17:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="style/main-page.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Nanum+Gothic&display=swap" rel="stylesheet">
</head>

<body>

<header class="header-menu">
    <ul>
        <li>SMART CITY</li>
        <li><a>Users</a></li>
        <li><div class="dropdown">
            <button class="dropbtn">Add data</button>
            <div class="dropdown-content">
                <a href="#">Atm</a>
                <a href="#">Hotels</a>
                <a href="AddHouseServlet">Houses</a>
                <a href="#">Parks</a>
                <a href="#">Shops</a>
                <a href="#">Transport</a>
            </div>
        </div></li>
        <li><a href="#about">About</a></li>
        <li><a href="#">Creator</a></li>
        <li><a href="#">Account</a></li>
    </ul>
</header>


<main class="main">

    <div class="welcome-block">
        <img src="img/p3.jpg" alt="pic">
        <div class="welcome-text">Welcome<strong>, ${user.name}</strong></div>
    </div>


    <br>


    <div class="columns">
        Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur tristique ac metus id pulvinar. Donec
        fermentum mi elit, et vehicula turpis rhoncus non. Sed rutrum metus elit, sit amet accumsan ligula faucibus
        molestie. Donec tempus mauris eget turpis tempus malesuada. Cras pretium vitae libero venenatis volutpat. Fusce
        quis quam at est interdum dictum. Praesent tempor metus augue, nec condimentum dolor blandit sodales. Integer id
        turpis interdum tellus gravida mollis. Nulla vestibulum eleifend sapien, eu ultricies quam posuere ac. Nam
        dictum, justo in bibendum fringilla, odio nunc pulvinar tellus, sit amet rhoncus leo felis ac orci. Suspendisse
        hendrerit nunc vel suscipit scelerisque. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per
        inceptos himenaeos.

        Mauris semper elit vitae erat faucibus placerat. Maecenas gravida ante quis varius condimentum. Quisque in metus
        pharetra, faucibus quam id, imperdiet libero. Sed quis massa eu risus sodales ultricies. Proin gravida vitae
        nulla et faucibus. Suspendisse potenti. Curabitur mollis, lacus sagittis iaculis convallis, nisi mauris blandit
        lectus, et convallis eros sapien in sapien. Aenean ligula turpis, molestie eu erat sit amet, tempor imperdiet
        tortor. Pellentesque faucibus magna at mauris rhoncus egestas. Fusce mollis arcu ut quam ultricies, nec pharetra
        augue eleifend.
    </div>


    <div class="about-block" id="about">


        <div class="about-text">
            <p>
                About us
            </p>


            <a>
                Lorem ipsum dolor sit amet, consectetur adipiscing elit.
                Phasellus ornare quam nec tortor vulputate placerat.
                Nam posuere, ex quis feugiat tempor, sapien nibh condimentum turpis, in mattis urna nisi a arcu.
                Pellentesque at tempor mi. Ut feugiat, nulla a fermentum viverra, tortor justo suscipit ipsum,
                nec pretium ante lectus quis nulla. Ut in laoreet leo. Aliquam erat volutpat. Pellentesque et arcu
                eleifend dolor molestie pellentesque sit amet vel eros. Nunc quis mi ex. Integer iaculis ipsum sed urna
                dapibus ultricies. Phasellus malesuada magna eu finibus fringilla. Sed ac dapibus diam. Cras ut dolor
                ornare, facilisis lectus nec,
                hendrerit mi. Quisque ut commodo mi, ut maximus nisi.
            </a>


        </div>

        <div class="about-pic">
            <img src="img/p2.jpg" alt="pic">
        </div>

    </div>

</main>

<div class="label-scroll-bar">
    On our website you can find
</div>

<div class="menu">
    <div class="menu-block">
        <p>Hotels</p>
        <div class="block hotel">
            <p>
                <a href="hotels">Looking for some sleep? Click here!</a>
            </p>

        </div>
    </div>
    <div class="menu-block">
        <p>Houses</p>
        <div class="block house">
            <p>
                <a href="HouseServlet">Looking for some kind of residential building?</a>

            </p>

        </div>

    </div>
    <div class="menu-block">
        <p>Parks</p>
        <div class="block park">
            <p>
                <a href="ParksServlet">Do you want to take a walk?</a>
            </p>
        </div>
    </div>
    <div class="menu-block">
        <p>Shops</p>
        <div class="block shop">
            <p>
                <a href="ShopsServlet">Souvenirs? Clothing? Something else?</a>
            </p>
        </div>
    </div>
    <div class="menu-block">
        <p>Transport</p>
        <div class="block transport">
            <p>
                <a href="TransportServlet">
                    Bus? Trolleybus? Taxi?
                </a>

            </p>
        </div>
    </div>
</div>

<footer class="footer">

</footer>
</body>
</html>