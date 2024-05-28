package com.projetopessoal.biblioteca.endpoint;

import com.projetopessoal.biblioteca.impl.service.LivroCommandServiceImpl;
import com.projetopessoal.biblioteca.impl.service.LivroQueryServiceImpl;
import com.projetopessoal.biblioteca.model.Livro;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
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
    public ResponseEntity<Livro> cadastrar(@RequestBody Livro livro) throws Exception {

        Livro livroSalvo = livroCommandService.cadastrarLivro(livro);

        return new ResponseEntity(livroSalvo, HttpStatus.CREATED);
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
