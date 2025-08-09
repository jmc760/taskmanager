package com.jcerdeira.taskmanager.backend.repository;

import com.jcerdeira.taskmanager.backend.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
