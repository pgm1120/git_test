package org.zerock.springboard;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.zerock.springboard.dao.TodoDAO;
import org.zerock.springboard.service.TodoService;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {org.zerock.springboard.config.RootConfig.class})//배열임  // 패키지명 넣고 마지막에 .class붙이기
@Log4j2
public class ConfigTests {

    @Autowired
    TodoService service;

    @Autowired
    TodoDAO todoDAO;


    @Test
    public void test1(){
        Assertions.assertNotNull(service); //assert -> 확신한다   //따라서 null이 아니라는 것을 확신하는 코드
        Assertions.assertNotNull(todoDAO);

        log.info(service);
        log.info(todoDAO);
    }
}
