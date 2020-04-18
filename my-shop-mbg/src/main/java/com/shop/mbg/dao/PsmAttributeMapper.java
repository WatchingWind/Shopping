package com.shop.mbg.dao;

import com.shop.mbg.model.PsmAttribute;
import com.shop.mbg.model.PsmAttributeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PsmAttributeMapper {
    long countByExample(PsmAttributeExample example);

    int deleteByExample(PsmAttributeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PsmAttribute record);

    int insertSelective(PsmAttribute record);

    List<PsmAttribute> selectByExample(PsmAttributeExample example);

    PsmAttribute selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PsmAttribute record, @Param("example") PsmAttributeExample example);

    int updateByExample(@Param("record") PsmAttribute record, @Param("example") PsmAttributeExample example);

    int updateByPrimaryKeySelective(PsmAttribute record);

    int updateByPrimaryKey(PsmAttribute record);
}