package cn.testutils.controller;

import cn.testutils.utils.UtilResult;
import com.alibaba.dubbo.common.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by ZLS on 2017/11/15.
 */
@Controller("item")
public class ItemController {
    public ItemController() {
        System.out.println("--------------------------------    ItemController   --------------------------------  ");
    }

    @RequestMapping(value = "list")
    @ResponseBody
    public JSONObject getItemList(Integer page, Integer rows) {
        JSONObject jsonObject=new JSONObject();

        return JSONObject;
    }
    @RequestMapping(value = "list")
    @ResponseBody
    public JSONObject getItemList(Integer page, Integer rows) {
        JSONObject jsonObject=new JSONObject();

        return JSONObject;
    }
}
