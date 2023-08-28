package com.fernando.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fernando.Entities.Client;


public interface ClientRepository extends JpaRepository<Client, Integer> {

}
