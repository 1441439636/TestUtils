package cn.testutils.service;

import cn.testutils.service.impl.SendPortService;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by ZLS on 2018/4/27.
 */
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring/springmvc.xml"})
public class SendPortServiceTest {
    @Resource
    ISendPortService sendPortService;
    private static Logger logger = Logger.getLogger(SendPortServiceTest.class);

    @Before
    public void before() {
        logger.info("1");

//        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring/springmvc.xml");
//        sendPortService = (ISendPortService) ac.getBean("sendPortService");
        logger.info("2");
    }

    @Test
    public void print() {
        ISendPortService s = new SendPortService();
        s.print("1");
        sendPortService.print("xxxxxxxxxxxxxxxxx");

    }
}
