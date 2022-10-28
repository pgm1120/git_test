package org.zerock.springboard.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
//    @Select("select now()")  // 쿼리문 작성가능 뒤에 세미콜론은 생략
//    String getTime();

    String getTime();


}
