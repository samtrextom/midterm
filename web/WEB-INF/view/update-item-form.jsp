
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <meta charset="UTF-8">
    <link rel="stylesheet" href="../resources/css/style.css"/>
    <title>Add Item</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="/">&lt; Flat Azeroth Society &gt; Guild Bank</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNavDropdown">
        <ul class="navbar-nav">
            <li class="nav-item active">
                <a class="nav-link" href="/">Home <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item active">
                <a class="nav-link" href="/item/list">All Items <span class="sr-only">(current)</span></a>
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
<div id="wrapper">
    <div id="header">
        <h2>New Item</h2>
    </div>
</div>

<%--@elvariable id="aItem" type="Item"--%>
<form:form action="save" modelAttribute="aItem" enctype="multipart/form-data">
    <form:hidden path="id" value="${aItem.id}"/>

    <table>
        <tr>
            <td><label>Name</label></td>
            <td><form:input path="name" itemValue="${aItem.name}"/>
                <form:errors path="name" cssClass="error"/></td>
        </tr>
        <tr>
            <td><label>Quantity</label></td>
            <td><form:input path="quantity" itemValue="${aItem.quantity}"/>
                <form:errors path="quantity" cssClass="error"/></td>
        </tr>
        <tr>
            <td><label>Item Type</label></td>
            <td><form:select items="${types}" path="item_type"
                             itemLabel="name" itemValue="id">
            </form:select></td>
        </tr>
        <tr>
            <td><label>Item Category</label></td>
            <td><form:select items="${categories}" path="item_cat"
                             itemLabel="name" itemValue="id">
            </form:select></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Save" class="save"></td>
        </tr>
    </table>
</form:form>
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