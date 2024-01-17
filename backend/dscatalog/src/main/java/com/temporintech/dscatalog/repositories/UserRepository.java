package com.temporintech.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.temporintech.dscatalog.entities.Category;
import com.temporintech.dscatalog.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}