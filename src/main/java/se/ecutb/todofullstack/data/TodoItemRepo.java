package se.ecutb.todofullstack.data;

import org.springframework.data.jpa.repository.JpaRepository;
import se.ecutb.todofullstack.entity.TodoItem;

public interface TodoItemRepo extends JpaRepository<TodoItem, Integer> {
}
