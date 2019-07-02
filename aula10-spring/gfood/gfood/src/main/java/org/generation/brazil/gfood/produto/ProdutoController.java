package org.generation.brazil.gfood.produto;

import org.generation.brazil.gfood.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/produtos")
    public Produto Save(@RequestBody Produto produto){
        // insert into produto.....
        return repository.save(produto);
    }
    @GetMapping("/produtos")
    public List<Produto> findAll(){
        return  repository.findAll();
    }

    @GetMapping("/produtos/{id}")
    public Optional<Produto> findById(@PathVariable Long id) {

        return  repository.findById(id);
    }
    @GetMapping("/produtos/pesquisa/{nome}")
    public List<Produto> findByNome(@PathVariable String nome) {

        return  repository.findAllByNome(nome);
    }


    @PutMapping("/produtos/{id}")
    public Produto update(@PathVariable Long id, @RequestBody Produto produto) throws ResourceNotFoundException {
// "UPDATE produto SET ... WHERE ..."
            return repository.findById(id).map(p -> {
                p.setNome(produto.getNome());
                p.setDescricao(produto.getDescricao());
                p.setPreco(produto.getPreco());
                return repository.save(p);
            }).orElseThrow(() ->
                    new ResourceNotFoundException("Não existe produto com o ID: " + id));
        }

    @DeleteMapping("/produtos/{id}")
    public void delete(@PathVariable Long id){
        repository.deleteById(id);
    }
}
