package cn.testutils.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by ZLS on 2018/5/7.
 */
@Component
@Aspect
public class LoginAopAction {

    @Pointcut("execution(* cn.testutils.controller.AdminLoginController.* (..))")
    public void AdminLogin() {
    }
    @Around("AdminLogin()")
    public  void arount(ProceedingJoinPoint pjp){

    }
    @Before("AdminLogin()")
    public  void before(){

    }
    @After("AdminLogin()")
    public  void after(){

    }
    @AfterReturning("AdminLogin()")
    public  void afterReturning(){

    }
    @AfterThrowing("AdminLogin()")
    public  void throwException(){

    }
}
