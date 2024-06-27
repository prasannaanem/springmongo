package com.springmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springmongo.entity.Users;
@Repository
public interface UsersRepo extends MongoRepository<Users, Long>{

}
