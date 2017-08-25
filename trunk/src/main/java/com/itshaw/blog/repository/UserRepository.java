package com.itshaw.blog.repository;

import com.itshaw.blog.domain.UserInfo;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserInfo,Long> {

    UserInfo findByEmail(String email);
}