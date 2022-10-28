package org.zerock.springboard.dto;

import lombok.Data;

import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
public class TodoAddDTO {
    @NotEmpty
    private String title;

    @Size(min = 10, max = 100)
    private String memo;

    @NotEmpty
    private String writer;

    @FutureOrPresent
    private LocalDate dueDate;
}
