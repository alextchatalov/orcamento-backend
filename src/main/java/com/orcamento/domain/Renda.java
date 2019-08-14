package com.orcamento.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.math.BigDecimal;

@AllArgsConstructor
@Builder
@Getter
@Document(collection = "renda")
public class Renda {
    @Id
    private @NonNull String id;
    private @NonNull String renda;
    private @NonNull BigDecimal valor;

}
