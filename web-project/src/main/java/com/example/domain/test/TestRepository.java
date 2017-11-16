package com.example.domain.test;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author christoph.huber
 * @since 20.10.2017
 */
public interface TestRepository extends MongoRepository<Test, String> {
}
