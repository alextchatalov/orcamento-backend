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

    @GetMapping(value = "/rendas")
    public List<Renda> getRendas() {
        return service.getRendas();
    }

    @PostMapping(value = "/rendas")
    @ResponseStatus(HttpStatus.CREATED)
    public Renda saveRenda(@RequestBody RendaDTO rendaDTO) {
        System.out.println("Salvando Renda!" + rendaDTO.getRenda());
        Renda renda = Renda.builder().renda(rendaDTO.getRenda()).valor(new BigDecimal(rendaDTO.getValor())).build();
        return service.saveRenda(renda);
    }

    public class RendaDTO {
        private String renda;
        private String valor;

        public String getRenda() {
            return renda;
        }

        public void setRenda(String renda) {
            this.renda = renda;
        }

        public String getValor() {
            return valor;
        }

        public void setValor(String valor) {
            this.valor = valor;
        }
    }
}
