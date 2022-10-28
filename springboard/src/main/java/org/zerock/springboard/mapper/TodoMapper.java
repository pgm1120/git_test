package org.zerock.springboard.mapper;

import com.sun.tools.javac.comp.Todo;
import org.zerock.springboard.dto.PageRequestDTO;
import org.zerock.springboard.dto.PageResponseDTO;
import org.zerock.springboard.dto.TodoDTO;

import java.util.List;

public interface TodoMapper {


    List<TodoDTO> selectAll();  // mapper.xml id와 일치해야 한다

    int insertBoard(TodoDTO todoDTO);

    int deleteBoard(TodoDTO todoDTO);

    int updateBoard(TodoDTO todoDTO);

    TodoDTO selectOne(TodoDTO todoDTO);
//    List<TodoDTO> listPage(PageRequestDTO pageRequestDTO);

    List<TodoDTO> listPage(PageRequestDTO pageRequestDTO);
    int getTotal(PageRequestDTO pageRequestDTO);
}
