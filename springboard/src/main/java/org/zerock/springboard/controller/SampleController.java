package org.zerock.springboard.controller;

import com.sun.tools.javac.comp.Todo;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.zerock.springboard.dto.PageResponseDTO;
import org.zerock.springboard.dto.TodoDTO;
import org.zerock.springboard.service.TodoService;

@RestController
@Log4j2
@RequiredArgsConstructor
public class SampleController {



    @GetMapping("/ex1")
    public String[] getArr() {

        return new String[]{"aaa", "bbb", "ccc"};
    }

    @PostMapping("/ex2")
    public String[] getArr2 (@RequestBody TodoDTO todoDTO){
        log.info(todoDTO);
        return new String[]{"aaa", "bbb", "ccc"};
    }

    @GetMapping("/exList")
    public PageResponseDTO<TodoDTO> getList() {

        return t

    }



}
