package org.generation.brazil.gfood.produto;

import java.math.BigDecimal;
import org.generation.brazil.gfood.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@RestController
@RequestMapping("/api/vl")
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

    //pesquisa por valor >10

    @PostMapping("/produtos/valor")
    public List<Produto> findByPreco(@RequestParam BigDecimal valor){

        return repository.findByPrecoAfter(valor);
    }


    //pesquisa por valor >10 && <20
    @PostMapping("/produtos/valores")
    public List<Produto> findByPrecoBetween(@RequestParam BigDecimal valorMin, @RequestParam BigDecimal valorMax){

        return repository.findByPrecoBetween(valorMin, valorMax);
    }

    //pesquisa por like nome...
    @PostMapping("/produtos/valores/nome")
    public List<Produto>  findByNomeContaining(@RequestParam  String nome) {
        return repository.findByNomeContaining(nome);
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
    // update so o preco
    @PutMapping("/produtos/preco/{id}")
    public Produto updatePreco(@PathVariable Long id, @RequestParam BigDecimal valor) throws ResourceNotFoundException {
        return repository.findById(id).map(p -> {
            p.setPreco(valor);
            return repository.save(p);
        }).orElseThrow(() ->
            new ResourceNotFoundException("Não existe produto com o ID: " + id));
    }

    @DeleteMapping("/produtos/{id}")
    public void delete(@PathVariable Long id){
        repository.deleteById(id);
    }

    @DeleteMapping("/produtos/apaga")
    public void  deleteByPrecoLessThan(@RequestParam BigDecimal valor)  {
        repository.deleteByPrecoLessThan(valor);
    }
}
