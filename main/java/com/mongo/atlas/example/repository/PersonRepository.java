package com.mongo.atlas.example.repository;

import com.mongo.atlas.example.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepository extends MongoRepository<Person,String> {


}
