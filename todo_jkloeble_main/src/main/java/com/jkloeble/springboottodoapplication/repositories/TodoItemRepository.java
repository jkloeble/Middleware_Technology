package com.jkloeble.springboottodoapplication.repositories;

import com.jkloeble.springboottodoapplication.models.TodoItem;
import org.springframework.data.repository.CrudRepository;

public interface TodoItemRepository extends CrudRepository<TodoItem, Long> {  
}
