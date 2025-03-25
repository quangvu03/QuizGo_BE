package com.example.dtos;

import io.micronaut.serde.annotation.Serdeable;
import lombok.Data;

import java.time.LocalDateTime;
@Serdeable

@Data
public class QuizquestionDTO {
    private Long id;
    private Long quizId;
    private String title;
    private String type;
    private Integer level;
    private LocalDateTime createdAt;
    private String content;


}
