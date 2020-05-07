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
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/search")
public class UmsSearchController {
    private static final String SEARCH_VAL = "searchVal";

    @Autowired
    UmsSearchService umsSearchService;

    //保存请求的搜索值到cookie中
    @RequestMapping("/keepVal")
    public String keepVal(@RequestParam(value = "keyWord", required = false,defaultValue = "") String keyWord, HttpServletResponse response) {
        Cookie cookie = new Cookie(SEARCH_VAL, keyWord);
        response.addCookie(cookie);
		return "/searchList.html";
    }

    @RequestMapping("/data")
    @ApiParam("0--> 数据为空  500-->成功")
    @ResponseBody  //返回为json数据时需要加 ResponseBody
    public CommonResult<List> match(@RequestParam(value = "pageSize", defaultValue = "5") int pageSize,
                                    @RequestParam(value = "pageNum", defaultValue = "1") int pageNum,
                                    HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        if (cookies == null || cookies.length == 0) {
            return CommonResult.failed("您的搜索条件不符合规则");
        }

        String keyWord = null;
        for (Cookie cookie : cookies) {
           if (cookie.getName().equals(SEARCH_VAL)) {
               keyWord =  cookie.getValue();
           }
        }


        List<PsmProduct> result = umsSearchService.match(keyWord, pageNum,pageSize);
       // return CommonResult.success()
        if(result == null || result.isEmpty()){
            return CommonResult.failed(ResultCode.EMPTY);
        }

        System.out.println(result);
        return CommonResult.success(result);
    }

}
