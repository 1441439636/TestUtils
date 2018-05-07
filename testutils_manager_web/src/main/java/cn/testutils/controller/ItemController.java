package cn.testutils.controller;

import cn.testutils.utils.UtilResult;
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

    @RequestMapping(value = "item/list")
    @ResponseBody
    public UtilResult getItemList(Integer page, Integer rows) {
        String json = ("{name:name1,age:123}");

        return UtilResult.ok(json);
    }

}
