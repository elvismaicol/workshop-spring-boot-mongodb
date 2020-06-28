package com.elvismaicol.appemcmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.elvismaicol.appemcmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
}
