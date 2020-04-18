package com.shop.mbg.dao;

import com.shop.mbg.model.PsmBrand;
import com.shop.mbg.model.PsmBrandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PsmBrandMapper {
    long countByExample(PsmBrandExample example);

    int deleteByExample(PsmBrandExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PsmBrand record);

    int insertSelective(PsmBrand record);

    List<PsmBrand> selectByExample(PsmBrandExample example);

    PsmBrand selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PsmBrand record, @Param("example") PsmBrandExample example);

    int updateByExample(@Param("record") PsmBrand record, @Param("example") PsmBrandExample example);

    int updateByPrimaryKeySelective(PsmBrand record);

    int updateByPrimaryKey(PsmBrand record);
}