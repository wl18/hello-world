package com.wl.springboottest.repository;

import com.wl.springboottest.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ Author: wl
 * @ Date: 2021/4/18 23:00
 */
public interface UserRepository extends JpaRepository<User, Long> {

}
