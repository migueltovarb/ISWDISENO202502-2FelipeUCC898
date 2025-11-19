package com.felipe.vehiculos_api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.felipe.vehiculos_api.model.Moto;
import org.springframework.stereotype.Repository;

@Repository

public interface MotoRepository extends MongoRepository<Moto, String> {

}