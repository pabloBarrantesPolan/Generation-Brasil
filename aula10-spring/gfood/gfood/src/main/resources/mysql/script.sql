CREATE  DATABASE gfood;
use gfood;

create table cliente(
                        id integer primary key not null auto_increment,
                        nome varchar(100) not null,
                        endereco varchar (255)
);
create table produto(
                        id integer primary key not null auto_increment,
                        nome varchar(100) not null,
                        descricao varchar (255)
);
create table restaurante(
                        id integer primary key not null auto_increment,
                        nome varchar(100) not null,
                        endereco varchar (255)
);


describe restaurante;