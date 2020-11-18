package com.starsapp.rest.webservices.restfullwebservices;

import com.starsapp.rest.webservices.restfullwebservices.todo.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoJpaRepository extends JpaRepository<Todo, Long> {
    List<Todo> findByUsername(String username);
}
