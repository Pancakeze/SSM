package com.pancake.dao;

import com.pancake.pojo.TraLinks;
import com.pancake.pojo.TraLinksExample;
import java.util.List;

import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;

public interface TraLinksMapper {
    int countByExample(TraLinksExample example);

    int deleteByExample(TraLinksExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TraLinks record);

    int insertSelective(TraLinks record);

    @Options(useCache = true)
    List<TraLinks> selectByExample(TraLinksExample example);

    TraLinks selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TraLinks record, @Param("example") TraLinksExample example);

    int updateByExample(@Param("record") TraLinks record, @Param("example") TraLinksExample example);

    int updateByPrimaryKeySelective(TraLinks record);

    int updateByPrimaryKey(TraLinks record);
}