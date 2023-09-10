package com.gcu.data.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.gcu.data.entity.UserEntity;

public interface UsersRepository extends CrudRepository<UserEntity,Long> {
    Optional<UserEntity> findByUsername(String username);
    Boolean existsByUsername(String username);
}
