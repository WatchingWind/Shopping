package com.shop.mbg.dao;

import com.shop.mbg.model.PsmCategory;
import com.shop.mbg.model.PsmCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PsmCategoryMapper {
    long countByExample(PsmCategoryExample example);

    int deleteByExample(PsmCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PsmCategory record);

    int insertSelective(PsmCategory record);

    List<PsmCategory> selectByExample(PsmCategoryExample example);

    PsmCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PsmCategory record, @Param("example") PsmCategoryExample example);

    int updateByExample(@Param("record") PsmCategory record, @Param("example") PsmCategoryExample example);

    int updateByPrimaryKeySelective(PsmCategory record);

    int updateByPrimaryKey(PsmCategory record);
}