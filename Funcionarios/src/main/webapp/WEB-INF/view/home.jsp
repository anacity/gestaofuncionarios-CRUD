<%@ page language="java" contentType="text/html; charset=ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/home.css">
    <title>Gerenciamento de funcionários</title>
    <style>
        @import url('https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,100..900;1,100..900&family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap');
    </style>
</head>
<body>
    <nav>
        <div class="heading">
            <img src="images/1.png">
            <h1>DYNAMIC MANAGEMENT</h1>
        </div>
        <div class="btn-novofuncionario">
            <a href="form">Novo funcionário</a>
        </div>
    </nav>

    <div class="banner">
        <img src="images/Blue Zigzag Lines Store Header (1).png" alt="">
    </div>

    <h3 class="title-list">Nossos funcionários</h3>

    <div class="container">
    
    	<c:forEach items="${funcionarios}" var="funcionario">
    	
         <div class="funcionario">
            <img src="images/user.png" alt="">
            <h2>${funcionario.nome}</h2>
            <p>${funcionario.cargo}</p>
            <a href="funcionario?idFuncionario=${funcionario.id}">
            <button>Mais informações</button></a>
        </div>
        
        </c:forEach>
    </div>
    
    <footer>
        <p>2023 - Todos os direitos reservados</p>
        <p>Entre em contato pelo e-mail: dynamicmanagement@gmail.com</p>
    </footer>
    
</body>
</html>