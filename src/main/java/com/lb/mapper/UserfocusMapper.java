package com.lb.mapper;

import com.lb.entity.Userfocus;
import com.lb.entity.UserfocusExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserfocusMapper {
    long countByExample(UserfocusExample example);

    int deleteByExample(UserfocusExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Userfocus record);

    int insertSelective(Userfocus record);

    List<Userfocus> selectByExample(UserfocusExample example);

    Userfocus selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Userfocus record, @Param("example") UserfocusExample example);

    int updateByExample(@Param("record") Userfocus record, @Param("example") UserfocusExample example);

    int updateByPrimaryKeySelective(Userfocus record);

    int updateByPrimaryKey(Userfocus record);
}