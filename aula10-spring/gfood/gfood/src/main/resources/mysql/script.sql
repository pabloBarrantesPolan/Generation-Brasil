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


describe cliente;

show tables;
drop  table cliente;

select * from cliente;
ALTER TABLE cliente ADD data_nasc date not null ;

ALTER TABLE produto ADD preco decimal(10,2) not null ;

insert into cliente values("1", "Pablo", "rua um", "1991-01-06");