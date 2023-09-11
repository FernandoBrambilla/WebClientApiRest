package com.fernando.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fernando.Entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
