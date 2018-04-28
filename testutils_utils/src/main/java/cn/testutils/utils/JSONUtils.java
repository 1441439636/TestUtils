package cn.testutils.utils;

/**
 * Created by ZLS on 2018/3/28.
 * JSON transition
 */
public class JSONUtils {
    public static String JsonToEndURL(String json) {
        json = json.replaceAll(",", "&");
        return json.replaceAll(":", "=");
    }
    public static String EndURLTOJSON(String json) {
        json = json.replaceAll("&", "\",\"");
        return "{\""+json.replaceAll("=", "\":\"")+"\"}";
    }
}
