package com.orcamento.controller;

import com.orcamento.domain.Renda;
import com.orcamento.service.RendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class RendaController {

    @Autowired
    RendaService service;

    @GetMapping("/rendas")
    public List<Renda> getRendas() {
        return service.getRendas();
    }

    @PostMapping("/rendas")
    @ResponseStatus(HttpStatus.CREATED)
    public Renda saveRenda(Renda rendaResquest) {
        System.out.println("Salvando Renda!" + rendaResquest.getRenda());
        Renda renda = Renda.builder().renda(rendaResquest.getRenda()).valor(rendaResquest.getValor()).build();
        return service.saveRenda(renda);
    }

}
