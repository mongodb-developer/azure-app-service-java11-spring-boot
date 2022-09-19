package com.mongo.atlas.example.repository;

import com.mongo.atlas.example.model.Person;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import static com.mongodb.client.model.Filters.in;

public class PersonRepositoryImpl implements PersonRepository {


    private final MongoClient mongoClient;
    private MongoCollection<Person> personCollection;

    @Value("${spring.data.mongodb.database}")
    private String database;

    @Value("${spring.data.mongodb.collection}")
    private String collection;

    public PersonRepositoryImpl(MongoClient mongoClient) {
        this.mongoClient = mongoClient;
    }

    @PostConstruct
    void init() {
        personCollection = mongoClient.getDatabase(database).getCollection(collection, Person.class);
    }

    @Override
    public Person save(Person person) {
        person.setId(new ObjectId());
        personCollection.insertOne(person);
        return person;
    }

    @Override
    public <S extends Person> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Person> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public List<Person> findAll() {
        return personCollection.find().into(new ArrayList<>());
    }

    @Override
    public Iterable<Person> findAllById(Iterable<String> strings) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public void delete(Person entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends Person> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Person> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Person> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Person> S insert(S entity) {
        return null;
    }

    @Override
    public <S extends Person> List<S> insert(Iterable<S> entities) {
        return null;
    }

    @Override
    public <S extends Person> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Person> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Person> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Person> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Person> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Person> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Person, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
