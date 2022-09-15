package com.MongoDBAzureAppServiceDemo.AtlasAzureAppServiceDemo.repository;

import com.MongoDBAzureAppServiceDemo.AtlasAzureAppServiceDemo.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepository extends MongoRepository<Person,String> {


}
