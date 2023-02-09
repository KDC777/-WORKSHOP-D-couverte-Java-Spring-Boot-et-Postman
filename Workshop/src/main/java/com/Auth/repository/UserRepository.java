package com.Auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Auth.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
