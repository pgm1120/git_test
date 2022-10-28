package org.zerock.springboard.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.springboard.dto.TodoAddDTO;
import org.zerock.springboard.dto.TodoDTO;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/todo2")
@Log4j2
public class TodoValidController {
    /* 시나리오
    * regist (Post) 할 때 > /todo2 로 보내려고 함.
    *
    * regist action /todo2/register
    * input type datetime-local
    * */

    @PostMapping("/register")
    public String registerPOST(@Valid TodoAddDTO todoAddDTO, BindingResult bindingResult, RedirectAttributes redirectAttributes){

        log.info("------------------");
        log.info("------------------");
        log.info(todoAddDTO);
        log.info(bindingResult);
        if (bindingResult.hasErrors()){
            log.info("ERROR.......................");

            List<ObjectError> errorList = bindingResult.getAllErrors(); // List<ObjectError> 를 반환 함


            // 새로고침하면 ${errors} 가 보이지 않음
            redirectAttributes.addFlashAttribute("errors", errorList);  // Attribute 를 한 번만 쓸수 있게 해주는 함수

            return "redirect:/todo/register";
        }
        log.info("------------------");

        return "redirect:/todo/list";

    }
}
