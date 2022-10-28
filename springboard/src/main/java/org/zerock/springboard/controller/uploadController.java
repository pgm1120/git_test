package org.zerock.springboard.controller;

import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@Log4j2
public class uploadController {

    @PostMapping("/upload")
    public String [] uploadAjax(MultipartFile[] files){
        log.info(files);
        return new String[]{"AAA", "BBBB", "CCCC"};
    }

}
