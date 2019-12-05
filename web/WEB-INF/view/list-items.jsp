<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Items</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <meta charset="UTF-8">
    <link rel="stylesheet" href="../resources/css/style.css"/>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>
<div id="container">
    <div id="content">
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
        <button class="add-button"
                onclick="window.location.href='showAddItemForm'; return false;">Add Item</button>
        <form:form action="search" method="GET">
            <input type="search" name="searchTerm">
            <input type="submit" value="Search" class="add-button">
        </form:form>
        <table>
            <tr>
                <th>Name</th>
                <th>Category</th>
                <th>Type</th>
                <th>Quantity</th>
                <th>Action</th>
            </tr>
            <c:forEach var="tempItem" items="${items}">
                <c:url var="updateLink" value="/item/showUpdateItemForm">
                    <c:param name="itemId" value="${tempItem.id}"/>
                </c:url>
                <c:url var="deleteLink" value="/item/delete">
                    <c:param name="itemId" value="${tempItem.id}"/>
                </c:url>
                <tr>

                    <td>${tempItem.name}</td>
                    <td>${tempItem.item_cat.name}</td>
                    <td>${tempItem.item_type.name}</td>
                    <td>${tempItem.quantity}</td>
                    <td>
                        <a href="${updateLink}">Update</a>
                        &nbsp;|&nbsp;
                        <a href="${deleteLink}"
                           onclick="if (!confirm('Are you sure?')) return false">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
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