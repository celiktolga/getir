package com.demo.getir.repository;

import com.demo.getir.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends MongoRepository<User, Integer> {

}
