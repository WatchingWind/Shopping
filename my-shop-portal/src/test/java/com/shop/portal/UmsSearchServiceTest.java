package com.shop.portal;

import com.shop.mbg.dao.PsmProductMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class UmsSearchServiceTest {
    @Autowired
    PsmProductMapper psmProductMapper;


    @Test
    public void searchTest(){
        List  results = psmProductMapper.selectByAttribute("洗面奶");
        System.out.println(results);
//      System.out.println(psmProductMapper.selectByPrimaryKey(1));

    }
}
