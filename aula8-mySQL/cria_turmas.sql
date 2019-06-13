insert into turmas(
	descricao, periodo, id_alunos, id_professores, id_cursos
) value(
	"Primeira turma da Generation Brasil",
    "Integral",
    "1",
    "2",
    "999"
);

select * from turmas;
describe turmas;

alter table turmas
add foreign key (id_alunos) references alunos(id);

alter table cursos rename to curso;
select * from aluno where nome like '%a%';