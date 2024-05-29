package com.projetopessoal.biblioteca.endpoint;

import com.projetopessoal.biblioteca.impl.service.ViaCepService;
import com.projetopessoal.biblioteca.model.Endereco;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@RequestMapping("/endereco")
public class EnderecoEndpoint {

    @NonNull
    private final ViaCepService viaCepService;

    @GetMapping("{cep}")
    public Endereco consulta(@PathVariable String cep) {

        return viaCepService.getEndereco(cep);
    }
}
