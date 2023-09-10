package com.gcu.data.repository;

import org.springframework.data.repository.CrudRepository;

import com.gcu.data.entity.AuthorityEntity;

public interface AuthoritiesRepository extends CrudRepository<AuthorityEntity,Long> {
}
