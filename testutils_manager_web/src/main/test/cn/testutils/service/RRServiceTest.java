package cn.testutils.service;

import cn.testutils.service.impl.RRService;
import org.testng.annotations.Test;

/**
 * Created by ZLS on 2018/3/29.
 */
public class RRServiceTest {
    @Test
    public void fun() {
        IRRService irrService = new RRService();
        System.out.println(add(1, 2, 3));
        System.out.println(add(1, 2, 3, 4, 5));
        System.out.println(add(new int[]{1, 2, 3}));

    }

    public int add(int... data) {
        int sum = 0;
        for (int val : data                ) {
            sum += val;
        }
        return sum;
    }

}
