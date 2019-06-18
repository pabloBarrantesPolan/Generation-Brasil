SELECT 
titulo, categoria
 FROM livro l INNER JOIN categoria c
on l.id_categoria = c.id_categoria;

SELECT * FROM livro;
SELECT a.id_aluno, a.nome, l.id_livro, l.titulo, c.categoria, e.data_emprestimo, e.data_devolucao
FROM aluno a 
INNER JOIN emprestimo e on a.id_aluno = e.id_aluno 
INNER JOIN livro l on e.id_livro = l.id_livro
INNER join categoria c on l.id_categoria = c.id_categoria;