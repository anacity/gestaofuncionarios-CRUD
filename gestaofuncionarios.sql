CREATE DATABASE gestaofuncionarios;

USE gestaofuncionarios;

CREATE TABLE funcionarios (
	id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    nome VARCHAR(100),
    cargo VARCHAR(100),
    idade INT
);

SELECT * FROM funcionarios;