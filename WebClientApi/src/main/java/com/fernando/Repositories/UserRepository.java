package com.fernando.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fernando.Entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
