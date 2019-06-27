package or.generation.brazil.gfood.cliente;


import or.generation.brazil.gfood.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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


    @PutMapping("/clientes/{id}")
    public Cliente Update(@PathVariable Long id, @RequestBody Cliente cliente) throws ResourceNotFoundException {
        // "UPDATE cliente SET ... WHERE ..."
        return repository.findById(id).map(c -> {
            c.setNome(cliente.getNome());
            c.setEndereco(cliente.getEndereco());
            return repository.save(c);
        }).orElseThrow(() ->
                new ResourceNotFoundException("Não existe cliente com o ID: " + id));

    }



   @DeleteMapping("/clientes/{id}")
    public void delete(@PathVariable Long id){
       repository.deleteById(id);
   }




}
