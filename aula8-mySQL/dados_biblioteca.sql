INSERT INTO aluno VALUES (100, 'Zacarias da Mata');
INSERT INTO aluno VALUES (200, 'Yolanda Costa Matheus');
INSERT INTO aluno VALUES (300, 'Xisto Gonçalves');
INSERT INTO aluno VALUES (400, 'William Henry Gates');
INSERT INTO aluno VALUES (500, 'Vilma Oliveira Dias');
INSERT INTO aluno VALUES (600, 'Úrsula Pereira');
INSERT INTO aluno VALUES (700, 'Teodoro Silva dos Santos');
INSERT INTO aluno VALUES (800, 'Salomé Souza Lima');
INSERT INTO aluno VALUES (900, 'Ranulfo Jorge da Silva');

INSERT INTO categoria VALUES (10, 'Romance');
INSERT INTO categoria VALUES (20, 'Ficção');
INSERT INTO categoria VALUES (30, 'Comédia');
INSERT INTO categoria VALUES (40, 'Infanto Juvenil');
INSERT INTO categoria VALUES (50, 'Drama');
INSERT INTO categoria VALUES (60, 'Policial');

INSERT INTO livro VALUES (1000, 'Um romance qualquer', 10);
INSERT INTO livro VALUES (1010, 'Um outro romance qualquer', 10);
INSERT INTO livro VALUES (1020, 'Uma ficção baseada em fatos reais', 20);
INSERT INTO livro VALUES (1030, 'Eram os deuses astronautas?', 20);
INSERT INTO livro VALUES (1040, 'Cachinhos Dourados', 40); 
INSERT INTO livro VALUES (1050, 'Chapeuzinho Vermelho', 40); 
INSERT INTO livro VALUES (1060, 'Os três porquinhos', 40); 
INSERT INTO livro VALUES (1070, 'Se eu chorasse uma vez', 50); 
INSERT INTO livro VALUES (1080, 'Um novo amor', 10); 
INSERT INTO livro VALUES (1090, 'A dúvida', 50); 
INSERT INTO livro VALUES (1100, 'A morte do senhor vereador', 60); 
INSERT INTO livro VALUES (1110, 'O mistério dos 5 mentirosos', 60); 
INSERT INTO livro VALUES (1120, 'O robô', 20); 

INSERT INTO livro VALUES (1130, 'Poeiras em alto mar', 50); 
INSERT INTO livro VALUES (1140, 'A volta dos que não foram', 50); 
INSERT INTO livro VALUES (1150, 'O príncipe e o mendigo', 40);

INSERT INTO emprestimo (id_emprestimo, id_aluno, id_livro, data_emprestimo) VALUES (1, 100, 1000, '2010-08-13'); 
INSERT INTO emprestimo (id_emprestimo, id_aluno, id_livro, data_emprestimo) VALUES (2, 100, 1080, '2010-08-14'); 
INSERT INTO emprestimo (id_emprestimo, id_aluno, id_livro, data_emprestimo) VALUES (3, 200, 1110, '2010-08-15'); 
INSERT INTO emprestimo (id_emprestimo, id_aluno, id_livro, data_emprestimo) VALUES (4, 300, 1150, '2010-08-15'); 
INSERT INTO emprestimo (id_emprestimo, id_aluno, id_livro, data_emprestimo) VALUES (5, 500, 1120, '2010-08-16'); 
INSERT INTO emprestimo (id_emprestimo, id_aluno, id_livro, data_emprestimo) VALUES (6, 500, 1130, '2010-08-17'); 
INSERT INTO emprestimo (id_emprestimo, id_aluno, id_livro, data_emprestimo) VALUES (7, 600, 1010, '2010-08-18'); 
INSERT INTO emprestimo (id_emprestimo, id_aluno, id_livro, data_emprestimo) VALUES (8, 700, 1020, '2010-08-19'); 
INSERT INTO emprestimo (id_emprestimo, id_aluno, id_livro, data_emprestimo) VALUES (9, 800, 1040, '2010-08-20');

SELECT * FROM aluno;

