package cn.testutils.controller;

import cn.testutils.service.IRRService;
import cn.testutils.service.ISendPortService;
import cn.testutils.utils.UtilResult;
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
    private IRRService irrService;
    @Autowired
    private ISendPortService sendPortService;

    @RequestMapping(value = "item/list")
    @ResponseBody
    public UtilResult getItemList(Integer page, Integer rows) {
        String json = ("{name:name1,age:123}");
        sendPortService.print("99999999999999999");
        irrService.Print("item/list");
        return UtilResult.ok(json);
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

    @RequestMapping(value = "userindex")
    public String userindex(HttpServletRequest request, Model model) {
        System.out.println("admin/userindex");
        return "admin/userindex";
    }

    @RequestMapping(value = "adminindex")
    public String adminindex(HttpServletRequest request, Model model) {
        System.out.println("admin/index");
        return "admin/index";
    }

    @RequestMapping(value = "admin/main")
    public String adminmain(HttpServletRequest request, Model model) {
        System.out.println("admin/main");
        return "admin/main";
    }

    @RequestMapping(value = "admin/center")
    public String admincenter(HttpServletRequest request, Model model) {
        System.out.println("admin/center");
        return "admin/center";
    }

    @RequestMapping(value = "admin/right")
    public String adminright(HttpServletRequest request, Model model) {
        System.out.println("admin/right");
        return "admin/right";
    }

    @RequestMapping(value = "admin/left")
    public String adminleft(HttpServletRequest request, Model model) {
        System.out.println("admin/left");
        return "admin/left";
    }

    @RequestMapping(value = "admin/top")
    public String admintop(HttpServletRequest request, Model model) {
        System.out.println("admin/top");
        return "admin/top";
    }

    @RequestMapping(value = "admin/down")
    public String admindown(HttpServletRequest request, Model model) {
        System.out.println("admin/down");
        return "admin/down";
    }

    @RequestMapping(value = "admin/login")
    public String adminlogin(HttpServletRequest request, Model model) {
        System.out.println("admin/login");
        return "admin/login";
    }
}
