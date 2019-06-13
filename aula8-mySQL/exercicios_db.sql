create database sistema;
use sistema;
create table departamento(
	id_departamento int primary key auto_increment unique not null,
    nome varchar(100),
    telefone char(15)
   
) engine = innodb ;


describe departamento;


create table funcionario (
	id_funcionario int primary key auto_increment unique not null,
    nome varchar(100),
    id_departamento integer,
    foreign key (id_departamento) references departamento(id_departamento)
	
)engine = innodb;

describe funcionario;

alter table funcionario add fk_teste int;

alter table funcionario
add foreign key (fk_teste) references departamento(id_departamento);

insert into departamento values (
("3","gerencia","123456"),
("4","devs","124455"),
("5","adm","776555"));
select * from departamento;