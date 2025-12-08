package com.kouger.backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.kouger.backend.model.User;
import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findByUsername(String username);
    Optional<User> findByEmail(String email);
}
