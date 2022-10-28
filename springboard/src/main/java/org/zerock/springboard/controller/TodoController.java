package org.zerock.springboard.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.springboard.dao.TodoDAO;
import org.zerock.springboard.dto.PageRequestDTO;
import org.zerock.springboard.dto.PageResponseDTO;
import org.zerock.springboard.dto.TodoDTO;
import org.zerock.springboard.service.TodoService;

import java.util.List;
import java.util.function.Predicate;

@Controller
@RequestMapping("/todo")
@Log4j2
@RequiredArgsConstructor
public class TodoController {
    private final TodoService todoService;

    protected int getInt(String value, int defaultValue, Predicate<Integer> predicate){
        try {
            int intValue = Integer.parseInt(value);

            if(predicate != null) {
                boolean result = predicate.test(intValue);

                if (!result) {
                    return defaultValue;
                }
            }

            return intValue;
        }catch(Exception e){
            return defaultValue;
        }
    }



    @GetMapping("/list")
    public void list(PageRequestDTO pageRequestDTO, Model model){ //서버에서 얻은 데이터가 Model이라는 클래스에 담겨있따.
        log.info("list......................");

//        int page = getInt((String) model.getAttribute("page"), 1, (value) -> {
//            if(value < 0){
//                return false;
//            }else {
//                if(value > 100){
//                    return false;
//                }
//            }
//            return true;
//        });
//
//        int size = getInt((String)model.getAttribute("size"), 10, null);

//        List<TodoDTO> dtoList = todoService.getList(pageRequestDTO);
////        model.addAttribute("dtoList", dtoList);
//
//        PageResponseDTO responseDTO
//                = new PageResponseDTO(pageRequestDTO, todoService.getTotal(), dtoList);

        model.addAttribute("pageDTO", todoService.getList(pageRequestDTO));




    }

    @GetMapping("/read")
    public void read(TodoDTO todoDTO, Model model){
        log.info("read........................");

        TodoDTO readDTO = todoService.readOne(todoDTO);
        model.addAttribute("readDTO", todoService.readOne(todoDTO));

    }


    @GetMapping("/register")
    public void register(){
        log.info("register......................................");
        log.info("register......................................");
        log.info("register......................................");
    }

    @PostMapping("/register")
    public String registerPost(TodoDTO todoDTO, RedirectAttributes redirectAttributes){

         int result = todoService.register(todoDTO);
         if(result == 1) {
             redirectAttributes.addFlashAttribute("oper", "true");
         }

         if(result == 0){
             redirectAttributes.addFlashAttribute("oper" , "no");
         }

         return "redirect:/todo/list";

    }







}
