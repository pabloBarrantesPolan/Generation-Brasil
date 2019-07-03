package org.generation.brazil.gfood.cliente;

import java.time.LocalDate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

     List<Cliente> findByNome(String nome);

     List<Cliente> findByDataNasc(LocalDate data);

     List<Cliente> findByNomeAndDataNasc(String nome, LocalDate data);



}
