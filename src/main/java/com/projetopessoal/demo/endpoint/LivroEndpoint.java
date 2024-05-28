package com.projetopessoal.demo.endpoint;

import com.projetopessoal.demo.impl.service.LivroCommandServiceImpl;
import com.projetopessoal.demo.impl.service.LivroQueryServiceImpl;
import com.projetopessoal.demo.model.Livro;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/livros")
public class LivroEndpoint {

    @NonNull
    private LivroQueryServiceImpl livroQueryService;

    @NonNull
    private LivroCommandServiceImpl livroCommandService;

    @GetMapping()
    public List<Livro> findAll() {

        return livroQueryService.buscarLivros();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Livro> buscarPeloId(@PathVariable Long id) {
        Livro livro = livroQueryService.buscarPeloId(id);
        return livro != null ? ResponseEntity.ok(livro) : ResponseEntity.notFound().build();
    }

    @PostMapping("/cadastrarlivro")
    public ResponseEntity<Livro> cadastrar(@RequestBody Livro livro) {
        Livro livroSalvo = livroCommandService.cadastrarLivro(livro);

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
