package com.biostime.demo;


import com.itshaw.blog.Application;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class )
@Slf4j
public class CommonTest{
    @Before
    public void init(){
        log.info("init test ...");
    }
}
