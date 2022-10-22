package com.example.demo.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.crud.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

}
