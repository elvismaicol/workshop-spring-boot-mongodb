package com.elvismaicol.appemcmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.elvismaicol.appemcmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{
}
