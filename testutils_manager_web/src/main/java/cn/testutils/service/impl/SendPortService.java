package cn.testutils.service.impl;

import cn.testutils.service.ISendPortService;
import org.springframework.stereotype.Service;

/**
 * Created by ZLS on 2018/3/29.
 */
@Service
public class SendPortService implements ISendPortService {
    @Override
    public void print(String s) {
        System.out.println("111111111111111111111111111111111");
        System.out.println(s);
        System.out.println("111111111111111111111111111111111");

    }
}
