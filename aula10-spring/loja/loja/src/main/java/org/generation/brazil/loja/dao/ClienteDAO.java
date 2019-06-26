package org.generation.brazil.loja.dao;

import org.generation.brazil.loja.model.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClienteDAO extends CrudRepository<Cliente, Long> {}
