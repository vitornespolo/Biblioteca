package com.projetopessoal.biblioteca.impl.service;

import com.projetopessoal.biblioteca.model.Endereco;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Service
public class ViaCepService {

    public Endereco getEndereco(String cep) {

        RestTemplate restTemplate = new RestTemplate();
        try {

            ResponseEntity<Endereco> response = restTemplate.getForEntity(
                    String.format("https://viacep.com.br/ws/%s/json", cep),
                    Endereco.class);
            return response.getBody();

        } catch (HttpClientErrorException e) {

            throw new RuntimeException("CEP invalido!" + e.getMessage());
        }
    }
}
