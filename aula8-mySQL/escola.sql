/* criando um banco de dados */
create database generation;

/* indicando qual banco de dados iremos trabalhar */
use generation;

/* criando uma tabela */
create table alunos (
	id int(11) primary key auto_increment not null,
	nome varchar(50),
    sobrenome varchar(50),
    email varchar(50),
    data_nascimento date,
    cpf varchar(11) unique
);

create table professores (
	id int(11) primary key auto_increment not null,
    nome varchar(50),
    email varchar(50),
    data_nascimento date,
    cpf varchar(11) unique
);

create table cursos (
	id int(11) primary key auto_increment not null,
    nome varchar(50)
);

create table turmas (
	id int(11) primary key auto_increment not null,
    descricao varchar(50),
    periodo varchar(20),
    id_alunos int(11),
    id_professores int(11),
    id_cursos int(11)
);

/* exibindo todas tabelas do meu banco de dados */
show tables;

/* descrever os detalhes de uma tabela */
describe alunos;

