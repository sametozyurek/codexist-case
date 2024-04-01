package com.codexist.codexist.persistance.repository;

import com.codexist.codexist.persistance.data.dbmodel.LocationEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends MongoRepository<LocationEntity, String> {
}
