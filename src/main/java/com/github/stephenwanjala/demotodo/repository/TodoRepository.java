package com.github.stephenwanjala.demotodo.repository;

import com.github.stephenwanjala.demotodo.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
}
