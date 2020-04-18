package com.shop.web.controller;


import com.shop.common.api.CommonResult;
import com.shop.common.api.ResultCode;
import com.shop.mbg.model.PsmProduct;
import com.shop.portal.service.UmsSearchService;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/search")
public class UmsSearchController {

    @Autowired
    UmsSearchService umsSearchService;

    //保存请求的搜索值到cookie中
    @RequestMapping("/keepVal")
    public void keepVal(@RequestParam(value = "keyWord", required = false,defaultValue = "") String keyWord, HttpServletResponse response) {
        Cookie cookie = new Cookie("searchVal", keyWord);
        response.addCookie(cookie);
    }

    @RequestMapping("/data")
    @ApiParam("0--> 数据为空  500-->成功")
    public CommonResult<List> match(@RequestParam("keyWord") String keyWord,
                              @RequestParam(value = "pageSize", defaultValue = "5") int pageSize,
                              @RequestParam(value = "pageNum", defaultValue = "1") int pageNum

    ){
        if(keyWord == null || keyWord.trim().isEmpty()) {
            return CommonResult.failed("您的搜索条件不符合规则");
        }

        List<PsmProduct> result = umsSearchService.match(keyWord, pageNum,pageSize);
       // return CommonResult.success()
        if(result == null || result.isEmpty()){
            return CommonResult.failed(ResultCode.EMPTY);
        }

        return CommonResult.success(result);
    }

}
