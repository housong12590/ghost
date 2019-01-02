package com.spring.ghost.mapper;

import com.spring.ghost.model.Images;
import com.spring.ghost.model.ImagesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImagesMapper {
    int countByExample(ImagesExample example);

    int deleteByExample(ImagesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Images record);

    int insertSelective(Images record);

    List<Images> selectByExampleWithBLOBs(ImagesExample example);

    List<Images> selectByExample(ImagesExample example);

    Images selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Images record, @Param("example") ImagesExample example);

    int updateByExampleWithBLOBs(@Param("record") Images record, @Param("example") ImagesExample example);

    int updateByExample(@Param("record") Images record, @Param("example") ImagesExample example);

    int updateByPrimaryKeySelective(Images record);

    int updateByPrimaryKeyWithBLOBs(Images record);

    int updateByPrimaryKey(Images record);
}