package org.zerock.springboard.mapper;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.zerock.springboard.dto.PageRequestDTO;
import org.zerock.springboard.dto.TodoDTO;

import java.time.LocalDate;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {org.zerock.springboard.config.RootConfig.class})//배열임  // 패키지명 넣고 마지막에 .class붙이기
@Log4j2
public class TodoMapperTests {

    @Autowired(required = false)
    TodoMapper todoMapper;

    @Test
    public void selectAllTest(){

        log.info(todoMapper);
//        log.info(todoMapper.selectAll());

        PageRequestDTO pageRequestDTO = PageRequestDTO.builder()
                .page(2)
                .size(10)
                .build();
    }

    @Test
    public void insertTest(){
        TodoDTO todoDTO = TodoDTO.builder()
                .title("insert test title")
                .memo("insert test memo")
                .dueDate(LocalDate.parse("2010-01-01"))
                .build();

        log.info(todoMapper.insertBoard(todoDTO));
    }

    @Test
    public void updateTest(){
        TodoDTO todoDTO = TodoDTO.builder().
                tno(4).
                title("updatetest").
                memo("updatetest").
                dueDate(LocalDate.parse("2010-01-01")).
                complete(true).
                build();

        log.info(todoMapper.updateBoard(todoDTO));
        log.info(todoDTO);
    }

    @Test
    public void deleteTest(){

        TodoDTO todoDTO = TodoDTO.builder().
                        tno(2)
                        .build();
        log.info(todoMapper.deleteBoard(todoDTO));
    }


}
