package com.example.dtos;

import io.micronaut.serde.annotation.Serdeable;
import lombok.Data;

import java.time.LocalDateTime;
@Serdeable

@Data
public class TakeDTO {
    private Long id;
    private Long userId;
    private Long quizId;
    private Byte status;
    private Integer score;
    private LocalDateTime startedAt;
    private LocalDateTime finishedAt;


}
