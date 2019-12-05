
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <meta charset="UTF-8">
    <link rel="stylesheet" href="../resources/css/style.css"/>
    <title>Title</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="#">&lt; Flat Azeroth Society &gt; Guild Bank</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNavDropdown">
        <ul class="navbar-nav">
            <li class="nav-item active">
                <a class="nav-link" href="index.jsp">Home <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="/" id="navbarDropdownMenuLink" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    Item Categories
                </a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                    <a class="dropdown-item" href="/item/list/pots">Potions/Consumables</a>
                    <a class="dropdown-item" href="/item/list/craft">Crafting Materials</a>
                    <a class="dropdown-item" href="/item/list/armory">Weapons/Armor</a>
                    <a class="dropdown-item" href="/item/list/misc">Misc</a>
                </div>
            </li>
        </ul>
    </div>
</nav>
<div class="container">
    <div class="cat-div">
        <h3>View All Items</h3>
        <div class="hiddenSlider1">
            <a class="btn btn-primary" href="/item/list" role="button">Open Up</a>
        </div>
    </div>
    <div class="cat-div">
        <h3>Potions and Consumables</h3>
        <div class="hiddenSlider1">
            <a class="btn btn-primary" href="/item/list/pots" role="button">Open Up</a>
        </div>
    </div>
    <div class="cat-div">
        <h3>Crafting Materials</h3>
        <div class="hiddenSlider2">
            <a class="btn btn-primary" href="/item/list/craft" role="button">Open Up</a>
        </div>
    </div>
    <div class="cat-div">
        <h3>Weapons and Armor</h3>
        <div class="hiddenSlider3">
            <a class="btn btn-primary" href="/item/list/armory" role="button">Open Up</a>
        </div>
    </div>
    <div class="cat-div">
        <h3>Miscelaneous</h3>
        <div class="hiddenSlider4">
            <a class="btn btn-primary" href="/item/list/misc" role="button">Open Up</a>
        </div>
    </div>
</div>
<footer>
    <div className="container-fluid footerMain">
        <div className="row">
            <div className="col-sm" id="footLeft">
                <h5>Connect With Us</h5>
                <div className='socialMediaIcons'>
                    <div className = 'fbIcon' ></div>
                    <div className = 'igIcon' ></div>
                    <div className = 'twIcon' ></div>
                    <div className = 'pnIcon' ></div>
                </div>
                <p className='footerPhoneNumber'>(414)123-4567</p>
                <br/>
                <br/>
                <Link>
                <p className='footerContactLink'>Contact Us</p>
                </Link>
            </div>
            <div className="col-sm" id="footMid">
                <h5></h5>
            </div>
        </div>
    </div>
    <div className="footBot">
        Copyright &copy; 2019 Team Red Shoes DevTeam
        <br>
        <a href="samtrextom@gmail.com">samtrextom@gmail.com</a>
    </div>
    <div className="col-sm" id="footRight">

    </div>
</footer>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</body>
</html>