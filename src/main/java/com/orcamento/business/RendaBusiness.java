package com.orcamento.business;

import com.orcamento.domain.Renda;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Component
public class RendaBusiness {

    public List<Renda> getRendas() {
        List<Renda> rendas = new ArrayList<>();
        for (int i = 0; i<=5; i++) {
            rendas.add(Renda.builder().id(String.valueOf(i)).renda("Alex" + i).valor(new BigDecimal(100 + i)).build());
        }

        return rendas;
    }
}
