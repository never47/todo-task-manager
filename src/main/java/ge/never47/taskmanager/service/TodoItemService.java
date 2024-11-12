package ge.never47.taskmanager.service;

import ge.never47.taskmanager.dto.TodoItemRequestDTO;
import ge.never47.taskmanager.dto.TodoItemResponseDTO;

import java.util.List;

public interface TodoItemService {
    TodoItemResponseDTO createTodoItem(TodoItemRequestDTO todoItemRequestDTO);
    List<TodoItemResponseDTO> getAllTodoItems();
    TodoItemResponseDTO getTodoItemById(Long id);
    TodoItemResponseDTO updateTodoItem(Long id, TodoItemRequestDTO todoItemRequestDTO);
    void deleteTodoItem(Long id);
}
