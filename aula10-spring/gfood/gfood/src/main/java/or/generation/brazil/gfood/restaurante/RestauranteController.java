package or.generation.brazil.gfood.restaurante;

import or.generation.brazil.gfood.cliente.Cliente;
import or.generation.brazil.gfood.cliente.ClienteRepository;
import or.generation.brazil.gfood.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class RestauranteController {

    @Autowired
    private RestauranteRepository repository;



    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/restaurantes")
    public Restaurante Save(@RequestBody Restaurante rest){
        // insert into restaurante.....
        return repository.save(rest);
    }
    @GetMapping("/restaurantes")
    public List<Restaurante> findAll(){
        return  repository.findAll();
    }


    @PutMapping("/restaurantes/{id}")
    public Restaurante Update(@PathVariable Long id, @RequestBody Restaurante rest) throws ResourceNotFoundException {
        // "UPDATE restaurante SET ... WHERE ..."
        return repository.findById(id).map(r -> {
            r.setNome(rest.getNome());
            r.setEndereco(rest.getEndereco());
            return repository.save(r);
        }).orElseThrow(() ->
                new ResourceNotFoundException("Não existe restaurante com o ID: " + id));

    }



    @DeleteMapping("/restaurantes/{id}")
    public void delete(@PathVariable Long id){
        repository.deleteById(id);
    }


}
