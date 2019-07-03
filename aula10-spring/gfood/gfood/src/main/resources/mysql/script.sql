CREATE  DATABASE gfood;
-- drop database gfood;
use gfood;
show  tables
;
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
drop database gfood;
select * from cliente;
ALTER TABLE cliente ADD data_nasc date not null ;

ALTER TABLE produto ADD preco decimal(10,2) not null ;

insert into cliente values("2","Geni", "rua um", "1994-01-06");
insert into produto values("1", "bike", "bike velha","123");
insert into restaurante values("1","Geni´s Burger", "rua um");