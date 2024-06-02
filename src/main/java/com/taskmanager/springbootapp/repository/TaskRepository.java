package com.taskmanager.springbootapp.repository;

import com.taskmanager.springbootapp.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
    // Define custom methods if needed
}