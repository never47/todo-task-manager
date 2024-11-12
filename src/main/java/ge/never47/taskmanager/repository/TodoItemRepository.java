package ge.never47.taskmanager.repository;

import ge.never47.taskmanager.entity.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoItemRepository extends JpaRepository<TodoItem, Long> {
}
