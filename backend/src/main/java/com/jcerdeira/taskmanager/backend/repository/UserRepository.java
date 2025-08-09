package com.jcerdeira.taskmanager.backend.repository;

import com.jcerdeira.taskmanager.backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
