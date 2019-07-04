package org.generation.brazil.gfood.cliente;

import java.sql.Date;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Stream;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

     List<Cliente> findByNome(String nome);

     List<Cliente> findByDataNasc(LocalDate data);

     List<Cliente> findByNomeAndDataNasc(String nome, LocalDate data);

     @Transactional
     @Modifying
     @Query(value = "delete  from Cliente cliente where cliente.nome = ?1 and cliente.dataNasc = ?2")
     void deleteByNomeAndDataNasc(String nome, LocalDate datanasc);


}
