CREATE  DATABASE gfood;
use gfood;
create table cliente(
    id integer primary key not null auto_increment,
    nome varchar(100) not null,
    endereco varchar (255)
);
insert into cliente  (nome, endereco) values("Pablo", "Av. Imarés");