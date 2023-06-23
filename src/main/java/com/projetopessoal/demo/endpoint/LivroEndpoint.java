package com.projetopessoal.demo.endpoint;

import com.projetopessoal.demo.impl.service.LivroQueryServiceImpl;
import com.projetopessoal.demo.model.Livro;
import lombok.NonNull;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/livro")
public class LivroEndpoint {

    private @NonNull
    LivroQueryServiceImpl livroQueryService;

    @GetMapping("/ok")
    public String ok() {
        return "ok";
    }

//    @GetMapping
//    public List<Livro> findAll() {
//        List<Livro> livroList = livroQueryService.buscarLivros();
//
//        return livroList;
//    }
//
//    @PostMapping("/cadastro")
//    public ResponseEntity<Livro> cadastrar(@RequestBody Livro livro) {
//        Livro livroSalvo = livroQueryService.cadastrarLivro(livro);
//
//        return ResponseEntity.status(HttpStatus.CREATED).body(livroSalvo);
//    }

    @PutMapping("/update")
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
