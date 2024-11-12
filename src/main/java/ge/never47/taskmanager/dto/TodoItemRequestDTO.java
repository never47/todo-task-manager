package ge.never47.taskmanager.dto;

import jakarta.validation.constraints.NotBlank;

public record TodoItemRequestDTO(
        @NotBlank(message = "Title is required") String title,
        String description
) {}