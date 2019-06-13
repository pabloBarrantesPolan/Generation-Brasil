create database generation;
use generation;

create table alunos(
	id_aluno int(11) primary key not null unique auto_increment,
    nome varchar(30) 
);
