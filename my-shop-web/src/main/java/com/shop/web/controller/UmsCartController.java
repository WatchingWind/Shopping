package com.shop.web.controller;

import com.shop.common.api.CommonResult;
import com.shop.mbg.model.User;
import com.shop.mbg.vo.UmsCartVo;
import com.shop.portal.redis.RedisService;
import com.shop.portal.service.UmsCartService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class UmsCartController {
    @Autowired
    UmsCartService umsCartService;
    @Autowired
    RedisService redisService;

    @RequestMapping("/userCart")
    @ResponseBody
    public CommonResult<List<UmsCartVo>> userCart(HttpServletRequest request) {
        //获取cookie中的token
        List<UmsCartVo> carts = umsCartService.cartInfo(request);
        if (carts == null) {
            return CommonResult.failed();
        }

       return CommonResult.success(carts);
    }


    @ApiOperation(value = "删除购物车中的指定商品",response = CommonResult.class)
    @RequestMapping("/delGoods")
    @ResponseBody
    public CommonResult delGoods(@RequestParam("uId") Long uId,
                                 @RequestParam("pId") Integer pId) {
        if (umsCartService.delGoods(uId, pId)) {  //其实这里接口暴露出来，是很容易使得顾客的购物车被恶意用户清空的，得看下别人的方案。
            return CommonResult.success("删除成功！");
        }
        return CommonResult.failed();
    }

    @ApiOperation("更改商品数量")
    @RequestMapping("/updateCount")
    @ResponseBody
    public CommonResult updateCount(@RequestParam("uId") Long uId,
                                    @RequestParam("pId") Integer pId,
                                    @RequestParam("num") Integer num) {
        if (umsCartService.setGoodsNumber(uId, pId, num)) {
            return CommonResult.success("数量更改成功");
        }

        return CommonResult.failed();
    }

    @ApiOperation(value = "商品数量")
    @RequestMapping("/goodsAmount")
    @ResponseBody
    public Integer getGoodsAmount(HttpServletRequest request) {
        String token  = umsCartService.getToken(request);

        if ( token== null ) {
            return 0;
        }
        User cur = redisService.get(token,User.class);
        int amount =  umsCartService.getGoodsAmount(cur.getuId());
        return amount;
    }



}
