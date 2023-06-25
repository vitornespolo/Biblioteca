package com.projetopessoal.demo.endpoint;

import com.projetopessoal.demo.impl.service.LivroQueryServiceImpl;
import com.projetopessoal.demo.model.Livro;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livro")
public class LivroEndpoint {

    @Autowired
    @NonNull
    private LivroQueryServiceImpl livroQueryService;

    @GetMapping("/{id}")
    public ResponseEntity<Livro> buscarPeloId(@PathVariable Long id) {
        Livro livro = livroQueryService.buscarPeloId(id);
        return livro != null ? ResponseEntity.ok(livro) : ResponseEntity.notFound().build();
    }

    @GetMapping("/livros")
    public List<Livro> findAll() {

        return livroQueryService.buscarLivros();
    }

    @PostMapping("/cadastrarlivro")
    public ResponseEntity<Livro> cadastrar(@RequestBody Livro livro) {
        Livro livroSalvo = livroQueryService.cadastrarLivro(livro);

        return ResponseEntity.status(HttpStatus.CREATED).body(livroSalvo);
    }

    @PutMapping("/updatelivro/{id}")
    public ResponseEntity<Livro> update(@PathVariable Long id, @RequestBody Livro livro) {

        Livro livroAtualizado = livroQueryService.update(id, livro);

        return ResponseEntity.ok(livroAtualizado);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {

        livroQueryService.delete(id);
    }
}
