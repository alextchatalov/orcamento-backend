package com.orcamento.request;

import com.orcamento.domain.Renda;
import com.orcamento.service.RendaService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RestController
public class RendaController {

    @Autowired
    RendaService service;

    @GetMapping(value = "/rendas")
    public List<Renda> getRendas() {
        System.out.println(service.getRendas().size());
        List<Renda> rendas = new ArrayList<>();
        rendas.add( Renda.builder().id("1").renda("teste").valor(BigDecimal.ONE).build());
        rendas.add( Renda.builder().id("2").renda("teste2").valor(BigDecimal.ONE).build());
        return rendas;
    }
}
