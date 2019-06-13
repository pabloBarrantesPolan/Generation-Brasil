insert into aluno (
	nome, 
    sobrenome, 
    email, 
    data_nascimento, 
    cpf
) values (
	"Rodrigo",
    "Barrantes",
    "pablobp.cc@gmail.com",
    "1991-01-06",
    "32423253253"
);

-- describe alunos;

select * from aluno;

update alunos 
set id = 6
where nome = "Julio";

select * from alunos where id = 1;
