package com.yqc;

import com.yqc.domain.User;
import com.yqc.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by yangqc on 2017/8/20
 */
@Service
@AllArgsConstructor
@Slf4j
public class UserService {

    private final UserRepository userRepository;

    MongoTemplate mongoTemplate;

    /**
     * 保存人员信息
     *
     * @param user
     * @return
     */
    public User save(User user) {
        return userRepository.save(user);
    }
}
