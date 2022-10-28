package org.zerock.springboard.mapper;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.zerock.springboard.dto.TodoDTO;
import org.zerock.springboard.service.TodoService;

import java.time.LocalDate;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {org.zerock.springboard.config.RootConfig.class})//배열임  // 패키지명 넣고 마지막에 .class붙이기
@Log4j2
public class TodoServiceTests {
    @Autowired
    TodoService todoService;


    @Test
    public void showAllListServiceTest(){
        log.info(todoService.showAllList());
    }

    @Test
    public void selectOneServiceTest(){
        TodoDTO todoDTO = TodoDTO.builder()
                .tno(10).build();

        log.info(todoService.readOne(todoDTO));
    }

    @Test
    public void insertServiceTest(){
        TodoDTO todoDTO = TodoDTO.builder()
                .title("hihi")
                .writer("user1090")
                .memo("qweasdm")
                .dueDate(LocalDate.parse("2010-01-01"))
                .build();

        log.info(todoService.register(todoDTO));
    }
}
