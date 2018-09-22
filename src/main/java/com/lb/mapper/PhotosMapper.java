package com.lb.mapper;

import com.lb.entity.Photos;
import com.lb.entity.PhotosExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PhotosMapper {
    long countByExample(PhotosExample example);

    int deleteByExample(PhotosExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Photos record);

    int insertSelective(Photos record);

    List<Photos> selectByExample(PhotosExample example);

    Photos selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Photos record, @Param("example") PhotosExample example);

    int updateByExample(@Param("record") Photos record, @Param("example") PhotosExample example);

    int updateByPrimaryKeySelective(Photos record);

    int updateByPrimaryKey(Photos record);
}