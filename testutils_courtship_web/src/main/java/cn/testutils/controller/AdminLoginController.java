package cn.testutils.controller;

import cn.testutils.utils.ImageUtil;
import cn.testutils.utils.JSONUtils;
import cn.testutils.utils.UtilResult;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Map;

/**
 * Created by ZLS on 2018/5/7.
 */
@Controller
public class AdminLoginController {
    /**
     * 验证账户名是否存在
     * @param jsonString
     * @return
     */
    @RequestMapping(value = "admin/checkname", method = RequestMethod.POST)
    @ResponseBody
    public UtilResult AdminCheckName(@RequestBody String jsonString) {
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, String> maps = null;
        try {
            maps = objectMapper.readValue(JSONUtils.EndURLTOJSON(jsonString), Map.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (maps != null && maps.get("username").contains("name"))
            return UtilResult.ok();
        return UtilResult.build(400, "用户名不存在", null);
    }

    /**
     * 刷新验证码图片
     * @param request
     * @param response
     */
    @RequestMapping(value = "admin/changeimg", method = RequestMethod.GET)
    public void AdminChangeImg(HttpServletRequest request, HttpServletResponse response) {
        //生成验证码，写入用户session
        String verifyCode = ImageUtil.generateTextCode(ImageUtil.TYPE_NUM_UPPER, 4, "0oOilJI1");
        request.getSession().setAttribute(ImageUtil.VERIFY_TYPE_COMMENT, verifyCode);
        System.out.println("verifyCode=" + verifyCode);
        //输出验证码给客户端
        response.setContentType("image/jpeg");
                /*
                    textCode 文本验证码
                    width 图片宽度
                    height 图片高度
                    interLine 图片中干扰线的条数
                    randomLocation 每个字符的高低位置是否随机
                    backColor 图片颜色，若为null，则采用随机颜色
                    foreColor 字体颜色，若为null，则采用随机颜色
                    lineColor 干扰线颜色，若为null，则采用随机颜色
                */
        BufferedImage bim = ImageUtil.generateImageCode(verifyCode, 100, 40, 10, true, Color.WHITE, Color.BLACK, null);
        try {
            ImageIO.write(bim, "JPEG", response.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 验证code是否正确
     * @param jsonString
     * @param request
     * @return
     */
    @RequestMapping(value = "admin/checkimgcode", method = RequestMethod.POST)
    @ResponseBody
    public UtilResult AdminCheckImgCode(@RequestBody String jsonString, HttpServletRequest request) {
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, String> maps = null;
        try {
            maps = objectMapper.readValue(JSONUtils.EndURLTOJSON(jsonString), Map.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (maps.get("checkimgcode").equals(request.getSession().getAttribute(ImageUtil.VERIFY_TYPE_COMMENT)))
            return UtilResult.ok();
        return UtilResult.build(400, "用户名不存在", null);
    }
}
