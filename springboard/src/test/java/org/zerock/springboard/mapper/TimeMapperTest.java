package org.zerock.springboard.mapper;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {org.zerock.springboard.config.RootConfig.class})//배열임  // 패키지명 넣고 마지막에 .class붙이기
@Log4j2
public class TimeMapperTest {

    @Autowired(required = false)
    TimeMapper timeMapper;


    @Test
    public void testTime() {

        log.info(timeMapper.getClass().getName());
        log.info(timeMapper.getTime());
        log.info(timeMapper);
    }
}
