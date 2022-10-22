package com.rah.demo.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rah.demo.crud.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

}
