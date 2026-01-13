package com.bien.blog.domain.dtos;

import com.bien.blog.domain.PostStatus;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdatePostRequestDto {

    @NotNull(message = "Post id cannot be null")
    private UUID id;

    @NotBlank(message = "Title cannot be blank")
    @Size(min = 3, max = 200, message = "Title must be between 3 and 200 characters")
    private String title;

    @NotBlank(message = "Content is required")
    @Size(min = 10, max = 50000, message = "Content must be between 10 and 50000 characters")
    private String content;

    @NotNull(message = "Category id cannot be null")
    private UUID categoryId;

    @Builder.Default
    @Size(max = 10, message = "A post can have up to 10 tags")
    private Set<UUID> tagIds = new HashSet<>();

    @NotNull(message = "Post status cannot be null")
    private PostStatus status;
}
