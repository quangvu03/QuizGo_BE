package com.example.dtos;

import io.micronaut.serde.annotation.Serdeable;
import lombok.Data;

import java.time.LocalDateTime;
@Serdeable

@Data
public class QuizDTO {
    private Long id;
    private Long userId;
    private String title;
    private String type;
    private Integer score;
    private LocalDateTime createdAt;
    private String content;
    private Integer level;


}
