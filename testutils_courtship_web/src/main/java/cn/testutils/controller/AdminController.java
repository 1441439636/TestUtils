package cn.testutils.controller;

import cn.testutils.service.impl.SendPortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by ZLS on 2018/4/28.
 */
@Controller
public class AdminController {


    @Autowired
    private SendPortService sendPortService;


}
