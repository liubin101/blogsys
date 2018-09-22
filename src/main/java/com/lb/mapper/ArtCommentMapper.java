package com.lb.mapper;

import com.lb.entity.ArtComment;
import com.lb.entity.ArtCommentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ArtCommentMapper {
    long countByExample(ArtCommentExample example);

    int deleteByExample(ArtCommentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ArtComment record);

    int insertSelective(ArtComment record);

    List<ArtComment> selectByExample(ArtCommentExample example);

    ArtComment selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ArtComment record, @Param("example") ArtCommentExample example);

    int updateByExample(@Param("record") ArtComment record, @Param("example") ArtCommentExample example);

    int updateByPrimaryKeySelective(ArtComment record);

    int updateByPrimaryKey(ArtComment record);
}