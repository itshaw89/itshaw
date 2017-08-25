package com.biostime.demo.repository;

import com.biostime.demo.CommonTest;
import com.itshaw.blog.domain.UserInfo;
import com.itshaw.blog.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public class UserRepositoryTest extends CommonTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testAdd() {
        UserInfo user = new UserInfo();
        user.setEmail("xiaoxiong@test.com");
        userRepository.save(user);
        log.info("save :  " + user.getId());
    }
}
