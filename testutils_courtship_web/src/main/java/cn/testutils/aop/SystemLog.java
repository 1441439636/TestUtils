package cn.testutils.aop;

import java.lang.annotation.*;

/**
 * Created by ZLS on 2018/4/27.
 */
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface SystemLog {
    String module1()  default "";
    String module2()  default "";
}