package com.jcerdeira.taskmanager.backend.repository;

import com.jcerdeira.taskmanager.backend.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
