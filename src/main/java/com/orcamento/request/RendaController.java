package com.orcamento.request;

import com.orcamento.domain.Renda;
import com.orcamento.service.RendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RendaController {

    @Autowired
    RendaService service;

    @GetMapping(value = "/rendas")
    public @ResponseBody List<Renda> getRendas() {
        System.out.println(service.getRendas().size());
        return service.getRendas();
    }
}
