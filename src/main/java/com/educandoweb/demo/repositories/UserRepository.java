package com.educandoweb.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.demo.entitities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
