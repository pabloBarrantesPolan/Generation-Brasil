package org.generation.brazil.loja.dao;

import org.generation.brazil.loja.model.Produto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProdutoDAO extends CrudRepository<Produto, Long> {}
