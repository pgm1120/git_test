package org.zerock.springboard.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TodoDTO {
    private Integer tno;
    private String title, memo, writer;

    private LocalDate dueDate;

    private Boolean complete;

    private LocalDateTime regDate;
    private LocalDateTime modDate;
}
