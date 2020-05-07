package com.shop.web;

import com.shop.mbg.dao.PsmProductMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchTest {
   private static final Logger LOGGER = LoggerFactory.getLogger(SearchTest.class);

    @Autowired
    PsmProductMapper psmProductMapper;

    @Test
    public void test(){
        List results = psmProductMapper.selectByAttribute("洗面奶");
        System.out.println(results);
        LOGGER.info("wwww");
    }
}
