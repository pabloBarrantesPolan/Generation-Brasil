package org.generation.brazil.gfood.produto;

import java.math.BigDecimal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    List<Produto> findAllByNome(String nome);

    List<Produto> findByPrecoAfter(BigDecimal valor);

    List<Produto> findByPrecoBetween(BigDecimal valorMin, BigDecimal valorMax);


    List<Produto> findByNomeContaining(String nome);
}