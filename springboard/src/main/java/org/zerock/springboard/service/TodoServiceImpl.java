package org.zerock.springboard.service;

import com.sun.tools.javac.comp.Todo;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.zerock.springboard.dao.TodoDAO;
import org.zerock.springboard.dto.PageRequestDTO;
import org.zerock.springboard.dto.PageResponseDTO;
import org.zerock.springboard.dto.TodoDTO;
import org.zerock.springboard.mapper.TodoMapper;

import java.util.List;

@Service
@RequiredArgsConstructor //자동 생성자 주입
@Log4j2
@ToString
public class TodoServiceImpl implements TodoService{
    private final TodoMapper todoMapper;

    @Override
    public int register(TodoDTO todoDTO) {
        int result = todoMapper.insertBoard(todoDTO);
        return 1;
    }

    @Override
    public List<TodoDTO> showAllList() {
        List<TodoDTO> list = todoMapper.selectAll();
        return list;
    }

    public PageResponseDTO<TodoDTO> getList(PageRequestDTO pageRequestDTO){
        List<TodoDTO> listWithPage = todoMapper.listPage(pageRequestDTO);
        int total = todoMapper.getTotal(pageRequestDTO);
        return new PageResponseDTO(pageRequestDTO ,total, listWithPage);
    }


    @Override
    public TodoDTO readOne(TodoDTO todoDTO) {
        TodoDTO readOne = todoMapper.selectOne(todoDTO);
        return readOne;
    }

    @Override
    public int modify(TodoDTO todoDTO) {
        int updateBoard = todoMapper.updateBoard(todoDTO);
        return updateBoard;
    }

    @Override
    public int remove(TodoDTO todoDTO) {
        int deleteBorad = todoMapper.deleteBoard(todoDTO);
        return deleteBorad;
    }

}
