create database biblioteca;
use biblioteca;
create table categoria(
	id_categoria integer primary key unique,
    categoria varchar(100)
);

create table livro(
	id_livro integer primary key unique,
    titulo varchar(200),
    id_categoria int,
	CONSTRAINT fk_livro_categoria FOREIGN KEY (id_categoria) references categoria(id_categoria)
);

create table aluno(
id_aluno integer primary key unique,
nome  varchar(100)
);

create table emprestimo(
id_emprestimo integer primary key ,
id_aluno int,
id_livro int,
data_emprestimo date,
data_devolucao date,
CONSTRAINT fk_emprestimo_aluno FOREIGN KEY(id_aluno) references aluno(id_aluno),
CONSTRAINT fk_emprestimo_livro foreign key (id_livro) references livro(id_livro),
UNIQUE KEY(id_livro, id_aluno, data_emprestimo)
);

describe emprestimo;

