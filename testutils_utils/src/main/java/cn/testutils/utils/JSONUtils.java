package cn.testutils.utils;

/**
 * Created by ZLS on 2018/3/28.
 * JSON transition
 */
public class JSONUtils {
    public String JsonToEndURL(String json) {
        json = json.replaceAll(",", "&");
        return json.replaceAll(":", "=");
    }
}
