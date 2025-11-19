package com.felipe.vehiculos_api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.felipe.vehiculos_api.model.Carro;
import org.springframework.stereotype.Repository;

@Repository

public interface carroRepository extends MongoRepository<Carro, String> {

}
