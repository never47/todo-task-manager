package ge.never47.taskmanager.controller;

import ge.never47.taskmanager.dto.TodoItemRequestDTO;
import ge.never47.taskmanager.dto.TodoItemResponseDTO;
import ge.never47.taskmanager.service.TodoItemService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
public class TodoItemController {

    private final TodoItemService todoItemService;

    public TodoItemController(TodoItemService todoItemService) {
        this.todoItemService = todoItemService;
    }

    @PostMapping
    public ResponseEntity<TodoItemResponseDTO> createTodoItem(@Valid @RequestBody TodoItemRequestDTO todoItemRequestDTO) {
        return ResponseEntity.ok(todoItemService.createTodoItem(todoItemRequestDTO));
    }

    @GetMapping
    public ResponseEntity<List<TodoItemResponseDTO>> getAllTodoItems() {
        return ResponseEntity.ok(todoItemService.getAllTodoItems());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TodoItemResponseDTO> getTodoItemById(@PathVariable Long id) {
        return ResponseEntity.ok(todoItemService.getTodoItemById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<TodoItemResponseDTO> updateTodoItem(
            @PathVariable Long id, @Valid @RequestBody TodoItemRequestDTO todoItemRequestDTO) {
        return ResponseEntity.ok(todoItemService.updateTodoItem(id, todoItemRequestDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTodoItem(@PathVariable Long id) {
        todoItemService.deleteTodoItem(id);
        return ResponseEntity.noContent().build();
    }
}
