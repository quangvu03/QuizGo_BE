package com.example.dtos;

import io.micronaut.serde.annotation.Serdeable;
import lombok.Data;

import java.time.LocalDateTime;
@Serdeable

@Data
public class QuizanswerDTO {
    private Long id;
    private Long quizId;
    private Long questionId;
    private Byte correct;
    private String content;
    private LocalDateTime createdAt;


}
