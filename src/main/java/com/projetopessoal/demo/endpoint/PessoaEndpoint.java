package com.projetopessoal.demo.endpoint;

import com.projetopessoal.demo.impl.service.PessoaQueryServiceImpl;
import com.projetopessoal.demo.model.Pessoa;
import lombok.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pessoa")
public class PessoaEndpoint {

    private @NonNull
    PessoaQueryServiceImpl pessoaQueryService;

    @GetMapping("/ok")
    public String ok() {
        return "ok";
    }

    @GetMapping("/pessoas")
    public List<Pessoa> buscarPessoas() {
        List<Pessoa> pessoaList = pessoaQueryService.buscarPessoa();
        return pessoaList;
    }

}
