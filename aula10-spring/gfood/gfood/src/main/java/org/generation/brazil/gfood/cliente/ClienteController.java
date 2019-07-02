package org.generation.brazil.gfood.cliente;


import org.generation.brazil.gfood.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.sql.Date;
import java.util.List;
import java.util.Optional;

@RestController
public class ClienteController {

    @Autowired
   private ClienteRepository repository;

   @ResponseStatus(HttpStatus.CREATED)
   @PostMapping("/clientes")
   public Cliente Save(@RequestBody Cliente cliente){
       // insert into cliente.....
       return repository.save(cliente);
   }
    @GetMapping("/clientes")
    public List<Cliente> findAll(){
        return  repository.findAll();
    }

    @GetMapping("/clientes/{id}")
    public Optional<Cliente> findById(@PathVariable Long id) {

        return  repository.findById(id);
    }


    // pesquisa cliente pelo nome, atraves de post passando de paramenteo o nome
    @PostMapping("/clientes/nome")
    public List<Cliente> findByNome(@RequestParam String nome) {

        return  repository.findByNome(nome);
    }

    @PostMapping("/clientes/data")
    public List<Cliente> findByDate(@RequestParam Date data) {

       return repository.findByDataNasc(data);
    }

    @PutMapping("/clientes/{id}")
    public Cliente Update(@PathVariable Long id, @RequestBody Cliente cliente) throws ResourceNotFoundException {
        // "UPDATE cliente SET ... WHERE ..."
        return repository.findById(id).map(c -> {
            c.setNome(cliente.getNome());
            c.setEndereco(cliente.getEndereco());
            c.setDataNasc(cliente.getDataNasc());
            return repository.save(c);
        }).orElseThrow(() ->
                new ResourceNotFoundException("Não existe cliente com o ID: " + id));

    }



   @DeleteMapping("/clientes/{id}")
    public void delete(@PathVariable Long id){
       repository.deleteById(id);
   }




}
