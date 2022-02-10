package repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import model.Client;

public interface IclientRepository  extends ReactiveMongoRepository< Client, String>{

}
