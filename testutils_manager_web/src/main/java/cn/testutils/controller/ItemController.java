package cn.testutils.controller;

import cn.testutils.service.ISendPortService;
import cn.testutils.utils.ShopResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by ZLS on 2017/11/15.
 */
@Controller
public class ItemController {
    public ItemController() {
        System.out.println("--------------------------------    ItemController   --------------------------------  ");
    }

    @Autowired
    private ISendPortService sendPortService;

    @RequestMapping(value = "item/list")
    @ResponseBody
    public ShopResult getItemList(Integer page, Integer rows) {
        String json = ("{name:name1,age:123}");
        sendPortService.print("122456475768");
        return ShopResult.ok(json);
    }

}
