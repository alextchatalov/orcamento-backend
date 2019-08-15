package com.orcamento.service;

import com.orcamento.business.RendaBusiness;
import com.orcamento.domain.Renda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RendaService {

    @Autowired
    private RendaBusiness business;

    public List<Renda> getRendas() {
        return business.getRendas();
    }

    public Renda saveRenda(Renda renda) {
        return business.salvarAtualizarRenda(renda);
    }
}
