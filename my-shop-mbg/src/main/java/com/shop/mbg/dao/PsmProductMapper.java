package com.shop.mbg.dao;

import com.shop.mbg.model.PsmProduct;
import com.shop.mbg.model.PsmProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PsmProductMapper {

    long countByExample(PsmProductExample example);

    int deleteByExample(PsmProductExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PsmProduct record);

    int insertSelective(PsmProduct record);

    List<PsmProduct> selectByExample(PsmProductExample example);
    List<PsmProduct> selectByAttribute(@Param("attributeVal") String attribute);
    PsmProduct selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PsmProduct record, @Param("example") PsmProductExample example);

    int updateByExample(@Param("record") PsmProduct record, @Param("example") PsmProductExample example);

    int updateByPrimaryKeySelective(PsmProduct record);

    int updateByPrimaryKey(PsmProduct record);
}