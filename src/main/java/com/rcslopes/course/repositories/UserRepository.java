package com.rcslopes.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rcslopes.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
