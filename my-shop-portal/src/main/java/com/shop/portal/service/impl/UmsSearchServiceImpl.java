package com.shop.portal.service.impl;

import com.github.pagehelper.PageHelper;
import com.shop.common.api.CommonResult;
import com.shop.mbg.dao.PsmProductMapper;
import com.shop.mbg.model.PsmProduct;
import com.shop.mbg.model.PsmProductExample;
import com.shop.portal.service.UmsSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UmsSearchServiceImpl implements UmsSearchService {
    @Autowired
    PsmProductMapper psmProductMapper;

    @Override
    public List<PsmProduct> match(String keyWord, int pageNum, int pageSize) {
       // PageHelper.startPage(pageNum, pageSize);
        System.out.println("UmsSearchService:"+keyWord);
        return psmProductMapper.selectByAttribute(keyWord);
      //  return psmProductMapper.selectByExample()
    }
}
