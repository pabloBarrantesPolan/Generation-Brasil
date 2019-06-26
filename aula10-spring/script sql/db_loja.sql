create database  loja;
use loja;
create table produtos(
id integer not null auto_increment primary key,
nome varchar(255) not null,
descricao text
);