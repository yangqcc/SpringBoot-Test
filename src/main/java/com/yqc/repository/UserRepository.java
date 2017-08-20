package com.yqc.repository;

import com.yqc.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by yangqc on 2017/8/20
 */
public interface UserRepository extends MongoRepository<User, String> {
}
