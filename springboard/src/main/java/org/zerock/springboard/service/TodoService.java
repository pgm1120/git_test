package org.zerock.springboard.service;

import org.zerock.springboard.dto.PageRequestDTO;
import org.zerock.springboard.dto.PageResponseDTO;
import org.zerock.springboard.dto.TodoDTO;

import java.util.List;

public interface TodoService {
    // service 에서 사용하는 용어 : DB의 용어 절대 사용금지.......... 고객의 용어를 사용 !!!!!!!!!!!!


    public List<TodoDTO> showAllList();
    public TodoDTO readOne(TodoDTO todoDTO);
    public int register(TodoDTO todoDTO);
    public int modify(TodoDTO todoDTO);
    public int remove(TodoDTO todoDTO);

    public List<TodoDTO> getList();

    PageRequestDTODTO<TodoDTO> getList(PageRequestDTO pageRequestDTO);
}
