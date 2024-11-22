<%@ page language="java" contentType="text/html; charset=ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/form.css">
    <title>Novo funcionário</title>
    <style>
        @import url('https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,100..900;1,100..900&family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap');
    </style>
</head>
<body>
    <header>
        <a href="home"><img src="images/1.png"></a>
    </header>

    <div class="container">
        <form method="POST" action="${funcionario.id != null ? 'atualizarFuncionario' : 'adicionarFuncionario' }?idFuncionario=${funcionario.id}">
            <label>Upload da foto do funcionário:</label>
            <input type="file" name="foto" id="foto">
            <label>Nome:</label>
            <input type="text" name="nome" value="${funcionario.nome}">
            <label>Idade:</label>
            <input type="number" name="idade" value="${funcionario.idade}">
            <label>Cargo:</label>
            <input type="text" name="cargo" value="${funcionario.cargo}">
            <button type="submit">Salvar</button>
        </form>
    </div>
    
    <footer>
        <p>2023 - Todos os direitos reservados</p>
        <p>Entre em contato pelo e-mail: dynamicmanagement@gmail.com</p>
    </footer>
    
</body>
</html>