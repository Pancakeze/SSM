package com.pancake.dao;

import com.pancake.pojo.TraQualityStandard;
import com.pancake.pojo.TraQualityStandardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TraQualityStandardMapper {
    int countByExample(TraQualityStandardExample example);

    int deleteByExample(TraQualityStandardExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TraQualityStandard record);

    int insertSelective(TraQualityStandard record);

    List<TraQualityStandard> selectByExample(TraQualityStandardExample example);

    TraQualityStandard selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TraQualityStandard record, @Param("example") TraQualityStandardExample example);

    int updateByExample(@Param("record") TraQualityStandard record, @Param("example") TraQualityStandardExample example);

    int updateByPrimaryKeySelective(TraQualityStandard record);

    int updateByPrimaryKey(TraQualityStandard record);
}