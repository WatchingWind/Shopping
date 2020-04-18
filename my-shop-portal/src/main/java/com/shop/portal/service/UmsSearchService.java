package com.shop.portal.service;

import com.shop.common.api.CommonResult;
import com.shop.mbg.model.PsmProduct;

import java.util.List;

public interface UmsSearchService {
   List<PsmProduct> match(String keyWord,int pageNum,int pageSize);
}
