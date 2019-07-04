package org.generation.brazil.gfood.produto;

import java.math.BigDecimal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    List<Produto> findAllByNome(String nome);

    List<Produto> findByPrecoAfter(BigDecimal valor);

    List<Produto> findByPrecoBetween(BigDecimal valorMin, BigDecimal valorMax);


    List<Produto> findByNomeContaining(String nome);

    @Transactional
    @Modifying
    @Query(value = "delete from Produto p where p.preco < ?1")
    void deleteByPrecoLessThan(BigDecimal valor);
}