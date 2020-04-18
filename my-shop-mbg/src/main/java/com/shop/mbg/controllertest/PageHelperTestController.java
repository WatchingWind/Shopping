///*
//package com.shop.mbg.controllertest;
//
//import com.shop.common.api.CommonPage;
//import com.shop.common.api.CommonResult;
//
//import com.github.pagehelper.Page;
//import com.github.pagehelper.PageHelper;
//import com.shop.mbg.dao.TestDao;
//import com.shop.mbg.model.Test;
//import com.shop.mbg.service.TestService;
//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//@Controller
//@RequestMapping("/pageHelper")
//public class PageHelperTestController {
//
//  @Autowired
//  TestService testDao;
//
//  @Autowired
//  TestDao testDao1;
//
//  @RequestMapping("/list")
//  @ResponseBody
//  public List<Test> list(@RequestParam(value = "pageNum",required = false,defaultValue = "1") int pageNum,
//                   @RequestParam(value = "pageSize",required = false,defaultValue = "5")  int pageSize) {
//    PageHelper.startPage(pageNum,pageSize);
//    Page<Test> page = testDao1.list();
//    return page;
//    //return CommonResult.success(CommonPage.restPage(result));
//  }
//
//  @RequestMapping("/list1")
//  @ResponseBody
//  public CommonResult list1(@RequestParam(value = "pageNum",required = false,defaultValue = "1") int pageNum,
//      @RequestParam(value = "pageSize",required = false,defaultValue = "5")  int pageSize) {
//    PageHelper.startPage(pageNum,pageSize);
//    List<Test> result = testDao.list();
//    return CommonResult.success(CommonPage.restPage(result));
//  }
//}
//*/
