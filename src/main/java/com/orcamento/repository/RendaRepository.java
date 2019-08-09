package com.orcamento.repository;

import com.orcamento.domain.Renda;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RendaRepository extends MongoRepository<Renda, String> {
}
