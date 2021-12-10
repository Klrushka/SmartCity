<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 05.12.2021
  Time: 19:19
  To change this template use File | Settings | File Templates.
--%>
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
        <li>SMART CITY</li>
        <li><a href="#about">About</a></li>
        <li><a href="#">Creator</a></li>
        <li><a href="#">Account</a></li>
    </ul>
</header>


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

        <p>
            User(1)
        </p>
        <div class="comment">

            <p>
                Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas sodales ante vitae dolor suscipit, nec
                tempor massa scelerisque. Curabitur eget arcu eu nibh dignissim porttitor ac eget libero.
                Sed ultrices tortor non gravida gravida. Suspendisse potenti. Vestibulum euismod odio nec ex posuere,
                non varius enim posuere. Nullam iaculis consequat tellus egestas convallis. Donec ut pulvinar dui, non
                fringilla nulla.
                Proin tempus orci velit, eget maximus ligula condimentum eu. Duis scelerisque tincidunt gravida. Nunc
                posuere neque et imperdiet ultricies. Morbi sem nulla, sodales vel congue ac, convallis ut libero.
                Mauris blandit libero sed sagittis interdum.
                Mauris lacus est, rutrum non arcu quis, luctus commodo lacus.
                Aliquam dictum mauris quis purus lacinia, in mollis dui eleifend. Integer ac blandit arcu.
            </p>

        </div>
        <p>
            time
        </p>



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

<footer class="footer">

</footer>
</body>
</html>