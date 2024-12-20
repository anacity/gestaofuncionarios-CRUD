<%@ page language="java" contentType="text/html; charset=ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/funcionario.css">
    <title>Funcionário</title>
    <style>
        @import url('https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,100..900;1,100..900&family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap');
    </style>
</head>
<body>
    <header>
        <a href="home"><img src="images/1.png" width="80px" height="80px"></a>
    </header>

    <div class="funcionario">
        <img src="images/user.png">
        <div class="funcionario-details">
            <h2>Nome: ${funcionario.nome}</h2>
            <h3>Cargo: ${funcionario.cargo}</h3>
            <h3>Idade: ${funcionario.idade}</h3>
            <div class="btn">
                <a href="form?idFuncionario=${funcionario.id}"><button class="btn-editar">Editar</button></a>
                <a href="deletarFuncionario?idFuncionario=${funcionario.id}"><button class="btn-deletar">Deletar</button></a>
            </div>
        </div>
    </div>
    
    <footer>
        <p>2023 - Todos os direitos reservados</p>
        <p>Entre em contato pelo e-mail: dynamicmanagement@gmail.com</p>
    </footer>
</body>
</html>