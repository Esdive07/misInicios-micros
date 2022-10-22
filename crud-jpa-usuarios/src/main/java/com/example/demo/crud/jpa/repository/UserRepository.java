package com.example.demo.crud.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.crud.jpa.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

}
