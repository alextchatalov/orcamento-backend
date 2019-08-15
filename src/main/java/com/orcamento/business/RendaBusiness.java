package com.orcamento.business;

import com.orcamento.domain.Renda;
import com.orcamento.repository.RendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Component
public class RendaBusiness {

    @Autowired
    private RendaRepository repository;

    public List<Renda> getRendas() {

        popularDocumentoRenda();
        return repository.findAll();
    }

    private void popularDocumentoRenda() {
        if (repository.findAll().isEmpty()) {
            for (int i = 0; i<=5; i++) {
                salvarAtualizarRenda(Renda.builder().id(String.valueOf(i)).renda("Alex" + i).valor(new BigDecimal(100 + i)).build());
            }
        }
    }

    public Renda salvarAtualizarRenda(Renda renda) {
        return repository.save(renda);
    }
}
