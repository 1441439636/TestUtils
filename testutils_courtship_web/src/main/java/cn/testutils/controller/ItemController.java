package cn.testutils.controller;

import cn.testutils.service.ISendPortService;
import cn.testutils.utils.ShopResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;


/**
 * Created by ZLS on 2017/11/15.
 */
@Controller
//@RequestMapping("itemController")
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
        sendPortService.print("99999999999999999");
        return ShopResult.ok(json);
    }
    @RequestMapping(value = "item/print")
    public String Print(HttpServletRequest request, Model model) {
        String json = ("{name:name1,age:123}");
        sendPortService.print(request.getParameter("id"));
        return "index";
    }
    @RequestMapping(value = "")
    public String Index(HttpServletRequest request, Model model) {
        String json = ("{name:name1,age:123}");
        sendPortService.print(request.getParameter("id"));
        return "index";
    }
    @RequestMapping(value = "login")
    public String login(HttpServletRequest request, Model model) {
        return "login";
    }
}
