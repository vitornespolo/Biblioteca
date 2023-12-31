package com.projetopessoal.demo.endpoint;

import com.projetopessoal.demo.impl.service.PessoaQueryServiceImpl;
import com.projetopessoal.demo.model.Pessoa;
import jakarta.servlet.http.HttpServletResponse;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoa")
public class PessoaEndpoint {

    @Autowired
    @NonNull
    private PessoaQueryServiceImpl pessoaQueryService;

    @GetMapping("/pessoas")
    public List<Pessoa> buscarPessoas() {
        return pessoaQueryService.buscarPessoa();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pessoa> buscarPeloId(@PathVariable Long id) {
        Pessoa pessoa = pessoaQueryService.buscarPeloId(id);
        return pessoa != null ? ResponseEntity.ok(pessoa) : ResponseEntity.notFound().build();
    }


    @PostMapping("/cadastrarpessoa")
    public ResponseEntity<Pessoa> criar(@RequestBody Pessoa pessoa, HttpServletResponse response) {
        Pessoa pessoaSalvo = pessoaQueryService.criarPessoa(pessoa);
        return ResponseEntity.status(HttpStatus.CREATED).body(pessoaSalvo);
    }

    @PutMapping("/updatepessoa/{id}")
    public ResponseEntity<Pessoa> atualizar(@PathVariable Long id, @RequestBody Pessoa pessoa) {

        Pessoa pessoaSalvo = pessoaQueryService.atualizar(id, pessoa);
        return ResponseEntity.ok(pessoaSalvo);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void remover(@PathVariable Long id) {
        pessoaQueryService.delete(id);
    }
}
