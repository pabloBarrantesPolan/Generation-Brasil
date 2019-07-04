package org.generation.brazil.gfood.cliente;


import java.sql.Date;
import java.time.LocalDate;
import org.generation.brazil.gfood.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@RestController
@RequestMapping("/api/vl")
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
    public List<Cliente> findByDataNasc(@RequestParam @DateTimeFormat(iso = ISO.DATE) LocalDate data) {

       return repository.findByDataNasc(data);
    }

  @PostMapping("/clientes/nome/data")
  public List<Cliente> findByNameAndDate(@RequestParam @DateTimeFormat(iso = ISO.DATE) LocalDate data, @RequestParam String nome) {

    return repository.findByNomeAndDataNasc(nome, data);
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

  @PatchMapping("/clientes/altera{id}")
  public Cliente UpdateName(@PathVariable Long id, @RequestParam String nome) throws ResourceNotFoundException {
    // "UPDATE cliente SET ... WHERE ..."
    return repository.findById(id).map(c -> {
      c.setNome(nome);
      return repository.save(c);
    }).orElseThrow(() ->
        new ResourceNotFoundException("Não existe cliente com o ID: " + id));
  }

    @DeleteMapping("/clientes/{id}")
    public void deleteById(@PathVariable Long id){
      repository.deleteById(id);
    }

    @DeleteMapping("/clientes/apaga")
    public void deleteByNomeAndDataNasc(@RequestParam String nome,
    @RequestParam  @DateTimeFormat(iso = ISO.DATE) LocalDate datanasc){

       repository.deleteByNomeAndDataNasc(nome, datanasc);
    }


  }
