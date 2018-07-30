package com.pancake.dao;

import com.pancake.pojo.TraQuality;
import com.pancake.pojo.TraQualityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TraQualityMapper {
    int countByExample(TraQualityExample example);

    int deleteByExample(TraQualityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TraQuality record);

    int insertSelective(TraQuality record);

    List<TraQuality> selectByExample(TraQualityExample example);

    TraQuality selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TraQuality record, @Param("example") TraQualityExample example);

    int updateByExample(@Param("record") TraQuality record, @Param("example") TraQualityExample example);

    int updateByPrimaryKeySelective(TraQuality record);

    int updateByPrimaryKey(TraQuality record);
}